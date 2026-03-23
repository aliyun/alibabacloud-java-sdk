// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class AlertQuery extends TeaModel {
    /**
     * <p>图表名称</p>
     * 
     * <strong>example:</strong>
     * <p>chartExmaple</p>
     */
    @NameInMap("chartTitle")
    public String chartTitle;

    /**
     * <p>仪表盘ID</p>
     * 
     * <strong>example:</strong>
     * <p>dashboardExample</p>
     */
    @NameInMap("dashboardId")
    public String dashboardId;

    /**
     * <p>结束时间</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>now</p>
     */
    @NameInMap("end")
    public String end;

    /**
     * <p>是否开启独享SQL</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("powerSqlMode")
    public String powerSqlMode;

    /**
     * <p>项目名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>projectExample</p>
     */
    @NameInMap("project")
    public String project;

    /**
     * <p>查询分析语句</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>| select *</li>
     * </ul>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>区域</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>角色ARN</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>开始时间</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-5m</p>
     */
    @NameInMap("start")
    public String start;

    /**
     * <p>store名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>store Example</p>
     */
    @NameInMap("store")
    public String store;

    /**
     * <p>store类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("storeType")
    public String storeType;

    /**
     * <p>时间片类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Relative</p>
     */
    @NameInMap("timeSpanType")
    public String timeSpanType;

    /**
     * <p>特定场景告警前端使用</p>
     */
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
