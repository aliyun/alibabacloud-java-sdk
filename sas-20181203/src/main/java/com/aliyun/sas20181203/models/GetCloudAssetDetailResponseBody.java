// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetDetailResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Instances")
    public java.util.List<GetCloudAssetDetailResponseBodyInstances> instances;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudAssetDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetDetailResponseBody self = new GetCloudAssetDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetDetailResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetCloudAssetDetailResponseBody setInstances(java.util.List<GetCloudAssetDetailResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<GetCloudAssetDetailResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public GetCloudAssetDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudAssetDetailResponseBodyInstances extends TeaModel {
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AssetSubType")
        public Integer assetSubType;

        @NameInMap("AssetSubTypeName")
        public String assetSubTypeName;

        @NameInMap("AssetType")
        public Integer assetType;

        @NameInMap("AssetTypeName")
        public String assetTypeName;

        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("DetailLink")
        public String detailLink;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RiskStatus")
        public String riskStatus;

        @NameInMap("SecurityInfo")
        public String securityInfo;

        @NameInMap("Vendor")
        public Integer vendor;

        public static GetCloudAssetDetailResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetDetailResponseBodyInstances self = new GetCloudAssetDetailResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetDetailResponseBodyInstances setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public GetCloudAssetDetailResponseBodyInstances setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetDetailResponseBodyInstances setAssetSubTypeName(String assetSubTypeName) {
            this.assetSubTypeName = assetSubTypeName;
            return this;
        }
        public String getAssetSubTypeName() {
            return this.assetSubTypeName;
        }

        public GetCloudAssetDetailResponseBodyInstances setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public GetCloudAssetDetailResponseBodyInstances setAssetTypeName(String assetTypeName) {
            this.assetTypeName = assetTypeName;
            return this;
        }
        public String getAssetTypeName() {
            return this.assetTypeName;
        }

        public GetCloudAssetDetailResponseBodyInstances setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetCloudAssetDetailResponseBodyInstances setDetailLink(String detailLink) {
            this.detailLink = detailLink;
            return this;
        }
        public String getDetailLink() {
            return this.detailLink;
        }

        public GetCloudAssetDetailResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCloudAssetDetailResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetCloudAssetDetailResponseBodyInstances setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetCloudAssetDetailResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCloudAssetDetailResponseBodyInstances setRiskStatus(String riskStatus) {
            this.riskStatus = riskStatus;
            return this;
        }
        public String getRiskStatus() {
            return this.riskStatus;
        }

        public GetCloudAssetDetailResponseBodyInstances setSecurityInfo(String securityInfo) {
            this.securityInfo = securityInfo;
            return this;
        }
        public String getSecurityInfo() {
            return this.securityInfo;
        }

        public GetCloudAssetDetailResponseBodyInstances setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
