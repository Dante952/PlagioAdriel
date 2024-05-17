package com.nttdata.proyecto.customer.domain.dto.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "T_DOCUMENT_TYPE")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocumentTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="DOCUMENT_NAME", nullable=false, length=30)
    private String  documentName;

    @Column(name="DOCUMENT_DESCRIPTION", nullable=false, length=255)
    private String  documentDescription;

}
