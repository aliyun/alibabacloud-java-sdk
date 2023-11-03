// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryResponseBody extends TeaModel {
    /**
     * <p>The summary of cloud services.</p>
     */
    @NameInMap("GroupedFields")
    public GetCloudAssetSummaryResponseBodyGroupedFields groupedFields;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudAssetSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetSummaryResponseBody self = new GetCloudAssetSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetSummaryResponseBody setGroupedFields(GetCloudAssetSummaryResponseBodyGroupedFields groupedFields) {
        this.groupedFields = groupedFields;
        return this;
    }
    public GetCloudAssetSummaryResponseBodyGroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    public GetCloudAssetSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas extends TeaModel {
        /**
         * <p>The subtype of the cloud service.</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the cloud service. Valid values:</p>
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
         * <p>*   **15**: Resource Access Management (RAM)</p>
         * <p>*   **16**: Anti-DDoS</p>
         * <p>*   **17**: Web Application Firewall (WAF)</p>
         * <p>*   **18**: Object Storage Service (OSS)</p>
         * <p>*   **19**: PolarDB</p>
         * <p>*   **20**: ApsaraDB RDS for PostgreSQL</p>
         * <p>*   **21**: Microservices Engine (MSE)</p>
         * <p>*   **22**: Apsara File Storage NAS (NAS)</p>
         * <p>*   **23**: Data Security Center (DSC)</p>
         * <p>*   **24**: Elastic IP Address (EIP)</p>
         * <p>*   **25**: Identity as a Service (IDaaS) - Enterprise Identity Access Management (EIAM)</p>
         * <p>*   **26**: PolarDB for Xscale (PolarDB-X)</p>
         * <p>*   **27**: Elasticsearch</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The total number of cloud service instances of this type.</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The total number of cloud service instances that are at risk of this type.</p>
         */
        @NameInMap("InstanceRiskCount")
        public Integer instanceRiskCount;

        @NameInMap("Vendor")
        public Integer vendor;

        public static GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas self = new GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setInstanceRiskCount(Integer instanceRiskCount) {
            this.instanceRiskCount = instanceRiskCount;
            return this;
        }
        public Integer getInstanceRiskCount() {
            return this.instanceRiskCount;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class GetCloudAssetSummaryResponseBodyGroupedFields extends TeaModel {
        /**
         * <p>The statistics of cloud services.</p>
         */
        @NameInMap("CloudAssetSummaryMetas")
        public java.util.List<GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas> cloudAssetSummaryMetas;

        @NameInMap("InstanceCountTotal")
        public Integer instanceCountTotal;

        @NameInMap("InstanceRiskCountTotal")
        public Integer instanceRiskCountTotal;

        public static GetCloudAssetSummaryResponseBodyGroupedFields build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetSummaryResponseBodyGroupedFields self = new GetCloudAssetSummaryResponseBodyGroupedFields();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetSummaryResponseBodyGroupedFields setCloudAssetSummaryMetas(java.util.List<GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas> cloudAssetSummaryMetas) {
            this.cloudAssetSummaryMetas = cloudAssetSummaryMetas;
            return this;
        }
        public java.util.List<GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas> getCloudAssetSummaryMetas() {
            return this.cloudAssetSummaryMetas;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFields setInstanceCountTotal(Integer instanceCountTotal) {
            this.instanceCountTotal = instanceCountTotal;
            return this;
        }
        public Integer getInstanceCountTotal() {
            return this.instanceCountTotal;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFields setInstanceRiskCountTotal(Integer instanceRiskCountTotal) {
            this.instanceRiskCountTotal = instanceRiskCountTotal;
            return this;
        }
        public Integer getInstanceRiskCountTotal() {
            return this.instanceRiskCountTotal;
        }

    }

}
