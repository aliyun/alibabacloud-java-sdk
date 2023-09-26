// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetDetailResponseBody extends TeaModel {
    /**
     * <p>The number of instances in the list of cloud assets returned.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>An array that consists of the details of the cloud assets.</p>
     */
    @NameInMap("Instances")
    public java.util.List<GetCloudAssetDetailResponseBodyInstances> instances;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>Indicates whether alerts are generated for the current cloud asset. Valid values:</p>
         * <br>
         * <p>*   **YES**</p>
         * <p>*   **NO**</p>
         */
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        /**
         * <p>The subtype of the cloud asset.</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The name of the cloud asset subtype.</p>
         */
        @NameInMap("AssetSubTypeName")
        public String assetSubTypeName;

        /**
         * <p>The type of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: ECS.</p>
         * <p>*   **1**: SLB.</p>
         * <p>*   **3**: ApsaraDB RDS.</p>
         * <p>*   **4**: ApsaraDB for MongoDB.</p>
         * <p>*   **5**: ApsaraDB for Redis.</p>
         * <p>*   **6**: Container Registry.</p>
         * <p>*   **8**: Container Service for Kubernetes.</p>
         * <p>*   **9**: VPC.</p>
         * <p>*   **11**: ActionTrail.</p>
         * <p>*   **12**: CDN.</p>
         * <p>*   **13**: Certificate Management Service.</p>
         * <p>*   **14**: Apsara Devops.</p>
         * <p>*   **15**: RAM.</p>
         * <p>*   **16**: Anti-DDoS.</p>
         * <p>*   **17**: WAF.</p>
         * <p>*   **18**: OSS.</p>
         * <p>*   **19**: PolarDB.</p>
         * <p>*   **20**: ApsaraDB RDS for PostgreSQL.</p>
         * <p>*   **21**: MSE.</p>
         * <p>*   **22**: NAS.</p>
         * <p>*   **23**: DSC.</p>
         * <p>*   **24**: EIP.</p>
         * <p>*   **25**: IDaaS-EIAM.</p>
         * <p>*   **26**: PolarDB-X.</p>
         * <p>*   **27**: Elasticsearch.</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The name of the cloud asset type.</p>
         */
        @NameInMap("AssetTypeName")
        public String assetTypeName;

        /**
         * <p>The time when the instance was created. The value is a timestamp.</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The detailed address of the cloud asset.</p>
         */
        @NameInMap("DetailLink")
        public String detailLink;

        /**
         * <p>The instance ID of the cloud asset.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the cloud asset.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the instance.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The region in which the cloud asset resides.</p>
         * <br>
         * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Indicates whether risks are detected on the current cloud asset. Valid values:</p>
         * <br>
         * <p>*   **YES**</p>
         * <p>*   **NO**</p>
         */
        @NameInMap("RiskStatus")
        public String riskStatus;

        /**
         * <p>The security information about the cloud asset.</p>
         */
        @NameInMap("SecurityInfo")
        public String securityInfo;

        /**
         * <p>The service provider of the cloud asset. Valid values:</p>
         * <br>
         * <p>*   **0**: Alibaba Cloud.</p>
         * <p>*   **1**: service provider that is unrecognized.</p>
         * <p>*   **2**: data center.</p>
         * <p>*   **3**, **4**, **5**, and **7**: third-party service provider.</p>
         * <p>*   **8**: simple application server.</p>
         */
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
