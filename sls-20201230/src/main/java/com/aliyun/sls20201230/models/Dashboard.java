// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Dashboard extends TeaModel {
    @NameInMap("attribute")
    public java.util.Map<String, String> attribute;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("charts")
    public java.util.List<Chart> charts;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dashboard-1609294922657-434834</p>
     */
    @NameInMap("dashboardName")
    public String dashboardName;

    /**
     * <strong>example:</strong>
     * <p>这是一个仪表盘。</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-alert</p>
     */
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
