package artjom;

import net.minecraft.client.Minecraft;

public class MoveUtils {
	
	public static void setSpeed(double speed) {
		double yaw = Minecraft.getMinecraft().thePlayer.rotationYaw;
		boolean isMoving = Minecraft.getMinecraft().thePlayer.moveForward != 0
				|| Minecraft.getMinecraft().thePlayer.moveStrafing != 0;
		boolean isMovingForward = Minecraft.getMinecraft().thePlayer.moveForward > 0;
		boolean isMovingBackward = Minecraft.getMinecraft().thePlayer.moveForward < 0;
		boolean isMovingRight = Minecraft.getMinecraft().thePlayer.moveStrafing > 0;
		boolean isMovingLeft = Minecraft.getMinecraft().thePlayer.moveStrafing < 0;
		boolean isMovingSideways = isMovingLeft || isMovingRight;
		boolean isMovingStraight = isMovingForward || isMovingBackward;
		if (isMoving) {
			if (isMovingForward && !isMovingSideways) {
				yaw += 0;
			} else if (isMovingBackward && !isMovingSideways) {
				yaw += 180;
			} else if (isMovingForward && isMovingLeft) {
				yaw += 45;
			} else if (isMovingForward) {
				yaw -= 45;
			} else if (!isMovingStraight && isMovingLeft) {
				yaw += 90;
			} else if (!isMovingStraight && isMovingRight) {
				yaw -= 90;
			} else if (isMovingBackward && isMovingLeft) {
				yaw += 135;
			} else if (isMovingBackward) {
				yaw -= 135;
			}

			yaw = Math.toRadians(yaw);
			Minecraft.getMinecraft().thePlayer.motionX = -Math.sin(yaw) * speed;
			Minecraft.getMinecraft().thePlayer.motionZ = Math.cos(yaw) * speed;
		}

	}
	
}