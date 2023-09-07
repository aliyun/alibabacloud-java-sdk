// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckInstanceResultResponseBody extends TeaModel {
    /**
     * <p>The basic information about the affected instances.</p>
     */
    @NameInMap("BasicData")
    public java.util.List<ListCheckInstanceResultResponseBodyBasicData> basicData;

    /**
     * <p>The extended information about the instances.</p>
     */
    @NameInMap("Checks")
    public java.util.List<java.util.Map<String, ?>> checks;

    /**
     * <p>The metadata information about the search conditions that can be used to filter instances.</p>
     */
    @NameInMap("Columns")
    public java.util.List<ListCheckInstanceResultResponseBodyColumns> columns;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCheckInstanceResultResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckInstanceResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckInstanceResultResponseBody self = new ListCheckInstanceResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckInstanceResultResponseBody setBasicData(java.util.List<ListCheckInstanceResultResponseBodyBasicData> basicData) {
        this.basicData = basicData;
        return this;
    }
    public java.util.List<ListCheckInstanceResultResponseBodyBasicData> getBasicData() {
        return this.basicData;
    }

    public ListCheckInstanceResultResponseBody setChecks(java.util.List<java.util.Map<String, ?>> checks) {
        this.checks = checks;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getChecks() {
        return this.checks;
    }

    public ListCheckInstanceResultResponseBody setColumns(java.util.List<ListCheckInstanceResultResponseBodyColumns> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<ListCheckInstanceResultResponseBodyColumns> getColumns() {
        return this.columns;
    }

    public ListCheckInstanceResultResponseBody setPageInfo(ListCheckInstanceResultResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCheckInstanceResultResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCheckInstanceResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCheckInstanceResultResponseBodyBasicData extends TeaModel {
        /**
         * <p>The check result ID of the instance.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The instance ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The states of check items. Multiple states are separated with commas (,). Valid values:</p>
         * <br>
         * <p>*   **PASS**: The instance passed the check.</p>
         * <p>*   **NOT_PASS**: The instance failed to pass the check.</p>
         * <p>*   **CHECKING**: The instance is being checked.</p>
         * <p>*   **NOT_CHECK**: The instance is not checked.</p>
         * <p>*   **WHITELIST**: The instance is in the whitelist.</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusMessage")
        public String statusMessage;

        public static ListCheckInstanceResultResponseBodyBasicData build(java.util.Map<String, ?> map) throws Exception {
            ListCheckInstanceResultResponseBodyBasicData self = new ListCheckInstanceResultResponseBodyBasicData();
            return TeaModel.build(map, self);
        }

        public ListCheckInstanceResultResponseBodyBasicData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCheckInstanceResultResponseBodyBasicData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCheckInstanceResultResponseBodyBasicData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListCheckInstanceResultResponseBodyBasicData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCheckInstanceResultResponseBodyBasicData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCheckInstanceResultResponseBodyBasicData setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

    public static class ListCheckInstanceResultResponseBodyColumnsGrids extends TeaModel {
        /**
         * <p>The search condition.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The display name of the search condition.</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The format of the check results for the instances. Valid values:</p>
         * <br>
         * <p>*   **text**</p>
         * <p>*   **link**</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCheckInstanceResultResponseBodyColumnsGrids build(java.util.Map<String, ?> map) throws Exception {
            ListCheckInstanceResultResponseBodyColumnsGrids self = new ListCheckInstanceResultResponseBodyColumnsGrids();
            return TeaModel.build(map, self);
        }

        public ListCheckInstanceResultResponseBodyColumnsGrids setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListCheckInstanceResultResponseBodyColumnsGrids setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListCheckInstanceResultResponseBodyColumnsGrids setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCheckInstanceResultResponseBodyColumns extends TeaModel {
        /**
         * <p>The metadata information about the details of the instances.</p>
         */
        @NameInMap("Grids")
        public java.util.List<ListCheckInstanceResultResponseBodyColumnsGrids> grids;

        /**
         * <p>The search condition.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Indicates whether the search condition is used. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Search")
        public Boolean search;

        /**
         * <p>The value of the search condition.</p>
         */
        @NameInMap("SearchKey")
        public String searchKey;

        /**
         * <p>The display name of the search condition.</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The type of the check result for the instance. Valid values:</p>
         * <br>
         * <p>*   **text**</p>
         * <p>*   **link**</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListCheckInstanceResultResponseBodyColumns build(java.util.Map<String, ?> map) throws Exception {
            ListCheckInstanceResultResponseBodyColumns self = new ListCheckInstanceResultResponseBodyColumns();
            return TeaModel.build(map, self);
        }

        public ListCheckInstanceResultResponseBodyColumns setGrids(java.util.List<ListCheckInstanceResultResponseBodyColumnsGrids> grids) {
            this.grids = grids;
            return this;
        }
        public java.util.List<ListCheckInstanceResultResponseBodyColumnsGrids> getGrids() {
            return this.grids;
        }

        public ListCheckInstanceResultResponseBodyColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListCheckInstanceResultResponseBodyColumns setSearch(Boolean search) {
            this.search = search;
            return this;
        }
        public Boolean getSearch() {
            return this.search;
        }

        public ListCheckInstanceResultResponseBodyColumns setSearchKey(String searchKey) {
            this.searchKey = searchKey;
            return this;
        }
        public String getSearchKey() {
            return this.searchKey;
        }

        public ListCheckInstanceResultResponseBodyColumns setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListCheckInstanceResultResponseBodyColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCheckInstanceResultResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCheckInstanceResultResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckInstanceResultResponseBodyPageInfo self = new ListCheckInstanceResultResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckInstanceResultResponseBodyPageInfo setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public ListCheckInstanceResultResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCheckInstanceResultResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCheckInstanceResultResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
