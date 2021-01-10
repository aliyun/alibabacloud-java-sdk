// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RebootLinkedeploycoreDeploycoreAppserviceRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("PodsRepeatList")
    public java.util.List<String> podsRepeatList;

    public static RebootLinkedeploycoreDeploycoreAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootLinkedeploycoreDeploycoreAppserviceRequest self = new RebootLinkedeploycoreDeploycoreAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public RebootLinkedeploycoreDeploycoreAppserviceRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceRequest setPodsRepeatList(java.util.List<String> podsRepeatList) {
        this.podsRepeatList = podsRepeatList;
        return this;
    }
    public java.util.List<String> getPodsRepeatList() {
        return this.podsRepeatList;
    }

}
