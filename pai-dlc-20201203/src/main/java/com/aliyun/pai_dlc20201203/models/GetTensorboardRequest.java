// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTensorboardRequest extends TeaModel {
    /**
     * <p>The job ID. For more information about how to query the job ID, see <a href="https://help.aliyun.com/document_detail/459676.html">ListJob</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dlc-xxxxxxxx</p>
     */
    @NameInMap("JodId")
    public String jodId;

    /**
     * <p>The information about the shared token. You can specify this parameter to obtain the permission to view a TensorBoard job based on the shared token information. You can execute <a href="https://help.aliyun.com/document_detail/2557813.html">GetTensorboardSharedUrl</a> and extract the shared token from the obtained information.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.e
     * yJleHAiOjE2OTUyODA0NTMsImlhdCI6MTY5NTE5NDA1MywidXNlcl9pZCI6IjExN
     * Tc3MDMyNzA5OTQ5MDEiLCJ0YXJnZXRfaWQiOiJ0YjRrOGxjNXhmdTM2b3B0Iiw
     * idGFyZ2V0X3R5cGUiOiJ0ZW5zb3Jib2FyZCJ9.6eT68J-KMBwwfN2d7fj7u6vyPcf0erfqYeizd2N****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The workspace ID. 
     * &lt;props=&quot;china&quot;&gt;For more information about how to query the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>46099</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetTensorboardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTensorboardRequest self = new GetTensorboardRequest();
        return TeaModel.build(map, self);
    }

    public GetTensorboardRequest setJodId(String jodId) {
        this.jodId = jodId;
        return this;
    }
    public String getJodId() {
        return this.jodId;
    }

    public GetTensorboardRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetTensorboardRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
