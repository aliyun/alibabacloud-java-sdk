// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecAKSPlanRequest extends TeaModel {
    @NameInMap("ControlOperationRequestJsonStr")
    public String controlOperationRequestJsonStr;

    @NameInMap("Workspace")
    public String workspace;

    public static ExecAKSPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAKSPlanRequest self = new ExecAKSPlanRequest();
        return TeaModel.build(map, self);
    }

    public ExecAKSPlanRequest setControlOperationRequestJsonStr(String controlOperationRequestJsonStr) {
        this.controlOperationRequestJsonStr = controlOperationRequestJsonStr;
        return this;
    }
    public String getControlOperationRequestJsonStr() {
        return this.controlOperationRequestJsonStr;
    }

    public ExecAKSPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
