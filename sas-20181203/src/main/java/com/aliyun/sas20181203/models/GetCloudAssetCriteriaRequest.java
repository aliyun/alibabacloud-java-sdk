// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetCriteriaRequest extends TeaModel {
    /**
     * <p>The types of cloud assets.</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<GetCloudAssetCriteriaRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>The keyword for fuzzy search when you query the asset.</p>
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
         * <p>The subtype of the cloud service or asset. Valid values:</p>
         * <br>
         * <p>*   **0**: ECS</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <p>    *   **1**: disk (storage)</p>
         * <p>    *   **2**: security group</p>
         * <br>
         * <p>*   **1**: SLB</p>
         * <br>
         * <p>    *   **0**: SLB</p>
         * <p>    *   **1**: Application Load Balancer (ALB)</p>
         * <br>
         * <p>*   **3**: ApsaraDB RDS</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **4**: MongoDB</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **5**: Redis</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **6**: Container Registry</p>
         * <br>
         * <p>    *   **1**: Enterprise Edition</p>
         * <p>    *   **2**: Personal Edition</p>
         * <br>
         * <p>*   **8**: ACK</p>
         * <br>
         * <p>    *   **0**: cluster</p>
         * <br>
         * <p>*   **9**: VPC</p>
         * <br>
         * <p>    *   **0**: NAT gateway</p>
         * <p>    *   **1**: Elastic IP address (EIP)</p>
         * <p>    *   **2**: VPN</p>
         * <p>    *   **3**: VPC Flow Logs</p>
         * <br>
         * <p>*   **11**: ActionTrail</p>
         * <br>
         * <p>    *   **0**: trail</p>
         * <br>
         * <p>*   **12**: CDN</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **13**: Certificate Management Service (formerly SSL Certificates Service)</p>
         * <br>
         * <p>    *   **0**: certificate</p>
         * <br>
         * <p>*   **14**: Apsara Devops</p>
         * <br>
         * <p>    *   **0**: organization</p>
         * <br>
         * <p>*   **16**: Anti-DDoS</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **17**: WAF</p>
         * <br>
         * <p>    *   **0**: domain name</p>
         * <br>
         * <p>*   **18**: OSS</p>
         * <br>
         * <p>    *   **0**: bucket</p>
         * <br>
         * <p>*   **19**: PolarDB</p>
         * <br>
         * <p>    *   **0**: cluster</p>
         * <br>
         * <p>*   **20**: ApsaraDB RDS for PostgreSQL</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **21**: MSE</p>
         * <br>
         * <p>    *   **0**: cluster</p>
         * <br>
         * <p>*   **22**: NAS</p>
         * <br>
         * <p>    *   **0**: file system</p>
         * <br>
         * <p>*   **23**: DSC</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **24**: EIP</p>
         * <br>
         * <p>    *   **0**: Anycast EIP</p>
         * <br>
         * <p>*   **25**: IDaaS EIAM</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **26**: PolarDB-X</p>
         * <br>
         * <p>    *   **0**: instance</p>
         * <br>
         * <p>*   **27**: Elasticsearch</p>
         * <br>
         * <p>    *   **0**: instance</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the asset. Valid values:</p>
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
