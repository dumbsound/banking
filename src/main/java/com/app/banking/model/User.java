package com.app.banking.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

@Data
@Getter @Setter
@EqualsAndHashCode @ToString
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="user_list")
public class User implements Serializable {

    private static final long serialVersionUID= -5023242037893805512L;

    private static final Logger log= LoggerFactory.getLogger(User.class);

    @Id
    @Nonnull @Column(name="name_first")
    private String nameFirst;
    @Nonnull @Column(name="name_last")
    private String nameLast;
    @Nonnull @Column(name="account_no")
    private String accountNo;
    @Nonnull @Column(name="id")
    private String id;
    @Nonnull @Column(name="email_add")
    private String emailAdd;
    @Nonnull @Column(name="mobile_no")
    private String mobileNo;
    @Nonnull @Column(name="current_balance")
    private String current_balance;


}
