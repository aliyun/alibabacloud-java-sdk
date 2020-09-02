// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeactiveFlowLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    public static DeactiveFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DeactiveFlowLogResponse self = new DeactiveFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public DeactiveFlowLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeactiveFlowLogResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
