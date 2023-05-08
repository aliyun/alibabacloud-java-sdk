// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetCriteriaRequest extends TeaModel {
    /**
     * <p>The name of the filter condition. Valid values:</p>
     * <br>
     * <p>*   **instanceId**: the ID of the instance</p>
     * <p>*   **instanceName**: the name of an instance</p>
     * <p>*   **internetIp**: the public IP address</p>
     * <p>*   **riskStatus**: the risk status</p>
     * <p>*   **vendorRegionId**: the region ID by service provider</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<GetCloudAssetCriteriaRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>The type of the filter condition. Valid values:</p>
     * <br>
     * <p>*   **input**: The filter condition needs to be specified.</p>
     * <p>*   **select**: The filter condition is an option that can be selected from the drop-down list.</p>
     */
    @NameInMap("Value")
    public String value;

    public static GetCloudAssetCriteriaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetCriteriaRequest self = new GetCloudAssetCriteriaRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetCriteriaRequest setCloudAssetTypes(java.util.List<GetCloudAssetCriteriaRequestCloudAssetTypes> cloudAssetTypes) {
        this.cloudAssetTypes = cloudAssetTypes;
        return this;
    }
    public java.util.List<GetCloudAssetCriteriaRequestCloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    public GetCloudAssetCriteriaRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public static class GetCloudAssetCriteriaRequestCloudAssetTypes extends TeaModel {
        /**
         * <p>The type of the asset by source. Valid values:</p>
         * <br>
         * <p>*   **0**: Elastic Compute Service (ECS)</p>
         * <p>*   **1**: Server Load Balancer (SLB)</p>
         * <p>*   **3**: ApsaraDB RDS</p>
         * <p>*   **4**: ApsaraDB for MongoDB (MongoDB)</p>
         * <p>*   **5**: ApsaraDB for Redis (Redis)</p>
         * <p>*   **6**: Container Registry</p>
         * <p>*   **8**: Container Service for Kubernetes (ACK)</p>
         * <p>*   **9**: Virtual Private Cloud (VPC)</p>
         * <p>*   **11**: ActionTrail</p>
         * <p>*   **12**: Alibaba Cloud CDN (CDN)</p>
         * <p>*   **13**: Certificate Management Service (formerly SSL Certificates Service)</p>
         * <p>*   **14**: Apsara Devops</p>
         * <p>*   **16**: Anti-DDoS</p>
         * <p>*   **17**: Web Application Firewall (WAF)</p>
         * <p>*   **18**: Object Storage Service (OSS)</p>
         * <p>*   **19**: PolarDB</p>
         * <p>*   **20**: ApsaraDB RDS for PostgreSQL</p>
         * <p>*   **21**: Microservices Engine (MSE)</p>
         * <p>*   **22**: Apsara File Storage NAS (NAS)</p>
         * <p>*   **23**: Data Security Center (DSC)</p>
         * <p>*   **24**: Elastic IP Address (EIP)</p>
         * <p>*   **25**: IDaaS EIAM</p>
         * <p>*   **26**: PolarDB-X</p>
         * <p>*   **27**: Elasticsearch</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the cloud asset.</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        public static GetCloudAssetCriteriaRequestCloudAssetTypes build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetCriteriaRequestCloudAssetTypes self = new GetCloudAssetCriteriaRequestCloudAssetTypes();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetCriteriaRequestCloudAssetTypes setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetCriteriaRequestCloudAssetTypes setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

    }

}
