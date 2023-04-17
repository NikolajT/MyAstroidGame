package dk.sdu.mmmi.cbse.common.services;

import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;

/**
 *
 *Postconditions: After the process-method has been executed gameData and world parameters have been modified
 */
public interface IPostEntityProcessingService  {
        void process(GameData gameData, World world);
}
