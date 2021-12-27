// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class EnableAlertRequest extends TeaModel {
    @NameInMap("AlertId")
    public String alertId;

    @NameInMap("App")
    public String app;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("Language")
    public String language;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Region")
    public String region;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("RuleVersion")
    public String ruleVersion;

    @NameInMap("Tokens")
    public String tokens;

    public static EnableAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAlertRequest self = new EnableAlertRequest();
        return TeaModel.build(map, self);
    }

    public EnableAlertRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

    public EnableAlertRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public EnableAlertRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public EnableAlertRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public EnableAlertRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public EnableAlertRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public EnableAlertRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public EnableAlertRequest setRuleVersion(String ruleVersion) {
        this.ruleVersion = ruleVersion;
        return this;
    }
    public String getRuleVersion() {
        return this.ruleVersion;
    }

    public EnableAlertRequest setTokens(String tokens) {
        this.tokens = tokens;
        return this;
    }
    public String getTokens() {
        return this.tokens;
    }

}
