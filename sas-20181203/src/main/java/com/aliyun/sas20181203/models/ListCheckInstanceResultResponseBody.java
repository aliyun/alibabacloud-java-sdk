// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckInstanceResultResponseBody extends TeaModel {
    // An array that consists of the basic information about the instances.
    @NameInMap("BasicData")
    public java.util.List<ListCheckInstanceResultResponseBodyBasicData> basicData;

    // The extended information about the instances.
    @NameInMap("Checks")
    public java.util.List<java.util.Map<String, ?>> checks;

    // The metadata information about the search conditions that can be used to filter instances.
    @NameInMap("Columns")
    public java.util.List<ListCheckInstanceResultResponseBodyColumns> columns;

    // The pagination information.
    @NameInMap("PageInfo")
    public ListCheckInstanceResultResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
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
        // The ID of the check result for the instance.
        @NameInMap("Id")
        public Long id;

        // The ID of the server.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server.
        @NameInMap("InstanceName")
        public String instanceName;

        // The region ID of the instance.
        @NameInMap("RegionId")
        public String regionId;

        // The statuses of check items. Multiple statuses are separated by commas (,). Valid values:
        // 
        // *   **PASS**
        // *   **NOT_PASS**
        // *   **CHECKING**
        // *   **NOT_CHECK**
        // *   **WHITELIST**
        @NameInMap("Status")
        public String status;

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

    }

    public static class ListCheckInstanceResultResponseBodyColumnsGrids extends TeaModel {
        // The search condition.
        @NameInMap("Key")
        public String key;

        // The display name of the search condition.
        @NameInMap("ShowName")
        public String showName;

        // The format of the check results for the instances. Valid values:
        // 
        // *   **text**
        // *   **link**
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
        // The metadata information about the details of the instances.
        @NameInMap("Grids")
        public java.util.List<ListCheckInstanceResultResponseBodyColumnsGrids> grids;

        // The search condition.
        @NameInMap("Key")
        public String key;

        // Indicates whether the search condition is used. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("Search")
        public Boolean search;

        // The value of the search condition.
        @NameInMap("SearchKey")
        public String searchKey;

        // The display name of the search condition.
        @NameInMap("ShowName")
        public String showName;

        // The format of the check results for the instances. Valid values:
        // 
        // *   **text**
        // *   **link**
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public String count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
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
