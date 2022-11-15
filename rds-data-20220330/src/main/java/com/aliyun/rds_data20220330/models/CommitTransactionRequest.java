// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds_data20220330.models;

import com.aliyun.tea.*;

public class CommitTransactionRequest extends TeaModel {
    @NameInMap("ResourceArn")
    public String resourceArn;

    @NameInMap("SecretArn")
    public String secretArn;

    @NameInMap("TransactionId")
    public String transactionId;

    public static CommitTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitTransactionRequest self = new CommitTransactionRequest();
        return TeaModel.build(map, self);
    }

    public CommitTransactionRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public CommitTransactionRequest setSecretArn(String secretArn) {
        this.secretArn = secretArn;
        return this;
    }
    public String getSecretArn() {
        return this.secretArn;
    }

    public CommitTransactionRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
