// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentTargetV2Headers extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a14bd5d90a****</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static UpdateDeploymentTargetV2Headers build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentTargetV2Headers self = new UpdateDeploymentTargetV2Headers();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentTargetV2Headers setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateDeploymentTargetV2Headers setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
