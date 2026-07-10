// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsResponseBody extends TeaModel {
    @NameInMap("Items")
    public DescribePolarFsResponseBodyItems items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8CD1852F-8176-55E4-891C-4478DC00CC7A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribePolarFsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsResponseBody self = new DescribePolarFsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsResponseBody setItems(DescribePolarFsResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribePolarFsResponseBodyItems getItems() {
        return this.items;
    }

    public DescribePolarFsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarFsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribePolarFsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarFsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo extends TeaModel {
        @NameInMap("PolarDbProxy")
        public String polarDbProxy;

        @NameInMap("PolarFsCluster")
        public String polarFsCluster;

        @NameInMap("Token")
        public String token;

        public static DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo self = new DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo setPolarDbProxy(String polarDbProxy) {
            this.polarDbProxy = polarDbProxy;
            return this;
        }
        public String getPolarDbProxy() {
            return this.polarDbProxy;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo setPolarFsCluster(String polarFsCluster) {
            this.polarFsCluster = polarFsCluster;
            return this;
        }
        public String getPolarFsCluster() {
            return this.polarFsCluster;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("MountDir")
        public String mountDir;

        @NameInMap("MountStatus")
        public String mountStatus;

        @NameInMap("MountedTime")
        public String mountedTime;

        public static DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters self = new DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters setMountStatus(String mountStatus) {
            this.mountStatus = mountStatus;
            return this;
        }
        public String getMountStatus() {
            return this.mountStatus;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters setMountedTime(String mountedTime) {
            this.mountedTime = mountedTime;
            return this;
        }
        public String getMountedTime() {
            return this.mountedTime;
        }

    }

    public static class DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClusters extends TeaModel {
        @NameInMap("MountedAIDBClusters")
        public java.util.List<DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters> mountedAIDBClusters;

        public static DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClusters self = new DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClusters();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClusters setMountedAIDBClusters(java.util.List<DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters> mountedAIDBClusters) {
            this.mountedAIDBClusters = mountedAIDBClusters;
            return this;
        }
        public java.util.List<DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClustersMountedAIDBClusters> getMountedAIDBClusters() {
            return this.mountedAIDBClusters;
        }

    }

    public static class DescribePolarFsResponseBodyItemsPolarFsPathsTagsTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePolarFsResponseBodyItemsPolarFsPathsTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsResponseBodyItemsPolarFsPathsTagsTag self = new DescribePolarFsResponseBodyItemsPolarFsPathsTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePolarFsResponseBodyItemsPolarFsPathsTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribePolarFsResponseBodyItemsPolarFsPathsTagsTag> tag;

        public static DescribePolarFsResponseBodyItemsPolarFsPathsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsResponseBodyItemsPolarFsPathsTags self = new DescribePolarFsResponseBodyItemsPolarFsPathsTags();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsResponseBodyItemsPolarFsPathsTags setTag(java.util.List<DescribePolarFsResponseBodyItemsPolarFsPathsTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribePolarFsResponseBodyItemsPolarFsPathsTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribePolarFsResponseBodyItemsPolarFsPaths extends TeaModel {
        @NameInMap("AccelerateType")
        public String accelerateType;

        @NameInMap("AcceleratedStorageSpace")
        public String acceleratedStorageSpace;

        @NameInMap("AcceleratingEnable")
        public String acceleratingEnable;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("Category")
        public String category;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Expired")
        public String expired;

        @NameInMap("MountInfo")
        public DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo mountInfo;

        @NameInMap("MountedAIDBClusters")
        public DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClusters mountedAIDBClusters;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("PolarFsInstanceDescription")
        public String polarFsInstanceDescription;

        @NameInMap("PolarFsInstanceId")
        public String polarFsInstanceId;

        @NameInMap("PolarFsPath")
        public String polarFsPath;

        @NameInMap("PolarFsStatus")
        public String polarFsStatus;

        @NameInMap("PolarFsType")
        public String polarFsType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RelativeDbClusterId")
        public String relativeDbClusterId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("StorageSpace")
        public Long storageSpace;

        @NameInMap("StorageType")
        public String storageType;

        @NameInMap("Tags")
        public DescribePolarFsResponseBodyItemsPolarFsPathsTags tags;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribePolarFsResponseBodyItemsPolarFsPaths build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsResponseBodyItemsPolarFsPaths self = new DescribePolarFsResponseBodyItemsPolarFsPaths();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setAccelerateType(String accelerateType) {
            this.accelerateType = accelerateType;
            return this;
        }
        public String getAccelerateType() {
            return this.accelerateType;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setAcceleratedStorageSpace(String acceleratedStorageSpace) {
            this.acceleratedStorageSpace = acceleratedStorageSpace;
            return this;
        }
        public String getAcceleratedStorageSpace() {
            return this.acceleratedStorageSpace;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setAcceleratingEnable(String acceleratingEnable) {
            this.acceleratingEnable = acceleratingEnable;
            return this;
        }
        public String getAcceleratingEnable() {
            return this.acceleratingEnable;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setMountInfo(DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo mountInfo) {
            this.mountInfo = mountInfo;
            return this;
        }
        public DescribePolarFsResponseBodyItemsPolarFsPathsMountInfo getMountInfo() {
            return this.mountInfo;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setMountedAIDBClusters(DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClusters mountedAIDBClusters) {
            this.mountedAIDBClusters = mountedAIDBClusters;
            return this;
        }
        public DescribePolarFsResponseBodyItemsPolarFsPathsMountedAIDBClusters getMountedAIDBClusters() {
            return this.mountedAIDBClusters;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setPolarFsInstanceDescription(String polarFsInstanceDescription) {
            this.polarFsInstanceDescription = polarFsInstanceDescription;
            return this;
        }
        public String getPolarFsInstanceDescription() {
            return this.polarFsInstanceDescription;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setPolarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }
        public String getPolarFsInstanceId() {
            return this.polarFsInstanceId;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setPolarFsPath(String polarFsPath) {
            this.polarFsPath = polarFsPath;
            return this;
        }
        public String getPolarFsPath() {
            return this.polarFsPath;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setPolarFsStatus(String polarFsStatus) {
            this.polarFsStatus = polarFsStatus;
            return this;
        }
        public String getPolarFsStatus() {
            return this.polarFsStatus;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setPolarFsType(String polarFsType) {
            this.polarFsType = polarFsType;
            return this;
        }
        public String getPolarFsType() {
            return this.polarFsType;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setRelativeDbClusterId(String relativeDbClusterId) {
            this.relativeDbClusterId = relativeDbClusterId;
            return this;
        }
        public String getRelativeDbClusterId() {
            return this.relativeDbClusterId;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setStorageSpace(Long storageSpace) {
            this.storageSpace = storageSpace;
            return this;
        }
        public Long getStorageSpace() {
            return this.storageSpace;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setTags(DescribePolarFsResponseBodyItemsPolarFsPathsTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribePolarFsResponseBodyItemsPolarFsPathsTags getTags() {
            return this.tags;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribePolarFsResponseBodyItemsPolarFsPaths setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribePolarFsResponseBodyItems extends TeaModel {
        @NameInMap("PolarFsPaths")
        public java.util.List<DescribePolarFsResponseBodyItemsPolarFsPaths> polarFsPaths;

        public static DescribePolarFsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsResponseBodyItems self = new DescribePolarFsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsResponseBodyItems setPolarFsPaths(java.util.List<DescribePolarFsResponseBodyItemsPolarFsPaths> polarFsPaths) {
            this.polarFsPaths = polarFsPaths;
            return this;
        }
        public java.util.List<DescribePolarFsResponseBodyItemsPolarFsPaths> getPolarFsPaths() {
            return this.polarFsPaths;
        }

    }

}
