// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClustersResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribeAIDBClustersResponseBodyItems items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9D6CE7C6-1C52-5BF6-B3D7-10977D44542C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeAIDBClustersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClustersResponseBody self = new DescribeAIDBClustersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClustersResponseBody setItems(DescribeAIDBClustersResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeAIDBClustersResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeAIDBClustersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAIDBClustersResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAIDBClustersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAIDBClustersResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeAIDBClustersResponseBodyItemsDBClusterTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeAIDBClustersResponseBodyItemsDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClustersResponseBodyItemsDBClusterTagsTag self = new DescribeAIDBClustersResponseBodyItemsDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClustersResponseBodyItemsDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAIDBClustersResponseBodyItemsDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAIDBClustersResponseBodyItemsDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeAIDBClustersResponseBodyItemsDBClusterTagsTag> tag;

        public static DescribeAIDBClustersResponseBodyItemsDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClustersResponseBodyItemsDBClusterTags self = new DescribeAIDBClustersResponseBodyItemsDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClustersResponseBodyItemsDBClusterTags setTag(java.util.List<DescribeAIDBClustersResponseBodyItemsDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeAIDBClustersResponseBodyItemsDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeAIDBClustersResponseBodyItemsDBCluster extends TeaModel {
        @NameInMap("AiNodeType")
        public String aiNodeType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        @NameInMap("DBType")
        public String DBType;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public Boolean expired;

        @NameInMap("KubeClusterId")
        public String kubeClusterId;

        @NameInMap("LockMode")
        public String lockMode;

        @NameInMap("ModelType")
        public String modelType;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        @NameInMap("RelativeDBClusterId")
        public String relativeDBClusterId;

        @NameInMap("RunType")
        public String runType;

        @NameInMap("StorageSpace")
        public Integer storageSpace;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Tags")
        public DescribeAIDBClustersResponseBodyItemsDBClusterTags tags;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeAIDBClustersResponseBodyItemsDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClustersResponseBodyItemsDBCluster self = new DescribeAIDBClustersResponseBodyItemsDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setAiNodeType(String aiNodeType) {
            this.aiNodeType = aiNodeType;
            return this;
        }
        public String getAiNodeType() {
            return this.aiNodeType;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setKubeClusterId(String kubeClusterId) {
            this.kubeClusterId = kubeClusterId;
            return this;
        }
        public String getKubeClusterId() {
            return this.kubeClusterId;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setRelativeDBClusterId(String relativeDBClusterId) {
            this.relativeDBClusterId = relativeDBClusterId;
            return this;
        }
        public String getRelativeDBClusterId() {
            return this.relativeDBClusterId;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setRunType(String runType) {
            this.runType = runType;
            return this;
        }
        public String getRunType() {
            return this.runType;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setStorageSpace(Integer storageSpace) {
            this.storageSpace = storageSpace;
            return this;
        }
        public Integer getStorageSpace() {
            return this.storageSpace;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setTags(DescribeAIDBClustersResponseBodyItemsDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeAIDBClustersResponseBodyItemsDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeAIDBClustersResponseBodyItemsDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeAIDBClustersResponseBodyItems extends TeaModel {
        @NameInMap("DBCluster")
        public java.util.List<DescribeAIDBClustersResponseBodyItemsDBCluster> DBCluster;

        public static DescribeAIDBClustersResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClustersResponseBodyItems self = new DescribeAIDBClustersResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClustersResponseBodyItems setDBCluster(java.util.List<DescribeAIDBClustersResponseBodyItemsDBCluster> DBCluster) {
            this.DBCluster = DBCluster;
            return this;
        }
        public java.util.List<DescribeAIDBClustersResponseBodyItemsDBCluster> getDBCluster() {
            return this.DBCluster;
        }

    }

}
