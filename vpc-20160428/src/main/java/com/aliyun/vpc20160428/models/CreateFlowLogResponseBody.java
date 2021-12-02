// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFlowLogResponseBody extends TeaModel {
    @NameInMap("FlowLogId")
    public String flowLogId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static CreateFlowLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogResponseBody self = new CreateFlowLogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowLogResponseBody setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public CreateFlowLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowLogResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
