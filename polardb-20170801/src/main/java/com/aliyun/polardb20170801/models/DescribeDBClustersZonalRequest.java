// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersZonalRequest extends TeaModel {
    /**
     * <p>The cloud service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>AlibabaCloud</p>
     */
    @NameInMap("CloudProvider")
    public String cloudProvider;

    /**
     * <p>The database endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>********.rwlb.polardb-pg-public.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The description of the cluster. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterDescription")
    public String DBClusterDescription;

    /**
     * <p>The cluster ID. To specify multiple cluster IDs, separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    /**
     * <p>The status of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("DBClusterStatus")
    public String DBClusterStatus;

    /**
     * <p>The node ID. You can specify multiple node IDs. Separate them with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>pi-***************</p>
     */
    @NameInMap("DBNodeIds")
    public String DBNodeIds;

    /**
     * <p>The database type. Valid values:</p>
     * <ul>
     * <li><p>MySQL</p>
     * </li>
     * <li><p>PostgreSQL</p>
     * </li>
     * <li><p>Oracle</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The database version.</p>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The query mode. Set the value to \<code>Simple\\</code>. In this mode, only the basic metadata of the clusters is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Simple</p>
     */
    @NameInMap("DescribeType")
    public String describeType;

    /**
     * <p>Specifies whether the cluster has expired. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The maximum number of entries to return for the current request. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A token used to retrieve the next page of results. Set this parameter to the \<code>NextToken\\</code> value returned from the previous API call. You do not need to specify this parameter for the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be an integer that is greater than 0 and does not exceed the maximum value of the Integer data type. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 30, 50, and 100.</p>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><p>Postpaid: pay-as-you-go</p>
     * </li>
     * <li><p>Prepaid: subscription</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Filters for clusters created in the last N days. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("RecentCreationInterval")
    public Integer recentCreationInterval;

    /**
     * <p>Filters for clusters that expire in N days. Valid values: 0 to 15.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("RecentExpirationInterval")
    public Integer recentExpirationInterval;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-**********</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeDBClustersZonalRequestTag> tag;

    public static DescribeDBClustersZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersZonalRequest self = new DescribeDBClustersZonalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersZonalRequest setCloudProvider(String cloudProvider) {
        this.cloudProvider = cloudProvider;
        return this;
    }
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    public DescribeDBClustersZonalRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public DescribeDBClustersZonalRequest setDBClusterDescription(String DBClusterDescription) {
        this.DBClusterDescription = DBClusterDescription;
        return this;
    }
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    public DescribeDBClustersZonalRequest setDBClusterIds(String DBClusterIds) {
        this.DBClusterIds = DBClusterIds;
        return this;
    }
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    public DescribeDBClustersZonalRequest setDBClusterStatus(String DBClusterStatus) {
        this.DBClusterStatus = DBClusterStatus;
        return this;
    }
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    public DescribeDBClustersZonalRequest setDBNodeIds(String DBNodeIds) {
        this.DBNodeIds = DBNodeIds;
        return this;
    }
    public String getDBNodeIds() {
        return this.DBNodeIds;
    }

    public DescribeDBClustersZonalRequest setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClustersZonalRequest setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClustersZonalRequest setDescribeType(String describeType) {
        this.describeType = describeType;
        return this;
    }
    public String getDescribeType() {
        return this.describeType;
    }

    public DescribeDBClustersZonalRequest setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeDBClustersZonalRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDBClustersZonalRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDBClustersZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBClustersZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBClustersZonalRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersZonalRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBClustersZonalRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeDBClustersZonalRequest setRecentCreationInterval(Integer recentCreationInterval) {
        this.recentCreationInterval = recentCreationInterval;
        return this;
    }
    public Integer getRecentCreationInterval() {
        return this.recentCreationInterval;
    }

    public DescribeDBClustersZonalRequest setRecentExpirationInterval(Integer recentExpirationInterval) {
        this.recentExpirationInterval = recentExpirationInterval;
        return this;
    }
    public Integer getRecentExpirationInterval() {
        return this.recentExpirationInterval;
    }

    public DescribeDBClustersZonalRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBClustersZonalRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDBClustersZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBClustersZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBClustersZonalRequest setTag(java.util.List<DescribeDBClustersZonalRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDBClustersZonalRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDBClustersZonalRequestTag extends TeaModel {
        /**
         * <p>The key of tag \<code>n\\</code>. You can filter clusters by specifying up to 20 tags. The \<code>n\\</code> must be a unique and consecutive integer that starts from 1. \<code>Tag.n.Key\\</code> corresponds to \<code>Tag.n.Value\\</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBClustersZonalRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersZonalRequestTag self = new DescribeDBClustersZonalRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersZonalRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersZonalRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
