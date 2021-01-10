// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXTransactionSagaRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TxId")
    public String txId;

    public static GetDTXTransactionSagaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDTXTransactionSagaRequest self = new GetDTXTransactionSagaRequest();
        return TeaModel.build(map, self);
    }

    public GetDTXTransactionSagaRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDTXTransactionSagaRequest setTxId(String txId) {
        this.txId = txId;
        return this;
    }
    public String getTxId() {
        return this.txId;
    }

}
