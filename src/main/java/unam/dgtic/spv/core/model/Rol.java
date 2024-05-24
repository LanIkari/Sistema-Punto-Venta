package unam.dgtic.spv.core.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "rol")
public class Rol {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", columnDefinition = "bigint", nullable = false, updatable = false)
    private Integer Id;
    @Column(name = "nombre", columnDefinition = "varchar(30)", length = 30, nullable = false)
    private String nombre;
    @Column(name = "descripcion")
    @Size(max = 255, message = "La descripción no debe exceder los 255 caracteres.")
    private String descripcion;
}
