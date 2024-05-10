// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateDashboardRequest extends TeaModel {
    /**
     * <p>The attributes of the dashboard.</p>
     */
    @NameInMap("attribute")
    public java.util.Map<String, String> attribute;

    /**
     * <p>The charts on the dashboard.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("charts")
    public java.util.List<Chart> charts;

    /**
     * <p>The name of the dashboard.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dashboardName")
    public String dashboardName;

    /**
     * <p>The description of the dashboard.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the dashboard.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("displayName")
    public String displayName;

    public static UpdateDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDashboardRequest self = new UpdateDashboardRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDashboardRequest setAttribute(java.util.Map<String, String> attribute) {
        this.attribute = attribute;
        return this;
    }
    public java.util.Map<String, String> getAttribute() {
        return this.attribute;
    }

    public UpdateDashboardRequest setCharts(java.util.List<Chart> charts) {
        this.charts = charts;
        return this;
    }
    public java.util.List<Chart> getCharts() {
        return this.charts;
    }

    public UpdateDashboardRequest setDashboardName(String dashboardName) {
        this.dashboardName = dashboardName;
        return this;
    }
    public String getDashboardName() {
        return this.dashboardName;
    }

    public UpdateDashboardRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDashboardRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
