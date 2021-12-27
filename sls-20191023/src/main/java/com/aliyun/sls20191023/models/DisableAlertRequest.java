// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class DisableAlertRequest extends TeaModel {
    @NameInMap("AlertId")
    public String alertId;

    @NameInMap("App")
    public String app;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("ProjectName")
    public String projectName;

    public static DisableAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAlertRequest self = new DisableAlertRequest();
        return TeaModel.build(map, self);
    }

    public DisableAlertRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

    public DisableAlertRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DisableAlertRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DisableAlertRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
