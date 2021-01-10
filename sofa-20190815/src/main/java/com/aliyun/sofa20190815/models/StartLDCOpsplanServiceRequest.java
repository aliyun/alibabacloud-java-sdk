// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StartLDCOpsplanServiceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static StartLDCOpsplanServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLDCOpsplanServiceRequest self = new StartLDCOpsplanServiceRequest();
        return TeaModel.build(map, self);
    }

    public StartLDCOpsplanServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StartLDCOpsplanServiceRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
