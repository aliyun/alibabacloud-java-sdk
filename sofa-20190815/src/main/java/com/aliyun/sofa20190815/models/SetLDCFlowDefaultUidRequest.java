// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLDCFlowDefaultUidRequest extends TeaModel {
    @NameInMap("Press")
    public Boolean press;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static SetLDCFlowDefaultUidRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLDCFlowDefaultUidRequest self = new SetLDCFlowDefaultUidRequest();
        return TeaModel.build(map, self);
    }

    public SetLDCFlowDefaultUidRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public SetLDCFlowDefaultUidRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
