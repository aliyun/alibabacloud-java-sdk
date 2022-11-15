// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class RollbackTransactionResult extends TeaModel {
    @NameInMap("TransactionStatus")
    public String transactionStatus;

    public static RollbackTransactionResult build(java.util.Map<String, ?> map) throws Exception {
        RollbackTransactionResult self = new RollbackTransactionResult();
        return TeaModel.build(map, self);
    }

    public RollbackTransactionResult setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }
    public String getTransactionStatus() {
        return this.transactionStatus;
    }

}
