// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class CreateTransactionRequest extends TeaModel {
    @NameInMap("ScriptId")
    public Integer scriptId;

    @NameInMap("TransactionName")
    public String transactionName;

    public static CreateTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransactionRequest self = new CreateTransactionRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransactionRequest setScriptId(Integer scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public Integer getScriptId() {
        return this.scriptId;
    }

    public CreateTransactionRequest setTransactionName(String transactionName) {
        this.transactionName = transactionName;
        return this;
    }
    public String getTransactionName() {
        return this.transactionName;
    }

}
