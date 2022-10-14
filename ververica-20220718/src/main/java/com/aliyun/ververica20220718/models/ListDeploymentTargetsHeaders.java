// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListDeploymentTargetsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("workspace")
    public String workspace;

    public static ListDeploymentTargetsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentTargetsHeaders self = new ListDeploymentTargetsHeaders();
        return TeaModel.build(map, self);
    }

    public ListDeploymentTargetsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListDeploymentTargetsHeaders setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
