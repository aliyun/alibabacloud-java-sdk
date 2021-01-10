// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLDCAppopsRequest extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("Reason")
    public String reason;

    public static CancelLDCAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLDCAppopsRequest self = new CancelLDCAppopsRequest();
        return TeaModel.build(map, self);
    }

    public CancelLDCAppopsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public CancelLDCAppopsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
