// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeployDeploymentDraftResultHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>710d6a64d8****</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetDeployDeploymentDraftResultHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDeployDeploymentDraftResultHeaders self = new GetDeployDeploymentDraftResultHeaders();
        return TeaModel.build(map, self);
    }

    public GetDeployDeploymentDraftResultHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDeployDeploymentDraftResultHeaders setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
