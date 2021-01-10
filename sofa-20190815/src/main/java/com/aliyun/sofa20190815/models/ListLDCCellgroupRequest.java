// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCCellgroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ListLDCCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLDCCellgroupRequest self = new ListLDCCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public ListLDCCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLDCCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
