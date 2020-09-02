// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ActiveFlowLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    public static ActiveFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        ActiveFlowLogResponse self = new ActiveFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public ActiveFlowLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActiveFlowLogResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
