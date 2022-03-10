// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUserRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateWorkspaceUserRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceUserRoleResponseBody self = new UpdateWorkspaceUserRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceUserRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkspaceUserRoleResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public UpdateWorkspaceUserRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
