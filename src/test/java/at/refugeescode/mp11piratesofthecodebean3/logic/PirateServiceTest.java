package at.refugeescode.mp11piratesofthecodebean3.logic;

import at.refugeescode.mp11piratesofthecodebean3.persistence.Pirate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PirateServiceTest {

        @Autowired
    private PirateService pirateService;

    @BeforeEach
    void before() {
        pirateService.deleteAll();
    }

    @Test
    void populatePirates() {
        List<Pirate> pirates = pirateService.findAll();
        assertTrue(pirates.isEmpty());

        pirateService.populatePirates();

        pirates = pirateService.findAll();
        assertFalse(pirates.isEmpty());
        assertEquals(9, pirates.size());
    }

    @Test
    void findAll() {
        List<Pirate> pirates = pirateService.findAll();
        assertTrue(pirates.isEmpty());
    }
}