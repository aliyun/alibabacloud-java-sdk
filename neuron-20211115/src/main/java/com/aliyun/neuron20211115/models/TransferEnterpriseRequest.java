// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class TransferEnterpriseRequest extends TeaModel {
    @NameInMap("body")
    public EnterpriseTransferCmd body;

    public static TransferEnterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferEnterpriseRequest self = new TransferEnterpriseRequest();
        return TeaModel.build(map, self);
    }

    public TransferEnterpriseRequest setBody(EnterpriseTransferCmd body) {
        this.body = body;
        return this;
    }
    public EnterpriseTransferCmd getBody() {
        return this.body;
    }

}
