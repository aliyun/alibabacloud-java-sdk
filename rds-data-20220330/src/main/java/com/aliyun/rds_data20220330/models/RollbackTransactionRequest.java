// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class RollbackTransactionRequest extends TeaModel {
    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("TransactionId")
    public String transactionId;

    public static RollbackTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackTransactionRequest self = new RollbackTransactionRequest();
        return TeaModel.build(map, self);
    }

    public RollbackTransactionRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public RollbackTransactionRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public RollbackTransactionRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
