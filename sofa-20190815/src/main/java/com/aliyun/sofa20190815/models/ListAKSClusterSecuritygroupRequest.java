// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSClusterSecuritygroupRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    public static ListAKSClusterSecuritygroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAKSClusterSecuritygroupRequest self = new ListAKSClusterSecuritygroupRequest();
        return TeaModel.build(map, self);
    }

    public ListAKSClusterSecuritygroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
