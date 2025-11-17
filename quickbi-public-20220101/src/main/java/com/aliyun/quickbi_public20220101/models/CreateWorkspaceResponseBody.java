// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>685072****************4e79e718f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12423twfasva********</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponseBody self = new CreateWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkspaceResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public CreateWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
