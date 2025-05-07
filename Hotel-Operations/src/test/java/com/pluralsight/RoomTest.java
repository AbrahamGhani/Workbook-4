package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class RoomTest {

    @Test
    void testCheckInOnAvailableRoom() {
        //arrange
        Room room = new Room(2, 100.0, false, false, true); // not occupied, not dirty
        //act
        room.checkIn();
        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());

    }

    @Test
    void testCheckOutFromOccupiedRoom() {
        // Arrange
        Room room = new Room(2, 100.0, true, true, false); // occupied and dirty

        // Act
        room.checkOut();

        // Assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty()); // Should remain dirty
        assertFalse(room.isAvailable()); // Not available until cleaned
    }

    @Test
    void testCleanRoomWhenNotOccupied() {
        // Arrange
        Room room = new Room(2, 100.0, false, true, false); // dirty, not occupied

        // Act
        room.cleanRoom();

        // Assert
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }
}