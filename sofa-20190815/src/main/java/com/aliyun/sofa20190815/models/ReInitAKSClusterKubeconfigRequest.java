// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReInitAKSClusterKubeconfigRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    public static ReInitAKSClusterKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ReInitAKSClusterKubeconfigRequest self = new ReInitAKSClusterKubeconfigRequest();
        return TeaModel.build(map, self);
    }

    public ReInitAKSClusterKubeconfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
