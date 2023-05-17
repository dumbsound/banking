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
import java.time.LocalDateTime;

@Data
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@ToString @EqualsAndHashCode
@Entity
@Table(name= "transaction")
public class Transaction implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(Transaction.class);

    private static final long serialVersionUID = 4489471031011350521L;

    @Nonnull @Column(name="amount")
    private String amount;
    @Nonnull @Column(name="source_account_id")
    private String sourceAccountId;
    @Nonnull @Column(name="target_account_id")
    private String targetAccountId;
    @Nonnull @Column(name="transacted_time")
    private LocalDateTime transactedTime;
    @Id
    @Nonnull @Column(name="reference_id")
    private String referenceId;
}
