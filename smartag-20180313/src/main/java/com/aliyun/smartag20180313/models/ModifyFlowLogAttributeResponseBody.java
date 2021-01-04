// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyFlowLogAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyFlowLogAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowLogAttributeResponseBody self = new ModifyFlowLogAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowLogAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
