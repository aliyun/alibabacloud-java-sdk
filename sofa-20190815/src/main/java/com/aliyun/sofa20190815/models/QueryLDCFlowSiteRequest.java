// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFlowSiteRequest extends TeaModel {
    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static QueryLDCFlowSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFlowSiteRequest self = new QueryLDCFlowSiteRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCFlowSiteRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
