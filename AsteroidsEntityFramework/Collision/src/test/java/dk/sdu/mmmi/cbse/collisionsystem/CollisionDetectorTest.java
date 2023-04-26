package dk.sdu.mmmi.cbse.collisionsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollisionDetectorTest {
    @BeforeEach
    void setUp() {


    }

    @AfterEach
    void tearDown() {
        System.out.println("Test complete after each");
    }

    @Test
    public void collides() {

        Entity entity1 = new Entity();
        entity1.setRadius(5);
        PositionPart positionPart1 = new PositionPart(20, 20, 0);
        entity1.add(positionPart1);

        Entity entity2 = new Entity();
        entity2.setRadius(5);
        PositionPart positionPart2 = new PositionPart(25, 25, 0);
        entity2.add(positionPart2);

        Entity entity3 = new Entity();
        entity3.setRadius(5);
        PositionPart positionPart3 = new PositionPart(100, 100, 0);
        entity3.add(positionPart3);

        Entity entity4 = new Entity();
        entity4.setRadius(5);
        PositionPart positionPart4 = new PositionPart(20, 20, 0);
        entity4.add(positionPart4);

        /* Ved siden af hinanden */
        CollisionDetector collisionDetector = new CollisionDetector();
        Boolean resultTrue = collisionDetector.collides(entity1, entity2);
        /* Langt fra hinanden */
        CollisionDetector collisionDetector2 = new CollisionDetector();
        Boolean resultFalse = collisionDetector2.collides(entity1, entity3);

        /* Samme position */
        CollisionDetector collisionDetector3 = new CollisionDetector();
        Boolean resultTrue2 = collisionDetector3.collides(entity1, entity4);

        assertTrue(resultTrue);
        assertFalse(resultFalse);
        assertTrue(resultTrue2);
    }
}