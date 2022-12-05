package com.bsm.backend.apis.order1;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "order1")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order1 {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "customer_name")
    private String customer_name;
}
