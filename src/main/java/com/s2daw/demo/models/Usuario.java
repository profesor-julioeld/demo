package com.s2daw.demo.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="usuarios")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Usuario {
    @Id
    // Version para MariaDB
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name="USUARIO_ID_GENERATOR", sequenceName="SEQ_USUARIO_ID",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUARIO_ID_GENERATOR")
    Long id;
    String nombre;
    String apellidos;
    String email;
    String telefono;
    @Column(name="password")
    String password;
    // Aunque Lombok puede generar equals & hashcode, no es recommendable
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Usuario usuario = (Usuario) o;
        return id != null && Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
