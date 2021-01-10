// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RollbackLinkedeploycoreDeploycoreAppserviceRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Operator")
    public String operator;

    public static RollbackLinkedeploycoreDeploycoreAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackLinkedeploycoreDeploycoreAppserviceRequest self = new RollbackLinkedeploycoreDeploycoreAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
