// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCUnifiedAccessInstanceRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static QueryLDCUnifiedAccessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCUnifiedAccessInstanceRequest self = new QueryLDCUnifiedAccessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryLDCUnifiedAccessInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public QueryLDCUnifiedAccessInstanceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
