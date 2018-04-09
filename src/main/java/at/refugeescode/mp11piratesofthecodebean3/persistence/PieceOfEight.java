package at.refugeescode.mp11piratesofthecodebean3.persistence;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PieceOfEight {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public PieceOfEight() {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PieceOfEight{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
