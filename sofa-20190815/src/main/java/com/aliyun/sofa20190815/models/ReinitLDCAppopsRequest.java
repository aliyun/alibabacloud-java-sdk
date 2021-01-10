// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitLDCAppopsRequest extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    public static ReinitLDCAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitLDCAppopsRequest self = new ReinitLDCAppopsRequest();
        return TeaModel.build(map, self);
    }

    public ReinitLDCAppopsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
