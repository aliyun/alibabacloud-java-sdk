// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReinitAKSOpsContainerServiceRequest extends TeaModel {
    @NameInMap("BaseControlOperationRequestJsonStr")
    public String baseControlOperationRequestJsonStr;

    @NameInMap("ControlType")
    public String controlType;

    @NameInMap("ScopeJsonStr")
    public String scopeJsonStr;

    @NameInMap("TargetId")
    public String targetId;

    @NameInMap("TargetName")
    public String targetName;

    @NameInMap("Workspace")
    public String workspace;

    public static ReinitAKSOpsContainerServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitAKSOpsContainerServiceRequest self = new ReinitAKSOpsContainerServiceRequest();
        return TeaModel.build(map, self);
    }

    public ReinitAKSOpsContainerServiceRequest setBaseControlOperationRequestJsonStr(String baseControlOperationRequestJsonStr) {
        this.baseControlOperationRequestJsonStr = baseControlOperationRequestJsonStr;
        return this;
    }
    public String getBaseControlOperationRequestJsonStr() {
        return this.baseControlOperationRequestJsonStr;
    }

    public ReinitAKSOpsContainerServiceRequest setControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }
    public String getControlType() {
        return this.controlType;
    }

    public ReinitAKSOpsContainerServiceRequest setScopeJsonStr(String scopeJsonStr) {
        this.scopeJsonStr = scopeJsonStr;
        return this;
    }
    public String getScopeJsonStr() {
        return this.scopeJsonStr;
    }

    public ReinitAKSOpsContainerServiceRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ReinitAKSOpsContainerServiceRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public ReinitAKSOpsContainerServiceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
