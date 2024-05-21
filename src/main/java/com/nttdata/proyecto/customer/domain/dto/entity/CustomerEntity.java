package com.nttdata.proyecto.customer.domain.dto.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "T_CUSTOMER")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCUMENT_TYPE_ID")
    private DocumentTypeEntity  documentType;

    @Column(name="DOCUMENT", nullable=false, length=30)
    private String  document;

    @Column(name="FIRST_NAME", nullable=false, length=255)
    private String  firstName;

    @Column(name="LAST_NAME", nullable=false, length=255)
    private String  lastName;


    @Column(name="CREATED", nullable=false, length=255)
    private LocalDate dateCreated;

}
