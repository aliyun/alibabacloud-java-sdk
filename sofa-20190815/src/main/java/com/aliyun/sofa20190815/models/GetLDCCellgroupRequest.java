// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCCellgroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static GetLDCCellgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLDCCellgroupRequest self = new GetLDCCellgroupRequest();
        return TeaModel.build(map, self);
    }

    public GetLDCCellgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLDCCellgroupRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
