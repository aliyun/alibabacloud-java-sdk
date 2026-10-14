// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataSourcesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of records returned by the query.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListDataSourcesResponseBodyItems> items;

    /**
     * <p>The maximum number of records that can be returned for the current cursor-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A compatible pagination cursor field. The ListDataSources operation uses page number-based pagination and does not rely on this field to determine whether more pages exist.</p>
     * 
     * <strong>example:</strong>
     * <p>token-example</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of records returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request identity, which is active when you invoke this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that meet the current statistics or query scope.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDataSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourcesResponseBody self = new ListDataSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSourcesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDataSourcesResponseBody setItems(java.util.List<ListDataSourcesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListDataSourcesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListDataSourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataSourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataSourcesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataSourcesResponseBodyItems extends TeaModel {
        /**
         * <p>The connection status of the data source. Valid values:</p>
         * <ul>
         * <li>UnConnected: Not connected.</li>
         * <li>Processing: Connecting.</li>
         * <li>Success: Connected.</li>
         * <li>Failed: Connection failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ConnectStatus")
        public String connectStatus;

        /**
         * <p>The identifier of the data asset in Data Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>asset-example-001</p>
         */
        @NameInMap("DataAssetId")
        public String dataAssetId;

        /**
         * <p>The identifier of the data source in Data Security Center.</p>
         * 
         * <strong>example:</strong>
         * <p>ds-example-001</p>
         */
        @NameInMap("DataSourceId")
        public String dataSourceId;

        /**
         * <p>The statistical value of the data source capacity. This field is not used in the column encryption process for relational databases.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("DataSourceSize")
        public Long dataSourceSize;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>business_db</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The description of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>Business data source</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The business error code of the record or operation. This field can be empty if no error occurs. Evaluate this field together with ErrorMessage.</p>
         * 
         * <strong>example:</strong>
         * <p>data_masking_not_running</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The business error message of the record or operation.</p>
         * 
         * <strong>example:</strong>
         * <p>The instance is not in the running state</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The identifier of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The status of the data source detection switch. Valid values:</p>
         * <ul>
         * <li>Enable: Submitted for enabling.</li>
         * <li>Enabling: Enabling.</li>
         * <li>Enabled: Enabled.</li>
         * <li>EnableFailed: Enabling failed.</li>
         * <li>Disable: Submitted for disabling.</li>
         * <li>Disabling: Disabling.</li>
         * <li>Disabled: Disabled.</li>
         * <li>DisableFailed: Disabling failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("IdentifyStatus")
        public String identifyStatus;

        /**
         * <p>The database instance identity.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The identity of the member accounts to which the asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012****</p>
         */
        @NameInMap("MemberAccount")
        public Long memberAccount;

        /**
         * <p>The port for the database connection.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The code of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The identifier of the cloud service type. 5: ApsaraDB RDS; 8: PolarDB; 27: PolarDB-X 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <p>The ID of the region where the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region where the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Zhangjiakou)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The ID of the resource group to which the asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmexample****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The identifier of the database tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>tenant-example</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The name of the database account used to connect to the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>dsc_reader</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static ListDataSourcesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourcesResponseBodyItems self = new ListDataSourcesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListDataSourcesResponseBodyItems setConnectStatus(String connectStatus) {
            this.connectStatus = connectStatus;
            return this;
        }
        public String getConnectStatus() {
            return this.connectStatus;
        }

        public ListDataSourcesResponseBodyItems setDataAssetId(String dataAssetId) {
            this.dataAssetId = dataAssetId;
            return this;
        }
        public String getDataAssetId() {
            return this.dataAssetId;
        }

        public ListDataSourcesResponseBodyItems setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDataSourcesResponseBodyItems setDataSourceSize(Long dataSourceSize) {
            this.dataSourceSize = dataSourceSize;
            return this;
        }
        public Long getDataSourceSize() {
            return this.dataSourceSize;
        }

        public ListDataSourcesResponseBodyItems setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListDataSourcesResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDataSourcesResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public ListDataSourcesResponseBodyItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListDataSourcesResponseBodyItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListDataSourcesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataSourcesResponseBodyItems setIdentifyStatus(String identifyStatus) {
            this.identifyStatus = identifyStatus;
            return this;
        }
        public String getIdentifyStatus() {
            return this.identifyStatus;
        }

        public ListDataSourcesResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDataSourcesResponseBodyItems setMemberAccount(Long memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }
        public Long getMemberAccount() {
            return this.memberAccount;
        }

        public ListDataSourcesResponseBodyItems setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListDataSourcesResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListDataSourcesResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public ListDataSourcesResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDataSourcesResponseBodyItems setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public ListDataSourcesResponseBodyItems setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListDataSourcesResponseBodyItems setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListDataSourcesResponseBodyItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
