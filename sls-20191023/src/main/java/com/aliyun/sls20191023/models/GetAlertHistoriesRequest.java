// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class GetAlertHistoriesRequest extends TeaModel {
    @NameInMap("AlertId")
    public String alertId;

    @NameInMap("App")
    public String app;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("FromTs")
    public Integer fromTs;

    @NameInMap("Line")
    public Integer line;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Region")
    public String region;

    @NameInMap("ToTs")
    public Integer toTs;

    public static GetAlertHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertHistoriesRequest self = new GetAlertHistoriesRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertHistoriesRequest setAlertId(String alertId) {
        this.alertId = alertId;
        return this;
    }
    public String getAlertId() {
        return this.alertId;
    }

    public GetAlertHistoriesRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public GetAlertHistoriesRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public GetAlertHistoriesRequest setFromTs(Integer fromTs) {
        this.fromTs = fromTs;
        return this;
    }
    public Integer getFromTs() {
        return this.fromTs;
    }

    public GetAlertHistoriesRequest setLine(Integer line) {
        this.line = line;
        return this;
    }
    public Integer getLine() {
        return this.line;
    }

    public GetAlertHistoriesRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public GetAlertHistoriesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetAlertHistoriesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetAlertHistoriesRequest setToTs(Integer toTs) {
        this.toTs = toTs;
        return this;
    }
    public Integer getToTs() {
        return this.toTs;
    }

}
