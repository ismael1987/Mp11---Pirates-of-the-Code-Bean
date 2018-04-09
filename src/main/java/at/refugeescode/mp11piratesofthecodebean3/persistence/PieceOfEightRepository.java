package at.refugeescode.mp11piratesofthecodebean3.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PieceOfEightRepository extends JpaRepository<PieceOfEight,Long>{

    Optional<PieceOfEight> findByName(String name);
}


