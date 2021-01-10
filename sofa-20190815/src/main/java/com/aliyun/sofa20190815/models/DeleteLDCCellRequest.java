// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCCellRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static DeleteLDCCellRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCCellRequest self = new DeleteLDCCellRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLDCCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteLDCCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public DeleteLDCCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
