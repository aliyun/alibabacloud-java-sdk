// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListDashboardResponseBody extends TeaModel {
    @NameInMap("dashboardItems")
    public java.util.List<ListDashboardResponseBodyDashboardItems> dashboardItems;

    @NameInMap("dashboards")
    public java.util.List<String> dashboards;

    public static ListDashboardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardResponseBody self = new ListDashboardResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardResponseBody setDashboardItems(java.util.List<ListDashboardResponseBodyDashboardItems> dashboardItems) {
        this.dashboardItems = dashboardItems;
        return this;
    }
    public java.util.List<ListDashboardResponseBodyDashboardItems> getDashboardItems() {
        return this.dashboardItems;
    }

    public ListDashboardResponseBody setDashboards(java.util.List<String> dashboards) {
        this.dashboards = dashboards;
        return this;
    }
    public java.util.List<String> getDashboards() {
        return this.dashboards;
    }

    public static class ListDashboardResponseBodyDashboardItems extends TeaModel {
        @NameInMap("dashboardName")
        public String dashboardName;

        @NameInMap("displayName")
        public String displayName;

        public static ListDashboardResponseBodyDashboardItems build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardResponseBodyDashboardItems self = new ListDashboardResponseBodyDashboardItems();
            return TeaModel.build(map, self);
        }

        public ListDashboardResponseBodyDashboardItems setDashboardName(String dashboardName) {
            this.dashboardName = dashboardName;
            return this;
        }
        public String getDashboardName() {
            return this.dashboardName;
        }

        public ListDashboardResponseBodyDashboardItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

    }

}
