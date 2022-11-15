// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class BeginTransactionResult extends TeaModel {
    @NameInMap("TransactionId")
    public String transactionId;

    public static BeginTransactionResult build(java.util.Map<String, ?> map) throws Exception {
        BeginTransactionResult self = new BeginTransactionResult();
        return TeaModel.build(map, self);
    }

    public BeginTransactionResult setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
