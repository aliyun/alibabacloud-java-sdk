// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetDetailRequest extends TeaModel {
    /**
     * <p>The subtype of the cloud service.</p>
     */
    @NameInMap("AssetSubType")
    public Integer assetSubType;

    /**
     * <p>The type of the cloud asset. Valid values:</p>
     * <br>
     * <p>*   **0**: Elastic Compute Service (ECS).</p>
     * <p>*   **1**: Server Load Balancer (SLB).</p>
     * <p>*   **3**: ApsaraDB RDS.</p>
     * <p>*   **4**: ApsaraDB for MongoDB.</p>
     * <p>*   **5**: ApsaraDB for Redis.</p>
     * <p>*   **6**: Container Registry.</p>
     * <p>*   **8**: Container Service for Kubernetes.</p>
     * <p>*   **9**: Virtual Private Cloud (VPC).</p>
     * <p>*   **11**: ActionTrail.</p>
     * <p>*   **12**: Alibaba Cloud CDN (CDN).</p>
     * <p>*   **13**: Certificate Management Service.</p>
     * <p>*   **14**: Apsara Devops.</p>
     * <p>*   **15**: Resource Access Management (RAM).</p>
     * <p>*   **16**: Anti-DDoS.</p>
     * <p>*   **17**: Web Application Firewall (WAF).</p>
     * <p>*   **18**: Object Storage Service (OSS).</p>
     * <p>*   **19**: PolarDB.</p>
     * <p>*   **20**: ApsaraDB RDS for PostgreSQL.</p>
     * <p>*   **21**: Microservices Engine (MSE).</p>
     * <p>*   **22**: Apsara File Storage NAS (NAS).</p>
     * <p>*   **23**: Data Security Center (DSC).</p>
     * <p>*   **24**: Elastic IP Address (EIP).</p>
     * <p>*   **25**: Identity as a Service (IDaaS)-Employee Identity and Access Management (EIAM).</p>
     * <p>*   **26**: PolarDB-X.</p>
     * <p>*   **27**: Elasticsearch.</p>
     */
    @NameInMap("AssetType")
    public Integer assetType;

    /**
     * <p>The details of the assets.</p>
     */
    @NameInMap("CloudAssetInstances")
    public java.util.List<GetCloudAssetDetailRequestCloudAssetInstances> cloudAssetInstances;

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

    public static GetCloudAssetDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetDetailRequest self = new GetCloudAssetDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetDetailRequest setAssetSubType(Integer assetSubType) {
        this.assetSubType = assetSubType;
        return this;
    }
    public Integer getAssetSubType() {
        return this.assetSubType;
    }

    public GetCloudAssetDetailRequest setAssetType(Integer assetType) {
        this.assetType = assetType;
        return this;
    }
    public Integer getAssetType() {
        return this.assetType;
    }

    public GetCloudAssetDetailRequest setCloudAssetInstances(java.util.List<GetCloudAssetDetailRequestCloudAssetInstances> cloudAssetInstances) {
        this.cloudAssetInstances = cloudAssetInstances;
        return this;
    }
    public java.util.List<GetCloudAssetDetailRequestCloudAssetInstances> getCloudAssetInstances() {
        return this.cloudAssetInstances;
    }

    public GetCloudAssetDetailRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

    public static class GetCloudAssetDetailRequestCloudAssetInstances extends TeaModel {
        /**
         * <p>The instance ID of the cloud asset.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region in which the cloud asset resides.</p>
         * <br>
         * <p>> For more information about the mapping between region IDs and region names, see [Regions and zones](https://help.aliyun.com/document_detail/40654.html).</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetCloudAssetDetailRequestCloudAssetInstances build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetDetailRequestCloudAssetInstances self = new GetCloudAssetDetailRequestCloudAssetInstances();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetDetailRequestCloudAssetInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCloudAssetDetailRequestCloudAssetInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
