// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBClustersResponseBody extends TeaModel {
    /**
     * <p>The cluster list.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeAgenticDBClustersResponseBodyItems> items;

    /**
     * <p>The maximum number of entries to return. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call. If there is no next query, do not pass this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of clusters on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeAgenticDBClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBClustersResponseBody self = new DescribeAgenticDBClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBClustersResponseBody setItems(java.util.List<DescribeAgenticDBClustersResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeAgenticDBClustersResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeAgenticDBClustersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAgenticDBClustersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAgenticDBClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAgenticDBClustersResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAgenticDBClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgenticDBClustersResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeAgenticDBClustersResponseBodyItemsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>testValueData</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAgenticDBClustersResponseBodyItemsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBClustersResponseBodyItemsTags self = new DescribeAgenticDBClustersResponseBodyItemsTags();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBClustersResponseBodyItemsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAgenticDBClustersResponseBodyItemsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAgenticDBClustersResponseBodyItems extends TeaModel {
        /**
         * <p>The Agentic cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc-**************</p>
         */
        @NameInMap("AgenticDbClusterDescription")
        public String agenticDbClusterDescription;

        /**
         * <p>The Agentic cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc-**************</p>
         */
        @NameInMap("AgenticDbClusterId")
        public String agenticDbClusterId;

        /**
         * <p>The cluster edition. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Cluster Edition</p>
         * </li>
         * <li><p><strong>Basic</strong>: Single Node Edition</p>
         * </li>
         * <li><p><strong>Archive</strong>: X-Engine Edition</p>
         * </li>
         * <li><p><strong>NormalMultimaster</strong>: Multi-master Cluster (Database/Table)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>ocpx</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-xxxxxx</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The cluster status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <p>The expiration time of the cluster.</p>
         * <blockquote>
         * <p>A specific value is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription). An empty value is returned for <strong>Postpaid</strong> (pay-as-you-go) clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2025-06-25T09:37:10Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <p>The lock status of the cluster. Valid values: </p>
         * <ul>
         * <li><strong>Unlock</strong>: Normal. </li>
         * <li><strong>ManualLock</strong>: Manually locked. </li>
         * <li><strong>LockByExpiration</strong>: Automatically locked due to cluster expiration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The billing method. Valid values: </p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The maximum value: 1 to 32 PCUs. Unit: PCU.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("ScaleMax")
        public String scaleMax;

        /**
         * <p>The minimum value: 0 to 32 PCUs. The minimum value must be less than or equal to the maximum value. Unit: PCU.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScaleMin")
        public String scaleMin;

        /**
         * <p>The serverless type. A value of <strong>AgileServerless</strong> indicates that the cluster is a serverless cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><strong>essdpl0</strong></li>
         * <li><strong>essdpl1</strong></li>
         * <li><strong>essdpl2</strong></li>
         * <li><strong>essdpl3</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>city_redundancy</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The storage usage of the cluster. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3009413120</p>
         */
        @NameInMap("StorageUsed")
        public Long storageUsed;

        /**
         * <p>The tag key. You can filter the cluster list by tag. You can specify up to 20 tag pairs. The number n for each tag pair must be unique and must be a consecutive integer starting from 1. The value of Tag.n.Key corresponds to Tag.n.Value.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeAgenticDBClustersResponseBodyItemsTags> tags;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the endpoint resides.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-****************</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-**************</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAgenticDBClustersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBClustersResponseBodyItems self = new DescribeAgenticDBClustersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBClustersResponseBodyItems setAgenticDbClusterDescription(String agenticDbClusterDescription) {
            this.agenticDbClusterDescription = agenticDbClusterDescription;
            return this;
        }
        public String getAgenticDbClusterDescription() {
            return this.agenticDbClusterDescription;
        }

        public DescribeAgenticDBClustersResponseBodyItems setAgenticDbClusterId(String agenticDbClusterId) {
            this.agenticDbClusterId = agenticDbClusterId;
            return this;
        }
        public String getAgenticDbClusterId() {
            return this.agenticDbClusterId;
        }

        public DescribeAgenticDBClustersResponseBodyItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeAgenticDBClustersResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAgenticDBClustersResponseBodyItems setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeAgenticDBClustersResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAgenticDBClustersResponseBodyItems setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeAgenticDBClustersResponseBodyItems setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeAgenticDBClustersResponseBodyItems setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeAgenticDBClustersResponseBodyItems setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeAgenticDBClustersResponseBodyItems setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeAgenticDBClustersResponseBodyItems setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeAgenticDBClustersResponseBodyItems setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeAgenticDBClustersResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAgenticDBClustersResponseBodyItems setScaleMax(String scaleMax) {
            this.scaleMax = scaleMax;
            return this;
        }
        public String getScaleMax() {
            return this.scaleMax;
        }

        public DescribeAgenticDBClustersResponseBodyItems setScaleMin(String scaleMin) {
            this.scaleMin = scaleMin;
            return this;
        }
        public String getScaleMin() {
            return this.scaleMin;
        }

        public DescribeAgenticDBClustersResponseBodyItems setServerlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }
        public String getServerlessType() {
            return this.serverlessType;
        }

        public DescribeAgenticDBClustersResponseBodyItems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeAgenticDBClustersResponseBodyItems setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeAgenticDBClustersResponseBodyItems setTags(java.util.List<DescribeAgenticDBClustersResponseBodyItemsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeAgenticDBClustersResponseBodyItemsTags> getTags() {
            return this.tags;
        }

        public DescribeAgenticDBClustersResponseBodyItems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeAgenticDBClustersResponseBodyItems setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeAgenticDBClustersResponseBodyItems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
