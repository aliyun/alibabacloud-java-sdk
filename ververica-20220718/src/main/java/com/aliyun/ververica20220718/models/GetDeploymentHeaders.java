// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetDeploymentHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentHeaders self = new GetDeploymentHeaders();
        return TeaModel.build(map, self);
    }

    public GetDeploymentHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetDeploymentHeaders setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
