// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserFromWorkspaceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DC4E1E63-B337-44F8-8C22-6F00DF67E2C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returns the result of the API execution. Possible values:</p>
     * <ul>
     * <li>true: Execution succeeded</li>
     * <li>false: Execution failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>Indicates whether the request was successful. Value range:</p>
     * <ul>
     * <li>true: The request succeeded - false: The request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteUserFromWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserFromWorkspaceResponseBody self = new DeleteUserFromWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserFromWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteUserFromWorkspaceResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public DeleteUserFromWorkspaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
