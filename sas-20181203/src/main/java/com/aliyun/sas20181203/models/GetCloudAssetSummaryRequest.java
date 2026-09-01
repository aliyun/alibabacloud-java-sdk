// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryRequest extends TeaModel {
    /**
     * <p>The list of asset type information for cloud assets.</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>Specifies whether to return sale-related data. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Returns sale-related data.</li>
     * <li><strong>false</strong>: Does not return sale-related data.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSaleData")
    public Boolean isSaleData;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The list of cloud vendors to query.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<Integer> vendors;

    public static GetCloudAssetSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetSummaryRequest self = new GetCloudAssetSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetSummaryRequest setCloudAssetTypes(java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> cloudAssetTypes) {
        this.cloudAssetTypes = cloudAssetTypes;
        return this;
    }
    public java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    public GetCloudAssetSummaryRequest setIsSaleData(Boolean isSaleData) {
        this.isSaleData = isSaleData;
        return this;
    }
    public Boolean getIsSaleData() {
        return this.isSaleData;
    }

    public GetCloudAssetSummaryRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public GetCloudAssetSummaryRequest setVendors(java.util.List<Integer> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<Integer> getVendors() {
        return this.vendors;
    }

    public static class GetCloudAssetSummaryRequestCloudAssetTypes extends TeaModel {
        /**
         * <p>The subtype of the cloud service. The value is in the format of asset type - subtype. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS) server<ul>
         * <li><strong>1</strong>: cloud disk (storage)</li>
         * <li><strong>2</strong>: security group</li>
         * <li><strong>100</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>1</strong>: load balancing<ul>
         * <li><strong>0</strong>: load balancing</li>
         * <li><strong>1</strong>: Application Load Balancer (ALB)</li>
         * </ul>
         * </li>
         * <li><strong>3</strong>: ApsaraDB RDS database<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB database<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>5</strong>: Tair (Redis® OSS-Compatible) database<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>6</strong>: Container Registry<ul>
         * <li><strong>1</strong>: Enterprise Edition</li>
         * <li><strong>2</strong>: Personal Edition</li>
         * </ul>
         * </li>
         * <li><strong>8</strong>: Container Service for Kubernetes (ACK)<ul>
         * <li><strong>0</strong>: cluster</li>
         * </ul>
         * </li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC)<ul>
         * <li><strong>0</strong>: NAT gateway</li>
         * <li><strong>1</strong>: EIP</li>
         * <li><strong>2</strong>: VPN</li>
         * <li><strong>3</strong>: FLOW_LOG</li>
         * </ul>
         * </li>
         * <li><strong>11</strong>: ActionTrail<ul>
         * <li><strong>0</strong>: trail</li>
         * </ul>
         * </li>
         * <li><strong>12</strong>: CDN<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)<ul>
         * <li><strong>0</strong>: certificate</li>
         * </ul>
         * </li>
         * <li><strong>14</strong>: Apsara Devops<ul>
         * <li><strong>0</strong>: organization</li>
         * </ul>
         * </li>
         * <li><strong>16</strong>: Anti-DDoS<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>17</strong>: Web Application Firewall (WAF)<ul>
         * <li><strong>0</strong>: domain name</li>
         * </ul>
         * </li>
         * <li><strong>18</strong>: Object Storage Service (OSS)<ul>
         * <li><strong>0</strong>: Bucket</li>
         * </ul>
         * </li>
         * <li><strong>19</strong>: cloud-native relational database PolarDB<ul>
         * <li><strong>0</strong>: cluster</li>
         * </ul>
         * </li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL database<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>21</strong>: Microservices Engine (MSE)<ul>
         * <li><strong>0</strong>: cluster</li>
         * </ul>
         * </li>
         * <li><strong>22</strong>: Apsara File Storage NAS<ul>
         * <li><strong>0</strong>: file system</li>
         * </ul>
         * </li>
         * <li><strong>23</strong>: Data Security Center (DSC)<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>24</strong>: Elastic IP Address (EIP)<ul>
         * <li><strong>0</strong>: Anycast EIP</li>
         * </ul>
         * </li>
         * <li><strong>25</strong>: Alibaba Cloud IDaaS EIAM<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>26</strong>: PolarDB-X<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><strong>27</strong>: Elasticsearch<ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of the asset. Valid values:</p>
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
         * <p>4</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

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
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static GetCloudAssetSummaryRequestCloudAssetTypes build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetSummaryRequestCloudAssetTypes self = new GetCloudAssetSummaryRequestCloudAssetTypes();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetSummaryRequestCloudAssetTypes setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetSummaryRequestCloudAssetTypes setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public GetCloudAssetSummaryRequestCloudAssetTypes setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
