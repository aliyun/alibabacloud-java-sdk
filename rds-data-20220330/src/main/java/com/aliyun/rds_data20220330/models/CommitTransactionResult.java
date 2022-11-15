// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class CommitTransactionResult extends TeaModel {
    @NameInMap("TransactionStatus")
    public String transactionStatus;

    public static CommitTransactionResult build(java.util.Map<String, ?> map) throws Exception {
        CommitTransactionResult self = new CommitTransactionResult();
        return TeaModel.build(map, self);
    }

    public CommitTransactionResult setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }
    public String getTransactionStatus() {
        return this.transactionStatus;
    }

}
