// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AlertQuery extends TeaModel {
    @NameInMap("chartTitle")
    public String chartTitle;

    @NameInMap("dashboardId")
    public String dashboardId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("end")
    public String end;

    @NameInMap("powerSqlMode")
    public String powerSqlMode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("region")
    public String region;

    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("start")
    public String start;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("store")
    public String store;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("storeType")
    public String storeType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("timeSpanType")
    public String timeSpanType;

    @NameInMap("ui")
    public String ui;

    public static AlertQuery build(java.util.Map<String, ?> map) throws Exception {
        AlertQuery self = new AlertQuery();
        return TeaModel.build(map, self);
    }

    public AlertQuery setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
        return this;
    }
    public String getChartTitle() {
        return this.chartTitle;
    }

    public AlertQuery setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
        return this;
    }
    public String getDashboardId() {
        return this.dashboardId;
    }

    public AlertQuery setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public AlertQuery setPowerSqlMode(String powerSqlMode) {
        this.powerSqlMode = powerSqlMode;
        return this;
    }
    public String getPowerSqlMode() {
        return this.powerSqlMode;
    }

    public AlertQuery setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public AlertQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public AlertQuery setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public AlertQuery setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public AlertQuery setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public AlertQuery setStore(String store) {
        this.store = store;
        return this;
    }
    public String getStore() {
        return this.store;
    }

    public AlertQuery setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public AlertQuery setTimeSpanType(String timeSpanType) {
        this.timeSpanType = timeSpanType;
        return this;
    }
    public String getTimeSpanType() {
        return this.timeSpanType;
    }

    public AlertQuery setUi(String ui) {
        this.ui = ui;
        return this;
    }
    public String getUi() {
        return this.ui;
    }

}
