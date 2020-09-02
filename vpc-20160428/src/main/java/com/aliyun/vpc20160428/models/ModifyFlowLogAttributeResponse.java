// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyFlowLogAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    public static ModifyFlowLogAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowLogAttributeResponse self = new ModifyFlowLogAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFlowLogAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFlowLogAttributeResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
