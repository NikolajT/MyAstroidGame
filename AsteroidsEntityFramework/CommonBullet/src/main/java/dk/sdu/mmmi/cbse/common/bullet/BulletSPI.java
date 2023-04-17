package dk.sdu.mmmi.cbse.common.bullet;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;

//defines the contract for the BulletSPI
public interface BulletSPI {
    Entity createBullet(Entity e, GameData gameData);
}
