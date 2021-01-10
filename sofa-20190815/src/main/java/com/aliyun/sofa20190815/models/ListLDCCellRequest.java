// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCCellRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ListLDCCellRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCCellRequest self = new ListLDCCellRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLDCCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
