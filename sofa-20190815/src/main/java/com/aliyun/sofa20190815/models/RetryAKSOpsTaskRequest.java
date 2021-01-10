// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryAKSOpsTaskRequest extends TeaModel {
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

    public static RetryAKSOpsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryAKSOpsTaskRequest self = new RetryAKSOpsTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryAKSOpsTaskRequest setBaseControlOperationRequestJsonStr(String baseControlOperationRequestJsonStr) {
        this.baseControlOperationRequestJsonStr = baseControlOperationRequestJsonStr;
        return this;
    }
    public String getBaseControlOperationRequestJsonStr() {
        return this.baseControlOperationRequestJsonStr;
    }

    public RetryAKSOpsTaskRequest setControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }
    public String getControlType() {
        return this.controlType;
    }

    public RetryAKSOpsTaskRequest setScopeJsonStr(String scopeJsonStr) {
        this.scopeJsonStr = scopeJsonStr;
        return this;
    }
    public String getScopeJsonStr() {
        return this.scopeJsonStr;
    }

    public RetryAKSOpsTaskRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public RetryAKSOpsTaskRequest setTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }
    public String getTargetName() {
        return this.targetName;
    }

    public RetryAKSOpsTaskRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
