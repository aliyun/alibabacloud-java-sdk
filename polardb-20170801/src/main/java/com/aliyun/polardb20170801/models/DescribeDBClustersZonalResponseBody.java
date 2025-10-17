// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersZonalResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeDBClustersZonalResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeDBClustersZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersZonalResponseBody self = new DescribeDBClustersZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersZonalResponseBody setItems(java.util.List<DescribeDBClustersZonalResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDBClustersZonalResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDBClustersZonalResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDBClustersZonalResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDBClustersZonalResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClustersZonalResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDBClustersZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClustersZonalResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDBClustersZonalResponseBodyItemsTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBClustersZonalResponseBodyItemsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersZonalResponseBodyItemsTags self = new DescribeDBClustersZonalResponseBodyItemsTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersZonalResponseBodyItemsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClustersZonalResponseBodyItemsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClustersZonalResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SearchNode</p>
         */
        @NameInMap("AiType")
        public String aiType;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("CentralControlRegionId")
        public String centralControlRegionId;

        /**
         * <strong>example:</strong>
         * <p>ENS</p>
         */
        @NameInMap("CloudProvider")
        public String cloudProvider;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuCores")
        public String cpuCores;

        /**
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>GDN-1</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <strong>example:</strong>
         * <p>polar.mysql.g1.tiny.c</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DBNodeNumber")
        public Integer DBNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        @NameInMap("DBVersion")
        public String DBVersion;

        /**
         * <strong>example:</strong>
         * <p>sg-singapore-9</p>
         */
        @NameInMap("ENSRegionId")
        public String ENSRegionId;

        /**
         * <strong>example:</strong>
         * <p>2022-09-14T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expired")
        public String expired;

        /**
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        @NameInMap("ServerlessType")
        public String serverlessType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("StorageSpace")
        public Long storageSpace;

        /**
         * <strong>example:</strong>
         * <p>essdautopl</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <strong>example:</strong>
         * <p>3009413120</p>
         */
        @NameInMap("StorageUsed")
        public Long storageUsed;

        /**
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("StrictConsistency")
        public String strictConsistency;

        /**
         * <strong>example:</strong>
         * <p>Exclusive</p>
         */
        @NameInMap("SubCategory")
        public String subCategory;

        @NameInMap("Tags")
        public java.util.List<DescribeDBClustersZonalResponseBodyItemsTags> tags;

        /**
         * <strong>example:</strong>
         * <p>vpc-****************</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <strong>example:</strong>
         * <p>vsw-***************</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDBClustersZonalResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClustersZonalResponseBodyItems self = new DescribeDBClustersZonalResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDBClustersZonalResponseBodyItems setAiType(String aiType) {
            this.aiType = aiType;
            return this;
        }
        public String getAiType() {
            return this.aiType;
        }

        public DescribeDBClustersZonalResponseBodyItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClustersZonalResponseBodyItems setCentralControlRegionId(String centralControlRegionId) {
            this.centralControlRegionId = centralControlRegionId;
            return this;
        }
        public String getCentralControlRegionId() {
            return this.centralControlRegionId;
        }

        public DescribeDBClustersZonalResponseBodyItems setCloudProvider(String cloudProvider) {
            this.cloudProvider = cloudProvider;
            return this;
        }
        public String getCloudProvider() {
            return this.cloudProvider;
        }

        public DescribeDBClustersZonalResponseBodyItems setCpuCores(String cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public String getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBClustersZonalResponseBodyItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClustersZonalResponseBodyItems setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClustersZonalResponseBodyItems setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClustersZonalResponseBodyItems setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClustersZonalResponseBodyItems setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClustersZonalResponseBodyItems setDBNodeNumber(Integer DBNodeNumber) {
            this.DBNodeNumber = DBNodeNumber;
            return this;
        }
        public Integer getDBNodeNumber() {
            return this.DBNodeNumber;
        }

        public DescribeDBClustersZonalResponseBodyItems setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeDBClustersZonalResponseBodyItems setDBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }
        public String getDBVersion() {
            return this.DBVersion;
        }

        public DescribeDBClustersZonalResponseBodyItems setENSRegionId(String ENSRegionId) {
            this.ENSRegionId = ENSRegionId;
            return this;
        }
        public String getENSRegionId() {
            return this.ENSRegionId;
        }

        public DescribeDBClustersZonalResponseBodyItems setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClustersZonalResponseBodyItems setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeDBClustersZonalResponseBodyItems setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClustersZonalResponseBodyItems setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClustersZonalResponseBodyItems setServerlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }
        public String getServerlessType() {
            return this.serverlessType;
        }

        public DescribeDBClustersZonalResponseBodyItems setStorageSpace(Long storageSpace) {
            this.storageSpace = storageSpace;
            return this;
        }
        public Long getStorageSpace() {
            return this.storageSpace;
        }

        public DescribeDBClustersZonalResponseBodyItems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBClustersZonalResponseBodyItems setStorageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public DescribeDBClustersZonalResponseBodyItems setStrictConsistency(String strictConsistency) {
            this.strictConsistency = strictConsistency;
            return this;
        }
        public String getStrictConsistency() {
            return this.strictConsistency;
        }

        public DescribeDBClustersZonalResponseBodyItems setSubCategory(String subCategory) {
            this.subCategory = subCategory;
            return this;
        }
        public String getSubCategory() {
            return this.subCategory;
        }

        public DescribeDBClustersZonalResponseBodyItems setTags(java.util.List<DescribeDBClustersZonalResponseBodyItemsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeDBClustersZonalResponseBodyItemsTags> getTags() {
            return this.tags;
        }

        public DescribeDBClustersZonalResponseBodyItems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClustersZonalResponseBodyItems setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeDBClustersZonalResponseBodyItems setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
