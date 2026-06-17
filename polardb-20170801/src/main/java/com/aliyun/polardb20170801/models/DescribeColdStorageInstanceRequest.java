// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeColdStorageInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB cluster.</p>
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
     * <p>The type of the supported engine. The return value is the sum of the values of the supported engine types.</p>
     * <ul>
     * <li><p>1: Search engine</p>
     * </li>
     * <li><p>2: LindormTSDB</p>
     * </li>
     * <li><p>4: LindormTable</p>
     * </li>
     * <li><p>8: File engine</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For example, if \<code>EngineType\\</code> is 15 (8 + 4 + 2 + 1), the instance supports the search engine, LindormTSDB, LindormTable, and file engine. If \<code>EngineType\\</code> is 6 (4 + 2), the instance supports LindormTSDB and LindormTable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The expiration time of the cluster. Note: This parameter is returned only for subscription clusters. An empty value is returned for pay-as-you-go clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-14T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public Integer expireTime;

    /**
     * <ul>
     * <li><p>If you do not specify the <strong>MaxResults</strong> parameter, the query is not paged. The value of the <strong>MaxResults</strong> parameter in the response indicates the total number of entries.</p>
     * </li>
     * <li><p>If you specify the <strong>MaxResults</strong> parameter, the query is paged. <strong>MaxResults</strong> specifies the number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. The value of the <strong>MaxResults</strong> parameter in the response indicates the number of entries on the current page. The recommended value is <strong>20</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A token to retrieve the next page of results. Set this parameter to the \<code>NextToken\\</code> value from a previous call. You do not need to specify this parameter for the first call.</p>
     * 
     * <strong>example:</strong>
     * <p>c2FpXzIwMjIwNjI5X2Jhay9zYWlfc3VtbWVyX3RyZWFzdXJlX3Bvb2xfbG9nLkNTVg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The object type. Valid values: \<code>TABLE\\</code>, \<code>PARTITION_TABLE\\</code>, and \<code>LOB\\</code>.</p>
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
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>If you do not specify this parameter, the operation queries scheduled tasks in all regions within your account.</li>
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
