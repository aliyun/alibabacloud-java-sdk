// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAgentlessScanTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAgentlessScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentlessScanTaskResponseBody self = new CreateAgentlessScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentlessScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
