// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmLDCOpsplanServicerollbackRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static ConfirmLDCOpsplanServicerollbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmLDCOpsplanServicerollbackRequest self = new ConfirmLDCOpsplanServicerollbackRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmLDCOpsplanServicerollbackRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfirmLDCOpsplanServicerollbackRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
