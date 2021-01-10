// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartLDCAppopsRequest extends TeaModel {
    @NameInMap("OperationId")
    public String operationId;

    public static StartLDCAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLDCAppopsRequest self = new StartLDCAppopsRequest();
        return TeaModel.build(map, self);
    }

    public StartLDCAppopsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
