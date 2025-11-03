// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListMachineAppsResponseBody extends TeaModel {
    /**
     * <p>The applications.</p>
     */
    @NameInMap("AppList")
    public java.util.List<ListMachineAppsResponseBodyAppList> appList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListMachineAppsResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>028CF634-5268-5660-9575-48C9ED6B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMachineAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMachineAppsResponseBody self = new ListMachineAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMachineAppsResponseBody setAppList(java.util.List<ListMachineAppsResponseBodyAppList> appList) {
        this.appList = appList;
        return this;
    }
    public java.util.List<ListMachineAppsResponseBodyAppList> getAppList() {
        return this.appList;
    }

    public ListMachineAppsResponseBody setPageInfo(ListMachineAppsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListMachineAppsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListMachineAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMachineAppsResponseBodyAppList extends TeaModel {
        /**
         * <p>The ID of the SAE application.</p>
         * 
         * <strong>example:</strong>
         * <p>5b41f4bf-349f-4263-89b1-9234c034****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the SAE application.</p>
         * 
         * <strong>example:</strong>
         * <p>app-ubuntu</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("AppRegionId")
        public String appRegionId;

        public static ListMachineAppsResponseBodyAppList build(java.util.Map<String, ?> map) throws Exception {
            ListMachineAppsResponseBodyAppList self = new ListMachineAppsResponseBodyAppList();
            return TeaModel.build(map, self);
        }

        public ListMachineAppsResponseBodyAppList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListMachineAppsResponseBodyAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMachineAppsResponseBodyAppList setAppRegionId(String appRegionId) {
            this.appRegionId = appRegionId;
            return this;
        }
        public String getAppRegionId() {
            return this.appRegionId;
        }

    }

    public static class ListMachineAppsResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>263</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMachineAppsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMachineAppsResponseBodyPageInfo self = new ListMachineAppsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListMachineAppsResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMachineAppsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMachineAppsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
