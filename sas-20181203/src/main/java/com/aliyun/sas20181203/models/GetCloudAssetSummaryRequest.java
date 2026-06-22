// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryRequest extends TeaModel {
    /**
     * <p>The list of asset type information of cloud assets.</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> cloudAssetTypes;

    @NameInMap("IsSaleData")
    public Boolean isSaleData;

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

    public GetCloudAssetSummaryRequest setVendors(java.util.List<Integer> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<Integer> getVendors() {
        return this.vendors;
    }

    public static class GetCloudAssetSummaryRequestCloudAssetTypes extends TeaModel {
        /**
         * <p>The subtype of the cloud service.
         * The asset type-subtype. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS) <ul>
         * <li><strong>1</strong>: Disk (Storage)</li>
         * <li><strong>2</strong>: Security Group</li>
         * <li><strong>100</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>1</strong>: Server Load Balancer<ul>
         * <li><strong>0</strong>: Server Load Balancer (SLB)</li>
         * <li><strong>1</strong>: Application Load Balancer (ALB)</li>
         * </ul>
         * </li>
         * <li><strong>3</strong>: ApsaraDB RDS<ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB<ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>5</strong>: ApsaraDB for Tair (compatible with Redis)<ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>6</strong>: Container Registry<ul>
         * <li><strong>1</strong>: Enterprise Edition</li>
         * <li><strong>2</strong>: Personal Edition</li>
         * </ul>
         * </li>
         * <li><strong>8</strong>: Container Service for Kubernetes (ACK)<ul>
         * <li><strong>0</strong>: Cluster</li>
         * </ul>
         * </li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC)<ul>
         * <li><strong>0</strong>: NAT Gateway</li>
         * <li><strong>1</strong>: EIP</li>
         * <li><strong>2</strong>: VPN</li>
         * <li><strong>3</strong>: FLOW_LOG</li>
         * </ul>
         * </li>
         * <li><strong>11</strong>: ActionTrail<ul>
         * <li><strong>0</strong>: Trail</li>
         * </ul>
         * </li>
         * <li><strong>12</strong>: Alibaba Cloud CDN<ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)<ul>
         * <li><strong>0</strong>: Certificate</li>
         * </ul>
         * </li>
         * <li><strong>14</strong>: Apsara Devops<ul>
         * <li><strong>0</strong>: Organization</li>
         * </ul>
         * </li>
         * <li><strong>16</strong>: Anti-DDoS<ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>17</strong>: Web Application Firewall (WAF)<ul>
         * <li><strong>0</strong>: Domain name</li>
         * </ul>
         * </li>
         * <li><strong>18</strong>: Object Storage Service (OSS)<ul>
         * <li><strong>0</strong>: Bucket</li>
         * </ul>
         * </li>
         * <li><strong>19</strong>: PolarDB<ul>
         * <li><strong>0</strong>: Cluster</li>
         * </ul>
         * </li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL<ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>21</strong>: Microservices Engine (MSE)<ul>
         * <li><strong>0</strong>: Cluster</li>
         * </ul>
         * </li>
         * <li><strong>22</strong>: Apsara File Storage NAS<ul>
         * <li><strong>0</strong>: File system</li>
         * </ul>
         * </li>
         * <li><strong>23</strong>: Data Security Center (DSC)<ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>24</strong>: Elastic IP Address (EIP)<ul>
         * <li><strong>0</strong>: Anycast EIP</li>
         * </ul>
         * </li>
         * <li><strong>25</strong>: Identity as a Service - EIAM<ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>26</strong>: PolarDB-X<ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>27</strong>: Elasticsearch<ul>
         * <li><strong>0</strong>: Instance</li>
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
         * <p>The type of asset. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS)</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB)</li>
         * <li><strong>3</strong>: ApsaraDB RDS</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB</li>
         * <li><strong>5</strong>: ApsaraDB for Tair (compatible with Redis)</li>
         * <li><strong>6</strong>: Container Registry</li>
         * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
         * <li><strong>11</strong>: ActionTrail</li>
         * <li><strong>12</strong>: Alibaba Cloud CDN</li>
         * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
         * <li><strong>14</strong>: Apsara Devops</li>
         * <li><strong>16</strong>: Anti-DDoS</li>
         * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
         * <li><strong>18</strong>: Object Storage Service (OSS)</li>
         * <li><strong>19</strong>: PolarDB</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
         * <li><strong>21</strong>: Microservices Engine (MSE)</li>
         * <li><strong>22</strong>: Apsara File Storage NAS</li>
         * <li><strong>23</strong>: Data Security Center (DSC)</li>
         * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
         * <li><strong>25</strong>: Identity as a Service - EIAM</li>
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
         * <p>Server vendor. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud assets</li>
         * <li><strong>1</strong>: Off-cloud assets</li>
         * <li><strong>2</strong>: IDC assets</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: Other cloud assets</li>
         * <li><strong>8</strong>: Lightweight assets</li>
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
