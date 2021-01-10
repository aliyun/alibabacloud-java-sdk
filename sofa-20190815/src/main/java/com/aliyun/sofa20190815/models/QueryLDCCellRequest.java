// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCCellRequest extends TeaModel {
    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static QueryLDCCellRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCCellRequest self = new QueryLDCCellRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCCellRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
