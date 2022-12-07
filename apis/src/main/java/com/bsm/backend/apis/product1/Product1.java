package com.bsm.backend.apis.product1;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product1")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product1 {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "name")
    private String name;
}
