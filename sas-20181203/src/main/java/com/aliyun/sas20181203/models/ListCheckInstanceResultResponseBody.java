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
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;SecurityGroupNameShow&quot;: {
     *         &quot;value&quot;: &quot;Sas_Malicious_Ip_Security_Group&quot;
     *     },
     *     &quot;InstanceIdShow&quot;: {
     *         &quot;link&quot;: &quot;<a href="https://ecs.console.aliyun.com/#/securityGroupDetail/region/ap-southeast-1/groupId/sg-t4nbk2aodzio52xvj00s/rule/intranetIngress">https://ecs.console.aliyun.com/#/securityGroupDetail/region/ap-southeast-1/groupId/sg-t4nbk2aodzio52xvj00s/rule/intranetIngress</a>&quot;,
     *         &quot;value&quot;: &quot;sg-t4nbk2aodzio52xv****&quot;
     *     }
     * }]</p>
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
     * 
     * <strong>example:</strong>
     * <p>3AB18264-8A1B-52A6-A9AF-A886556E0F2E</p>
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

    public static class ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig extends TeaModel {
        /**
         * <p>The name of the configuration item, which is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>prot</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The display name of the configuration item for internationalization.</p>
         * 
         * <strong>example:</strong>
         * <p>prot</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The value of the configuration item specified for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig build(java.util.Map<String, ?> map) throws Exception {
            ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig self = new ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig();
            return TeaModel.build(map, self);
        }

        public ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListCheckInstanceResultResponseBodyBasicDataInstanceInfo extends TeaModel {
        /**
         * <p>The information about the configuration item whose risks are fixed for the instance.</p>
         */
        @NameInMap("Config")
        public java.util.List<ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig> config;

        /**
         * <p>The time of the first check.</p>
         * 
         * <strong>example:</strong>
         * <p>1716447535531</p>
         */
        @NameInMap("FirstUpdateTime")
        public Long firstUpdateTime;

        /**
         * <p>The time of the last check.</p>
         * 
         * <strong>example:</strong>
         * <p>1716447535531</p>
         */
        @NameInMap("LastUpdateTime")
        public Long lastUpdateTime;

        public static ListCheckInstanceResultResponseBodyBasicDataInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckInstanceResultResponseBodyBasicDataInstanceInfo self = new ListCheckInstanceResultResponseBodyBasicDataInstanceInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckInstanceResultResponseBodyBasicDataInstanceInfo setConfig(java.util.List<ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig> config) {
            this.config = config;
            return this;
        }
        public java.util.List<ListCheckInstanceResultResponseBodyBasicDataInstanceInfoConfig> getConfig() {
            return this.config;
        }

        public ListCheckInstanceResultResponseBodyBasicDataInstanceInfo setFirstUpdateTime(Long firstUpdateTime) {
            this.firstUpdateTime = firstUpdateTime;
            return this;
        }
        public Long getFirstUpdateTime() {
            return this.firstUpdateTime;
        }

        public ListCheckInstanceResultResponseBodyBasicDataInstanceInfo setLastUpdateTime(Long lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

    }

    public static class ListCheckInstanceResultResponseBodyBasicData extends TeaModel {
        /**
         * <p>The ID of the check result for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>300054</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-m5es7ch1s62i4****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The information about the instance on which the check item is used.</p>
         */
        @NameInMap("InstanceInfo")
        public ListCheckInstanceResultResponseBodyBasicDataInstanceInfo instanceInfo;

        /**
         * <p>The instance name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-t4nbk2aodzio52xv****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The states of check items. Multiple states are separated with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>PASS</strong>: passed</li>
         * <li><strong>NOT_PASS</strong>: failed</li>
         * <li><strong>CHECKING</strong>: being checked</li>
         * <li><strong>NOT_CHECK</strong>: not checked</li>
         * <li><strong>WHITELIST</strong>: added to the whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOT_PASS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The exception message of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Task is failed.</p>
         */
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

        public ListCheckInstanceResultResponseBodyBasicData setInstanceInfo(ListCheckInstanceResultResponseBodyBasicDataInstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public ListCheckInstanceResultResponseBodyBasicDataInstanceInfo getInstanceInfo() {
            return this.instanceInfo;
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
         * 
         * <strong>example:</strong>
         * <p>RegionIdShow</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The display name of the search condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Region</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The format of the check result for the instance. Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>link</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
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
         * <p>The metadata information about the details of the instance.</p>
         */
        @NameInMap("Grids")
        public java.util.List<ListCheckInstanceResultResponseBodyColumnsGrids> grids;

        /**
         * <p>The search condition.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionIdShow</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Indicates whether the search condition is used. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Search")
        public Boolean search;

        /**
         * <p>The search key.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceIdKey</p>
         */
        @NameInMap("SearchKey")
        public String searchKey;

        /**
         * <p>The display name of the search condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Region</p>
         */
        @NameInMap("ShowName")
        public String showName;

        /**
         * <p>The type of the check result for the instance. Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>link</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
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
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
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
         * <p>100</p>
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
