// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DescribeSyncInfoResponseBody extends TeaModel {
    @NameInMap("InstanceInfo")
    public DescribeSyncInfoResponseBodyInstanceInfo instanceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSyncInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncInfoResponseBody self = new DescribeSyncInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncInfoResponseBody setInstanceInfo(DescribeSyncInfoResponseBodyInstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public DescribeSyncInfoResponseBodyInstanceInfo getInstanceInfo() {
        return this.instanceInfo;
    }

    public DescribeSyncInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSyncInfoResponseBodyInstanceInfo extends TeaModel {
        @NameInMap("AccessType")
        public Integer accessType;

        @NameInMap("Aliuid")
        public Long aliuid;

        @NameInMap("CustomName")
        public String customName;

        @NameInMap("EcsEip")
        public String ecsEip;

        @NameInMap("EcsInstanceId")
        public String ecsInstanceId;

        @NameInMap("EcsInternetIp")
        public String ecsInternetIp;

        @NameInMap("EcsIntranetIp")
        public String ecsIntranetIp;

        @NameInMap("EcsNetworkType")
        public String ecsNetworkType;

        @NameInMap("EcsStatus")
        public String ecsStatus;

        @NameInMap("EcsUuid")
        public String ecsUuid;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("ImageVersionName")
        public String imageVersionName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PlanCode")
        public String planCode;

        @NameInMap("PlanName")
        public String planName;

        @NameInMap("PlanUpgradeStatus")
        public Integer planUpgradeStatus;

        @NameInMap("PlanUpgradeable")
        public String planUpgradeable;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("PublicAccessControl")
        public Integer publicAccessControl;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("Renewable")
        public Boolean renewable;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpgradeStatus")
        public Integer upgradeStatus;

        @NameInMap("VendorCode")
        public String vendorCode;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("ZoneNo")
        public String zoneNo;

        public static DescribeSyncInfoResponseBodyInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncInfoResponseBodyInstanceInfo self = new DescribeSyncInfoResponseBodyInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setAccessType(Integer accessType) {
            this.accessType = accessType;
            return this;
        }
        public Integer getAccessType() {
            return this.accessType;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setCustomName(String customName) {
            this.customName = customName;
            return this;
        }
        public String getCustomName() {
            return this.customName;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setEcsEip(String ecsEip) {
            this.ecsEip = ecsEip;
            return this;
        }
        public String getEcsEip() {
            return this.ecsEip;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setEcsInstanceId(String ecsInstanceId) {
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setEcsInternetIp(String ecsInternetIp) {
            this.ecsInternetIp = ecsInternetIp;
            return this;
        }
        public String getEcsInternetIp() {
            return this.ecsInternetIp;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setEcsIntranetIp(String ecsIntranetIp) {
            this.ecsIntranetIp = ecsIntranetIp;
            return this;
        }
        public String getEcsIntranetIp() {
            return this.ecsIntranetIp;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setEcsNetworkType(String ecsNetworkType) {
            this.ecsNetworkType = ecsNetworkType;
            return this;
        }
        public String getEcsNetworkType() {
            return this.ecsNetworkType;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setEcsStatus(String ecsStatus) {
            this.ecsStatus = ecsStatus;
            return this;
        }
        public String getEcsStatus() {
            return this.ecsStatus;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setEcsUuid(String ecsUuid) {
            this.ecsUuid = ecsUuid;
            return this;
        }
        public String getEcsUuid() {
            return this.ecsUuid;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setImageVersionName(String imageVersionName) {
            this.imageVersionName = imageVersionName;
            return this;
        }
        public String getImageVersionName() {
            return this.imageVersionName;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setPlanCode(String planCode) {
            this.planCode = planCode;
            return this;
        }
        public String getPlanCode() {
            return this.planCode;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setPlanName(String planName) {
            this.planName = planName;
            return this;
        }
        public String getPlanName() {
            return this.planName;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setPlanUpgradeStatus(Integer planUpgradeStatus) {
            this.planUpgradeStatus = planUpgradeStatus;
            return this;
        }
        public Integer getPlanUpgradeStatus() {
            return this.planUpgradeStatus;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setPlanUpgradeable(String planUpgradeable) {
            this.planUpgradeable = planUpgradeable;
            return this;
        }
        public String getPlanUpgradeable() {
            return this.planUpgradeable;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setPublicAccessControl(Integer publicAccessControl) {
            this.publicAccessControl = publicAccessControl;
            return this;
        }
        public Integer getPublicAccessControl() {
            return this.publicAccessControl;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setRenewable(Boolean renewable) {
            this.renewable = renewable;
            return this;
        }
        public Boolean getRenewable() {
            return this.renewable;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setUpgradeStatus(Integer upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public Integer getUpgradeStatus() {
            return this.upgradeStatus;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setVendorCode(String vendorCode) {
            this.vendorCode = vendorCode;
            return this;
        }
        public String getVendorCode() {
            return this.vendorCode;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeSyncInfoResponseBodyInstanceInfo setZoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }
        public String getZoneNo() {
            return this.zoneNo;
        }

    }

}
