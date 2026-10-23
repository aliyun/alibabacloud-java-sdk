// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeColdStorageInstanceRequest extends TeaModel {
    /**
     * <p>The PolarDB cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-wz9062015ly7526jc</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The supported engine types. The return value is the sum of the following engine type values:</p>
     * <ul>
     * <li>1: search engine</li>
     * <li>2: time series engine</li>
     * <li>4: wide table engine</li>
     * <li>8: file engine</li>
     * </ul>
     * <blockquote>
     * <p>For example, if the EngineType value is 15, 15 = 8 + 4 + 2 + 1, which indicates that the instance supports the search engine, time series engine, wide table engine, and file engine. If the EngineType value is 6, 6 = 4 + 2, which indicates that the instance supports the time series engine and wide table engine.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The expiration time of the cluster. Note: A specific value is returned only for clusters whose billing method is Prepaid (subscription). For Postpaid (pay-as-you-go) clusters, a null value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-14T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <ul>
     * <li>If you do not specify the <strong>MaxResults</strong> parameter, batch query is not required. The value of the <strong>MaxResults</strong> parameter returned after the API call indicates the total number of list entries.</li>
     * <li>If you specify the <strong>MaxResults</strong> parameter, batch query is required. The value of <strong>MaxResults</strong> indicates the number of entries displayed per batch. Valid values: <strong>1</strong> to <strong>100</strong>. The value of the <strong>MaxResults</strong> parameter returned after the API call indicates the number of list entries in the current query batch. Set the <strong>MaxResults</strong> parameter to <strong>20</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The query token. Set the value to the NextToken value returned from the previous API call. If there are no more queries, do not specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>c2FpXzIwMjIwNjI5X2Jhay9zYWlfc3VtbWVyX3RyZWFzdXJlX3Bvb2xfbG9nLkNTVg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The object type. Valid values: TABLE, PARTITION_TABLE, and LOB.</p>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the region information of all clusters under the target account.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If this parameter is left empty, scheduled tasks in all regions under the current account are queried by default.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The name of the data table.</p>
     * 
     * <strong>example:</strong>
     * <p>account_log</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static DescribeColdStorageInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeColdStorageInstanceRequest self = new DescribeColdStorageInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeColdStorageInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeColdStorageInstanceRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeColdStorageInstanceRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public DescribeColdStorageInstanceRequest setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Integer getExpireTime() {
        return this.expireTime;
    }

    public DescribeColdStorageInstanceRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeColdStorageInstanceRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeColdStorageInstanceRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public DescribeColdStorageInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeColdStorageInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeColdStorageInstanceRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeColdStorageInstanceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeColdStorageInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeColdStorageInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeColdStorageInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeColdStorageInstanceRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
