// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCClusterInfoRequest extends TeaModel {
    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ListLDCClusterInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCClusterInfoRequest self = new ListLDCClusterInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCClusterInfoRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
