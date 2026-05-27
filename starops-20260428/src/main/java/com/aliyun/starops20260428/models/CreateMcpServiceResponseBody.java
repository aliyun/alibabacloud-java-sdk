// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateMcpServiceResponseBody extends TeaModel {
    @NameInMap("mcpServiceName")
    public String mcpServiceName;

    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMcpServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpServiceResponseBody self = new CreateMcpServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcpServiceResponseBody setMcpServiceName(String mcpServiceName) {
        this.mcpServiceName = mcpServiceName;
        return this;
    }
    public String getMcpServiceName() {
        return this.mcpServiceName;
    }

    public CreateMcpServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
