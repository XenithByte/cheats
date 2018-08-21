if (mc.thePlayer.hurtTime > 0) {
				mc.gameSettings.keyBindJump.pressed = false;
				float yaw = (float) Math.toRadians(mc.thePlayer.rotationYaw);

				double mX = Math.sin(yaw) * 0.10000000149011612D;
				double mZ = Math.cos(yaw) * 0.10000000149011612D;

				mc.thePlayer.motionX -= mX;
				mc.thePlayer.motionZ += mZ;

				mc.thePlayer.motionX *= 0.10000000149011612D;
				mc.thePlayer.motionZ *= 0.10000000149011612D;
			}