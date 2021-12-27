// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class GetAlertRequest extends TeaModel {
    @NameInMap("AlertId")
    public String alertId;

    @NameInMap("App")
    public String app;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("ProjectName")
    public String projectName;

    public static GetAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRequest self = new GetAlertRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

    public GetAlertRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public GetAlertRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public GetAlertRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
