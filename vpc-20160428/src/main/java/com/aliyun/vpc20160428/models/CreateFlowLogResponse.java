// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFlowLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("FlowLogId")
    @Validation(required = true)
    public String flowLogId;

    public static CreateFlowLogResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogResponse self = new CreateFlowLogResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowLogResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public CreateFlowLogResponse setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

}
