// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateCommandResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>72893434</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3435676586</p>
     */
    @NameInMap("ToolId")
    public String toolId;

    public static CreateCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandResponseBody self = new CreateCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommandResponseBody setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public CreateCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommandResponseBody setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

}
