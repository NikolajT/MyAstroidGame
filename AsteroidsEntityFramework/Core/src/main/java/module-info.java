module Core {
    requires Common;
    requires CommonBullet;
    requires CommonAsteroids;

    requires com.badlogic.gdx;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    exports dk.sdu.mmmi.cbse.main;
    opens dk.sdu.mmmi.cbse.main;
    uses dk.sdu.mmmi.cbse.common.services.IGamePluginService;
    uses dk.sdu.mmmi.cbse.common.services.IEntityProcessingService;
    uses dk.sdu.mmmi.cbse.common.services.IPostEntityProcessingService;
}


