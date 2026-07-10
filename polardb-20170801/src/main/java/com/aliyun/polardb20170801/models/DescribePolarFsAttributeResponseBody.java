// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsAttributeResponseBody extends TeaModel {
    /**
     * <p>The acceleration type.</p>
     * 
     * <strong>example:</strong>
     * <p>alluxio</p>
     */
    @NameInMap("AccelerateType")
    public String accelerateType;

    /**
     * <p>The acceleration storage space. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("AcceleratedStorageSpace")
    public Double acceleratedStorageSpace;

    /**
     * <p>Specifies whether the acceleration cache is enabled. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong>: Enabled.</li>
     * <li><strong>OFF</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
    @NameInMap("AcceleratingEnable")
    public String acceleratingEnable;

    /**
     * <p>The bandwidth. Unit: MB/s.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Bandwidth")
    public Double bandwidth;

    /**
     * <p>The bandwidth baseline. Unit: MB/s/TiB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("BandwidthBaseLine")
    public Double bandwidthBaseLine;

    /**
     * <p>The bucket ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("BucketId")
    public String bucketId;

    /**
     * <p>The PolarLakebase edition. Valid values:</p>
     * <ul>
     * <li><p><strong>high_performance</strong>: High-performance Edition.</p>
     * </li>
     * <li><p><strong>basic</strong>: Basic Edition.</p>
     * </li>
     * <li><p><strong>cold</strong>: Cold Storage Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high_performance</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client download URL.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://*</p>
     */
    @NameInMap("ClientDownloadPath")
    public String clientDownloadPath;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-02T05:57:10Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The custom bucket path.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx-%d.oss-cn-beijing-internal.aliyuncs.com</p>
     */
    @NameInMap("CustomBucketPath")
    public String customBucketPath;

    /**
     * <p>The list of custom storage paths.</p>
     */
    @NameInMap("CustomBucketPathList")
    public java.util.List<DescribePolarFsAttributeResponseBodyCustomBucketPathList> customBucketPathList;

    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The database ecosystem type. Valid values: </p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("DBType")
    public String DBType;

    @NameInMap("EndpointItems")
    public java.util.List<DescribePolarFsAttributeResponseBodyEndpointItems> endpointItems;

    /**
     * <p>The expiration time of the cluster.</p>
     * <blockquote>
     * <p>This parameter is returned only for clusters that use the <strong>Prepaid</strong> (subscription) billing method. An empty value is returned for <strong>Postpaid</strong> (pay-as-you-go) clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2025-10-10T16:00:00Z</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>Indicates whether the cluster has expired.</p>
     * <blockquote>
     * <p>This parameter is returned only for clusters that use the <strong>Prepaid</strong> (subscription) billing method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The file system ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The lock mode. Valid values: </p>
     * <ul>
     * <li><strong>Unlock</strong>: Not locked.</li>
     * <li><strong>ManualLock</strong>: Manually locked. </li>
     * <li><strong>LockByExpiration</strong>: Automatically locked due to cluster expiration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Unlock</p>
     */
    @NameInMap("LockMode")
    public String lockMode;

    @NameInMap("MaxscaleEndpointId")
    public String maxscaleEndpointId;

    @NameInMap("MetaConnString")
    public String metaConnString;

    /**
     * <strong>example:</strong>
     * <p>pc-xxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("MetaInstanceName")
    public String metaInstanceName;

    @NameInMap("MetaMxsConnString")
    public String metaMxsConnString;

    /**
     * <p>The encrypted metadata URL for Fuse mounting.</p>
     * 
     * <strong>example:</strong>
     * <p>e6cc1d2e2a6fa292038d999fda6501*****</p>
     */
    @NameInMap("MetaUrl")
    public String metaUrl;

    /**
     * <p>The minor version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.3.0-v1.1.1</p>
     */
    @NameInMap("MinorVersion")
    public String minorVersion;

    /**
     * <p>The mount configuration.</p>
     */
    @NameInMap("MountInfo")
    public DescribePolarFsAttributeResponseBodyMountInfo mountInfo;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Prepaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The description of the PolarLakebase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-xxx</p>
     */
    @NameInMap("PolarFsInstanceDescription")
    public String polarFsInstanceDescription;

    /**
     * <p>The PolarLakebase instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The PolarLakebase instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("PolarFsStatus")
    public String polarFsStatus;

    /**
     * <p>The instance version. Valid values:</p>
     * <ul>
     * <li><strong>PolarFS 2.0</strong>: 2.0.</li>
     * <li><strong>PolarFS 1.0</strong>: 1.0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PolarFS 2.0</p>
     */
    @NameInMap("PolarFsType")
    public String polarFsType;

    /**
     * <p>The version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1-1.0.3</p>
     */
    @NameInMap("PolarFsVersion")
    public String polarFsVersion;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the associated PolarDB cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zejpr41d9xk3uk34</p>
     */
    @NameInMap("RelativeDbClusterId")
    public String relativeDbClusterId;

    /**
     * <p>The instance ID of the associated PolarLakebase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-**********</p>
     */
    @NameInMap("RelativePfsClusterId")
    public String relativePfsClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3F9E6A3B-C13E-4064-A010-18582A******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The managed security group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-bp**************</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The storage space. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("StorageSpace")
    public Double storageSpace;

    /**
     * <p>The storage type for the High-performance Edition. Valid values:</p>
     * <ul>
     * <li><strong>ESSDPL1</strong></li>
     * <li><strong>ESSDPL0</strong></li>
     * </ul>
     * <p>The storage type for the Basic Edition. Valid values:</p>
     * <ul>
     * <li><strong>city_redundancy</strong>: zone-redundant storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>essdpl1</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The used storage space. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>3012558848</p>
     */
    @NameInMap("StorageUsed")
    public Double storageUsed;

    /**
     * <strong>example:</strong>
     * <p>lakebase_acc</p>
     */
    @NameInMap("UserDefaultAccName")
    public String userDefaultAccName;

    /**
     * <strong>example:</strong>
     * <p>EncryptedSecretKey==</p>
     */
    @NameInMap("UserDefaultAccSk")
    public String userDefaultAccSk;

    /**
     * <p>The VPC ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-**********</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-**************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-k</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribePolarFsAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsAttributeResponseBody self = new DescribePolarFsAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsAttributeResponseBody setAccelerateType(String accelerateType) {
        this.accelerateType = accelerateType;
        return this;
    }
    public String getAccelerateType() {
        return this.accelerateType;
    }

    public DescribePolarFsAttributeResponseBody setAcceleratedStorageSpace(Double acceleratedStorageSpace) {
        this.acceleratedStorageSpace = acceleratedStorageSpace;
        return this;
    }
    public Double getAcceleratedStorageSpace() {
        return this.acceleratedStorageSpace;
    }

    public DescribePolarFsAttributeResponseBody setAcceleratingEnable(String acceleratingEnable) {
        this.acceleratingEnable = acceleratingEnable;
        return this;
    }
    public String getAcceleratingEnable() {
        return this.acceleratingEnable;
    }

    public DescribePolarFsAttributeResponseBody setBandwidth(Double bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Double getBandwidth() {
        return this.bandwidth;
    }

    public DescribePolarFsAttributeResponseBody setBandwidthBaseLine(Double bandwidthBaseLine) {
        this.bandwidthBaseLine = bandwidthBaseLine;
        return this;
    }
    public Double getBandwidthBaseLine() {
        return this.bandwidthBaseLine;
    }

    public DescribePolarFsAttributeResponseBody setBucketId(String bucketId) {
        this.bucketId = bucketId;
        return this;
    }
    public String getBucketId() {
        return this.bucketId;
    }

    public DescribePolarFsAttributeResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribePolarFsAttributeResponseBody setClientDownloadPath(String clientDownloadPath) {
        this.clientDownloadPath = clientDownloadPath;
        return this;
    }
    public String getClientDownloadPath() {
        return this.clientDownloadPath;
    }

    public DescribePolarFsAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribePolarFsAttributeResponseBody setCustomBucketPath(String customBucketPath) {
        this.customBucketPath = customBucketPath;
        return this;
    }
    public String getCustomBucketPath() {
        return this.customBucketPath;
    }

    public DescribePolarFsAttributeResponseBody setCustomBucketPathList(java.util.List<DescribePolarFsAttributeResponseBodyCustomBucketPathList> customBucketPathList) {
        this.customBucketPathList = customBucketPathList;
        return this;
    }
    public java.util.List<DescribePolarFsAttributeResponseBodyCustomBucketPathList> getCustomBucketPathList() {
        return this.customBucketPathList;
    }

    public DescribePolarFsAttributeResponseBody setDBEndpointId(String DBEndpointId) {
        this.DBEndpointId = DBEndpointId;
        return this;
    }
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    public DescribePolarFsAttributeResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribePolarFsAttributeResponseBody setEndpointItems(java.util.List<DescribePolarFsAttributeResponseBodyEndpointItems> endpointItems) {
        this.endpointItems = endpointItems;
        return this;
    }
    public java.util.List<DescribePolarFsAttributeResponseBodyEndpointItems> getEndpointItems() {
        return this.endpointItems;
    }

    public DescribePolarFsAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribePolarFsAttributeResponseBody setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribePolarFsAttributeResponseBody setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribePolarFsAttributeResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribePolarFsAttributeResponseBody setMaxscaleEndpointId(String maxscaleEndpointId) {
        this.maxscaleEndpointId = maxscaleEndpointId;
        return this;
    }
    public String getMaxscaleEndpointId() {
        return this.maxscaleEndpointId;
    }

    public DescribePolarFsAttributeResponseBody setMetaConnString(String metaConnString) {
        this.metaConnString = metaConnString;
        return this;
    }
    public String getMetaConnString() {
        return this.metaConnString;
    }

    public DescribePolarFsAttributeResponseBody setMetaInstanceName(String metaInstanceName) {
        this.metaInstanceName = metaInstanceName;
        return this;
    }
    public String getMetaInstanceName() {
        return this.metaInstanceName;
    }

    public DescribePolarFsAttributeResponseBody setMetaMxsConnString(String metaMxsConnString) {
        this.metaMxsConnString = metaMxsConnString;
        return this;
    }
    public String getMetaMxsConnString() {
        return this.metaMxsConnString;
    }

    public DescribePolarFsAttributeResponseBody setMetaUrl(String metaUrl) {
        this.metaUrl = metaUrl;
        return this;
    }
    public String getMetaUrl() {
        return this.metaUrl;
    }

    public DescribePolarFsAttributeResponseBody setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public DescribePolarFsAttributeResponseBody setMountInfo(DescribePolarFsAttributeResponseBodyMountInfo mountInfo) {
        this.mountInfo = mountInfo;
        return this;
    }
    public DescribePolarFsAttributeResponseBodyMountInfo getMountInfo() {
        return this.mountInfo;
    }

    public DescribePolarFsAttributeResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribePolarFsAttributeResponseBody setPolarFsInstanceDescription(String polarFsInstanceDescription) {
        this.polarFsInstanceDescription = polarFsInstanceDescription;
        return this;
    }
    public String getPolarFsInstanceDescription() {
        return this.polarFsInstanceDescription;
    }

    public DescribePolarFsAttributeResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribePolarFsAttributeResponseBody setPolarFsStatus(String polarFsStatus) {
        this.polarFsStatus = polarFsStatus;
        return this;
    }
    public String getPolarFsStatus() {
        return this.polarFsStatus;
    }

    public DescribePolarFsAttributeResponseBody setPolarFsType(String polarFsType) {
        this.polarFsType = polarFsType;
        return this;
    }
    public String getPolarFsType() {
        return this.polarFsType;
    }

    public DescribePolarFsAttributeResponseBody setPolarFsVersion(String polarFsVersion) {
        this.polarFsVersion = polarFsVersion;
        return this;
    }
    public String getPolarFsVersion() {
        return this.polarFsVersion;
    }

    public DescribePolarFsAttributeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePolarFsAttributeResponseBody setRelativeDbClusterId(String relativeDbClusterId) {
        this.relativeDbClusterId = relativeDbClusterId;
        return this;
    }
    public String getRelativeDbClusterId() {
        return this.relativeDbClusterId;
    }

    public DescribePolarFsAttributeResponseBody setRelativePfsClusterId(String relativePfsClusterId) {
        this.relativePfsClusterId = relativePfsClusterId;
        return this;
    }
    public String getRelativePfsClusterId() {
        return this.relativePfsClusterId;
    }

    public DescribePolarFsAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarFsAttributeResponseBody setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DescribePolarFsAttributeResponseBody setStorageSpace(Double storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public Double getStorageSpace() {
        return this.storageSpace;
    }

    public DescribePolarFsAttributeResponseBody setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public DescribePolarFsAttributeResponseBody setStorageUsed(Double storageUsed) {
        this.storageUsed = storageUsed;
        return this;
    }
    public Double getStorageUsed() {
        return this.storageUsed;
    }

    public DescribePolarFsAttributeResponseBody setUserDefaultAccName(String userDefaultAccName) {
        this.userDefaultAccName = userDefaultAccName;
        return this;
    }
    public String getUserDefaultAccName() {
        return this.userDefaultAccName;
    }

    public DescribePolarFsAttributeResponseBody setUserDefaultAccSk(String userDefaultAccSk) {
        this.userDefaultAccSk = userDefaultAccSk;
        return this;
    }
    public String getUserDefaultAccSk() {
        return this.userDefaultAccSk;
    }

    public DescribePolarFsAttributeResponseBody setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public DescribePolarFsAttributeResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribePolarFsAttributeResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribePolarFsAttributeResponseBodyCustomBucketPathList extends TeaModel {
        /**
         * <p>The custom storage bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx.oss-[regionId]-internal.aliyuncs.com</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The custom storage path.</p>
         * 
         * <strong>example:</strong>
         * <p>/data</p>
         */
        @NameInMap("Path")
        public String path;

        public static DescribePolarFsAttributeResponseBodyCustomBucketPathList build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsAttributeResponseBodyCustomBucketPathList self = new DescribePolarFsAttributeResponseBodyCustomBucketPathList();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsAttributeResponseBodyCustomBucketPathList setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribePolarFsAttributeResponseBodyCustomBucketPathList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems extends TeaModel {
        @NameInMap("ConnectionString")
        public String connectionString;

        @NameInMap("IPAddress")
        public String IPAddress;

        @NameInMap("NetType")
        public String netType;

        @NameInMap("Port")
        public String port;

        @NameInMap("VPCId")
        public String VPCId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems self = new DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
            return this;
        }
        public String getIPAddress() {
            return this.IPAddress;
        }

        public DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems setNetType(String netType) {
            this.netType = netType;
            return this;
        }
        public String getNetType() {
            return this.netType;
        }

        public DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems setVPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }
        public String getVPCId() {
            return this.VPCId;
        }

        public DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribePolarFsAttributeResponseBodyEndpointItems extends TeaModel {
        @NameInMap("AddressItems")
        public java.util.List<DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems> addressItems;

        /**
         * <strong>example:</strong>
         * <p>ep-xxxxxxxxx</p>
         */
        @NameInMap("DBEndpointId")
        public String DBEndpointId;

        /**
         * <strong>example:</strong>
         * <p>S3Gateway</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        public static DescribePolarFsAttributeResponseBodyEndpointItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsAttributeResponseBodyEndpointItems self = new DescribePolarFsAttributeResponseBodyEndpointItems();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsAttributeResponseBodyEndpointItems setAddressItems(java.util.List<DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems> addressItems) {
            this.addressItems = addressItems;
            return this;
        }
        public java.util.List<DescribePolarFsAttributeResponseBodyEndpointItemsAddressItems> getAddressItems() {
            return this.addressItems;
        }

        public DescribePolarFsAttributeResponseBodyEndpointItems setDBEndpointId(String DBEndpointId) {
            this.DBEndpointId = DBEndpointId;
            return this;
        }
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        public DescribePolarFsAttributeResponseBodyEndpointItems setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

    }

    public static class DescribePolarFsAttributeResponseBodyMountInfo extends TeaModel {
        /**
         * <p>The cluster management endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP://<strong>.</strong>.<strong>.</strong>:3000,TCP://<strong>.</strong>.<strong>.</strong>:3000,TCP://<strong>.</strong>.<strong>.</strong>:3000</p>
         */
        @NameInMap("PolarDbProxy")
        public String polarDbProxy;

        /**
         * <p>The file system name.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-**********</p>
         */
        @NameInMap("PolarFsCluster")
        public String polarFsCluster;

        /**
         * <p>The token value.</p>
         * 
         * <strong>example:</strong>
         * <p>a734298c391cb9ebd05e2ee85feb624</p>
         */
        @NameInMap("Token")
        public String token;

        public static DescribePolarFsAttributeResponseBodyMountInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsAttributeResponseBodyMountInfo self = new DescribePolarFsAttributeResponseBodyMountInfo();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsAttributeResponseBodyMountInfo setPolarDbProxy(String polarDbProxy) {
            this.polarDbProxy = polarDbProxy;
            return this;
        }
        public String getPolarDbProxy() {
            return this.polarDbProxy;
        }

        public DescribePolarFsAttributeResponseBodyMountInfo setPolarFsCluster(String polarFsCluster) {
            this.polarFsCluster = polarFsCluster;
            return this;
        }
        public String getPolarFsCluster() {
            return this.polarFsCluster;
        }

        public DescribePolarFsAttributeResponseBodyMountInfo setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
