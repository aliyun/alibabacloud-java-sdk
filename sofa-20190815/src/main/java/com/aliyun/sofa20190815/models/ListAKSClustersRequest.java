// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSClustersRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    public static ListAKSClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAKSClustersRequest self = new ListAKSClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListAKSClustersRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
