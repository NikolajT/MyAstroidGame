package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

public interface IEntityProcessingService {
    /**
     * Precondition: gameData and world passed to the process-method is valid and not null
     * @param gameData
     * @param world
     *
     *
     * Postcondition: gameData and world are updated with the result of the process-method
     */
    void process(GameData gameData, World world);
}
