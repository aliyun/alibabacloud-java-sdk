// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSNativeclusterRequest extends TeaModel {
    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ListAKSNativeclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAKSNativeclusterRequest self = new ListAKSNativeclusterRequest();
        return TeaModel.build(map, self);
    }

    public ListAKSNativeclusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
