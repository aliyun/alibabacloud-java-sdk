// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryResponseBody extends TeaModel {
    /**
     * <p>The summary of cloud services.</p>
     */
    @NameInMap("GroupedFields")
    public GetCloudAssetSummaryResponseBodyGroupedFields groupedFields;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
     */
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the cloud service. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS)</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB)</li>
         * <li><strong>3</strong>: ApsaraDB RDS</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB (MongoDB)</li>
         * <li><strong>5</strong>: ApsaraDB for Redis (Redis)</li>
         * <li><strong>6</strong>: Container Registry</li>
         * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
         * <li><strong>11</strong>: ActionTrail</li>
         * <li><strong>12</strong>: Alibaba Cloud CDN (CDN)</li>
         * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
         * <li><strong>14</strong>: Apsara Devops</li>
         * <li><strong>15</strong>: Resource Access Management (RAM)</li>
         * <li><strong>16</strong>: Anti-DDoS</li>
         * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
         * <li><strong>18</strong>: Object Storage Service (OSS)</li>
         * <li><strong>19</strong>: PolarDB</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
         * <li><strong>21</strong>: Microservices Engine (MSE)</li>
         * <li><strong>22</strong>: File Storage NAS (NAS)</li>
         * <li><strong>23</strong>: Data Security Center (DSC)</li>
         * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
         * <li><strong>25</strong>: Identity as a Service (IDaaS) - Enterprise Identity Access Management (EIAM)</li>
         * <li><strong>26</strong>: PolarDB for Xscale (PolarDB-X)</li>
         * <li><strong>27</strong>: Elasticsearch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The total number of cloud service instances of this type.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The total number of cloud service instances that are at risk of this type.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InstanceRiskCount")
        public Integer instanceRiskCount;

        /**
         * <p>The server type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
         * <li><strong>1</strong>: an asset outside Alibaba Cloud</li>
         * <li><strong>2</strong>: an asset in a data center</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: an asset provided by a third-party service provider</li>
         * <li><strong>8</strong>: a lightweight asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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

        /**
         * <p>The total number of cloud service instances.</p>
         * 
         * <strong>example:</strong>
         * <p>919</p>
         */
        @NameInMap("InstanceCountTotal")
        public Integer instanceCountTotal;

        /**
         * <p>The total number of cloud service instances that are at risk.</p>
         * 
         * <strong>example:</strong>
         * <p>544</p>
         */
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
