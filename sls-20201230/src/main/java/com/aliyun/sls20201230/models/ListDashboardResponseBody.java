// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListDashboardResponseBody extends TeaModel {
    /**
     * <p>The details of the dashboard.</p>
     */
    @NameInMap("dashboardItems")
    public java.util.List<ListDashboardResponseBodyDashboardItems> dashboardItems;

    /**
     * <p>The queried dashboards. Each dashboard in the array is specified by dashboardName.</p>
     */
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
        /**
         * <p>The dashboard ID. The ID must be unique in a project. Fuzzy search is supported. For example, if you enter da, all dashboards whose IDs start with da are queried.</p>
         */
        @NameInMap("dashboardName")
        public String dashboardName;

        /**
         * <p>The display name of the dashboard.</p>
         */
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
