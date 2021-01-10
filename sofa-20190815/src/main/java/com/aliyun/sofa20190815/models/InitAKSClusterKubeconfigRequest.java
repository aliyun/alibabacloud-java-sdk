// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class InitAKSClusterKubeconfigRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    public static InitAKSClusterKubeconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAKSClusterKubeconfigRequest self = new InitAKSClusterKubeconfigRequest();
        return TeaModel.build(map, self);
    }

    public InitAKSClusterKubeconfigRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
