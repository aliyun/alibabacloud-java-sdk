// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelAKSPlanRequest extends TeaModel {
    @NameInMap("ControlOperationRequestJsonStr")
    public String controlOperationRequestJsonStr;

    @NameInMap("Workspace")
    public String workspace;

    public static CancelAKSPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAKSPlanRequest self = new CancelAKSPlanRequest();
        return TeaModel.build(map, self);
    }

    public CancelAKSPlanRequest setControlOperationRequestJsonStr(String controlOperationRequestJsonStr) {
        this.controlOperationRequestJsonStr = controlOperationRequestJsonStr;
        return this;
    }
    public String getControlOperationRequestJsonStr() {
        return this.controlOperationRequestJsonStr;
    }

    public CancelAKSPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
