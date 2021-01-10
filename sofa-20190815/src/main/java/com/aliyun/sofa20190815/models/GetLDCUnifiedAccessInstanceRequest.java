// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCUnifiedAccessInstanceRequest extends TeaModel {
    @NameInMap("UnifiedAccessInstanceName")
    public String unifiedAccessInstanceName;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static GetLDCUnifiedAccessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLDCUnifiedAccessInstanceRequest self = new GetLDCUnifiedAccessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetLDCUnifiedAccessInstanceRequest setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
        this.unifiedAccessInstanceName = unifiedAccessInstanceName;
        return this;
    }
    public String getUnifiedAccessInstanceName() {
        return this.unifiedAccessInstanceName;
    }

    public GetLDCUnifiedAccessInstanceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
