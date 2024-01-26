// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class CreateTransactionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransactionId")
    public Integer transactionId;

    public static CreateTransactionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTransactionResponseBody self = new CreateTransactionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTransactionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransactionResponseBody setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public Integer getTransactionId() {
        return this.transactionId;
    }

}
