// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkedeploycoreDeploycoreLangRequest extends TeaModel {
    @NameInMap("AppServiceId")
    public Long appServiceId;

    @NameInMap("FromApp")
    public String fromApp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("ProjectId")
    public String projectId;

    public static UpdateLinkedeploycoreDeploycoreLangRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkedeploycoreDeploycoreLangRequest self = new UpdateLinkedeploycoreDeploycoreLangRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkedeploycoreDeploycoreLangRequest setAppServiceId(Long appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public Long getAppServiceId() {
        return this.appServiceId;
    }

    public UpdateLinkedeploycoreDeploycoreLangRequest setFromApp(String fromApp) {
        this.fromApp = fromApp;
        return this;
    }
    public String getFromApp() {
        return this.fromApp;
    }

    public UpdateLinkedeploycoreDeploycoreLangRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateLinkedeploycoreDeploycoreLangRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateLinkedeploycoreDeploycoreLangRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
