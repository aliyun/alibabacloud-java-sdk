// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCUnifiedAccessInstanceRequest extends TeaModel {
    @NameInMap("UnifiedAccessInstanceName")
    public String unifiedAccessInstanceName;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static DeleteLDCUnifiedAccessInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCUnifiedAccessInstanceRequest self = new DeleteLDCUnifiedAccessInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLDCUnifiedAccessInstanceRequest setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
        this.unifiedAccessInstanceName = unifiedAccessInstanceName;
        return this;
    }
    public String getUnifiedAccessInstanceName() {
        return this.unifiedAccessInstanceName;
    }

    public DeleteLDCUnifiedAccessInstanceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
