// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryResponseBody extends TeaModel {
    /**
     * <p>The cloud asset summary information.</p>
     */
    @NameInMap("GroupedFields")
    public GetCloudAssetSummaryResponseBodyGroupedFields groupedFields;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the request ID to troubleshoot issues.</p>
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
         * <li><strong>0</strong>: Elastic Compute Service (ECS) server</li>
         * <li><strong>1</strong>: load balancing</li>
         * <li><strong>3</strong>: ApsaraDB RDS database</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB database</li>
         * <li><strong>5</strong>: Tair (Redis® OSS-Compatible) database</li>
         * <li><strong>6</strong>: Container Registry</li>
         * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
         * <li><strong>11</strong>: ActionTrail</li>
         * <li><strong>12</strong>: CDN</li>
         * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
         * <li><strong>14</strong>: Apsara Devops</li>
         * <li><strong>15</strong>: Resource Access Management (RAM)</li>
         * <li><strong>16</strong>: Anti-DDoS</li>
         * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
         * <li><strong>18</strong>: Object Storage Service (OSS)</li>
         * <li><strong>19</strong>: cloud-native relational database PolarDB</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL database</li>
         * <li><strong>21</strong>: Microservices Engine (MSE)</li>
         * <li><strong>22</strong>: Apsara File Storage NAS</li>
         * <li><strong>23</strong>: Data Security Center (DSC)</li>
         * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
         * <li><strong>25</strong>: Alibaba Cloud IDaaS EIAM</li>
         * <li><strong>26</strong>: PolarDB-X</li>
         * <li><strong>27</strong>: Elasticsearch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The total number of instances of this cloud service type.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>The total number of at-risk instances of this cloud service type.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InstanceRiskCount")
        public Integer instanceRiskCount;

        /**
         * <p>The number of assets billed by instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceSaleCount")
        public Integer instanceSaleCount;

        /**
         * <p>Indicates whether the asset is billed by instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Billed by instance.</li>
         * <li><strong>false</strong>: Not billed by instance.</li>
         * </ul>
         */
        @NameInMap("IsInstanceSale")
        public Boolean isInstanceSale;

        /**
         * <p>The server vendor. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset</li>
         * <li><strong>1</strong>: non-cloud asset</li>
         * <li><strong>2</strong>: IDC asset</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: third-party cloud asset</li>
         * <li><strong>8</strong>: lightweight asset</li>
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

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setInstanceSaleCount(Integer instanceSaleCount) {
            this.instanceSaleCount = instanceSaleCount;
            return this;
        }
        public Integer getInstanceSaleCount() {
            return this.instanceSaleCount;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setIsInstanceSale(Boolean isInstanceSale) {
            this.isInstanceSale = isInstanceSale;
            return this;
        }
        public Boolean getIsInstanceSale() {
            return this.isInstanceSale;
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
         * <p>The list of cloud service statistics information.</p>
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
         * <p>The total number of at-risk cloud service instances.</p>
         * 
         * <strong>example:</strong>
         * <p>544</p>
         */
        @NameInMap("InstanceRiskCountTotal")
        public Integer instanceRiskCountTotal;

        /**
         * <p>The total number of cloud services billed by instance.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InstanceSaleCountTotal")
        public Integer instanceSaleCountTotal;

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

        public GetCloudAssetSummaryResponseBodyGroupedFields setInstanceSaleCountTotal(Integer instanceSaleCountTotal) {
            this.instanceSaleCountTotal = instanceSaleCountTotal;
            return this;
        }
        public Integer getInstanceSaleCountTotal() {
            return this.instanceSaleCountTotal;
        }

    }

}
