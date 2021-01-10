// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCCellgroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static DeleteLDCCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCCellgroupRequest self = new DeleteLDCCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLDCCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLDCCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
