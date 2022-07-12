// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Dashboard extends TeaModel {
    // 属性值，可用于修改仪表盘的布局等属性，例如 "type": "free" 自由布局， "type":"grid" 网格布局。
    @NameInMap("attribute")
    public java.util.Map<String, String> attribute;

    // 仪表盘内包含的图表。
    @NameInMap("charts")
    public java.util.List<Chart> charts;

    // 仪表盘ID。同一个Project下，仪表盘ID唯一，不可重复。
    @NameInMap("dashboardName")
    public String dashboardName;

    // 描述信息。
    @NameInMap("description")
    public String description;

    // 仪表盘的展示名称。
    @NameInMap("displayName")
    public String displayName;

    public static Dashboard build(java.util.Map<String, ?> map) throws Exception {
        Dashboard self = new Dashboard();
        return TeaModel.build(map, self);
    }

    public Dashboard setAttribute(java.util.Map<String, String> attribute) {
        this.attribute = attribute;
        return this;
    }
    public java.util.Map<String, String> getAttribute() {
        return this.attribute;
    }

    public Dashboard setCharts(java.util.List<Chart> charts) {
        this.charts = charts;
        return this;
    }
    public java.util.List<Chart> getCharts() {
        return this.charts;
    }

    public Dashboard setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }
    public String getDashboardName() {
        return this.dashboardName;
    }

    public Dashboard setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Dashboard setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
