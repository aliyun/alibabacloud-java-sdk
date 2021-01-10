// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkedeploycoreDeploycoreDebugportRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("DebugPort")
    public String debugPort;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("ProjectId")
    public String projectId;

    public static UpdateLinkedeploycoreDeploycoreDebugportRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkedeploycoreDeploycoreDebugportRequest self = new UpdateLinkedeploycoreDeploycoreDebugportRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkedeploycoreDeploycoreDebugportRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public UpdateLinkedeploycoreDeploycoreDebugportRequest setDebugPort(String debugPort) {
        this.debugPort = debugPort;
        return this;
    }
    public String getDebugPort() {
        return this.debugPort;
    }

    public UpdateLinkedeploycoreDeploycoreDebugportRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public UpdateLinkedeploycoreDeploycoreDebugportRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateLinkedeploycoreDeploycoreDebugportRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateLinkedeploycoreDeploycoreDebugportRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
