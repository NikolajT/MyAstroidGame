package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IGamePluginService {
    /**
     * start-method Precondition: gameData and world |=null
     * Postcondition: IGamePluginService is started with the provided gameData and world
     * **/
    void start(GameData gameData, World world);
    /**
     * stop-method Precondition: gameData and world |=null
     * Postcondition: IGamePluginService is stopped and no longer running with gameData and world. Resources are freed/released
     * **/
    void stop(GameData gameData, World world);
}
