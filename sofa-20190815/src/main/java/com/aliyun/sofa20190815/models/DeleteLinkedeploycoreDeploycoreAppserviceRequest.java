// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkedeploycoreDeploycoreAppserviceRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Operator")
    public String operator;

    public static DeleteLinkedeploycoreDeploycoreAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkedeploycoreDeploycoreAppserviceRequest self = new DeleteLinkedeploycoreDeploycoreAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
