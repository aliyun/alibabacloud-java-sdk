// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryRequest extends TeaModel {
    /**
     * <p>List of asset type information for cloud assets</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>List of cloud vendors to be queried.</p>
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

    public GetCloudAssetSummaryRequest setVendors(java.util.List<Integer> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<Integer> getVendors() {
        return this.vendors;
    }

    public static class GetCloudAssetSummaryRequestCloudAssetTypes extends TeaModel {
        /**
         * <p>Subtypes of cloud products. Asset type-subtype. Values:</p>
         * <ul>
         * <li><strong>0</strong>: ECS (Elastic Compute Service)<ul>
         * <li><strong>1</strong>: Disk (Storage)</li>
         * <li><strong>2</strong>: Security Group</li>
         * <li><strong>100</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>1</strong>: Load Balancer <ul>
         * <li><strong>0</strong>: Load Balancer </li>
         * <li><strong>1</strong>: Application Load Balancer</li>
         * </ul>
         * </li>
         * <li><strong>3</strong>: ApsaraDB RDS <ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB <ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>5</strong>: ApsaraDB Tair (Redis Compatible) <ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>6</strong>: Container Registry <ul>
         * <li><strong>1</strong>: Enterprise Edition </li>
         * <li><strong>2</strong>: Personal Edition</li>
         * </ul>
         * </li>
         * <li><strong>8</strong>: Container Service for Kubernetes <ul>
         * <li><strong>0</strong>: Cluster</li>
         * </ul>
         * </li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC) <ul>
         * <li><strong>0</strong>: NAT Gateway </li>
         * <li><strong>1</strong>: EIP (Elastic IP) </li>
         * <li><strong>2</strong>: VPN </li>
         * <li><strong>3</strong>: FLOW_LOG</li>
         * </ul>
         * </li>
         * <li><strong>11</strong>: ActionTrail <ul>
         * <li><strong>0</strong>: Trail</li>
         * </ul>
         * </li>
         * <li><strong>12</strong>: CDN <ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>13</strong>: Digital Certificate Management Service (formerly SSL Certificates) <ul>
         * <li><strong>0</strong>: Certificate</li>
         * </ul>
         * </li>
         * <li><strong>14</strong>: DevOps <ul>
         * <li><strong>0</strong>: Organization</li>
         * </ul>
         * </li>
         * <li><strong>16</strong>: DDoS Protection <ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>17</strong>: Web Application Firewall <ul>
         * <li><strong>0</strong>: Domain</li>
         * </ul>
         * </li>
         * <li><strong>18</strong>: Object Storage <ul>
         * <li><strong>0</strong>: Bucket</li>
         * </ul>
         * </li>
         * <li><strong>19</strong>: PolarDB (Cloud-Native Relational Database) <ul>
         * <li><strong>0</strong>: Cluster</li>
         * </ul>
         * </li>
         * <li><strong>20</strong>: ApsaraDB for PostgreSQL <ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>21</strong>: Microservices Engine <ul>
         * <li><strong>0</strong>: Cluster</li>
         * </ul>
         * </li>
         * <li><strong>22</strong>: File Storage NAS <ul>
         * <li><strong>0</strong>: File System</li>
         * </ul>
         * </li>
         * <li><strong>23</strong>: Data Security Center <ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>24</strong>: Elastic Public IP <ul>
         * <li><strong>0</strong>: Anycast Elastic Public IP</li>
         * </ul>
         * </li>
         * <li><strong>25</strong>: Cloud Identity Service - EIAM <ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>26</strong>: PolarDB-X <ul>
         * <li><strong>0</strong>: Instance</li>
         * </ul>
         * </li>
         * <li><strong>27</strong>: Elasticsearch <ul>
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
         * <p>The type of asset. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS) </li>
         * <li><strong>1</strong>: Load Balancer </li>
         * <li><strong>3</strong>: ApsaraDB for RDS </li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB </li>
         * <li><strong>5</strong>: ApsaraDB for Tair (Redis compatible) </li>
         * <li><strong>6</strong>: Container Registry </li>
         * <li><strong>8</strong>: Container Service for Kubernetes </li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC) </li>
         * <li><strong>11</strong>: ActionTrail </li>
         * <li><strong>12</strong>: Content Delivery Network (CDN) </li>
         * <li><strong>13</strong>: SSL Certificates (now known as Certificate Management Service) </li>
         * <li><strong>14</strong>: DevOps </li>
         * <li><strong>16</strong>: DDoS Protection </li>
         * <li><strong>17</strong>: Web Application Firewall </li>
         * <li><strong>18</strong>: Object Storage Service (OSS) </li>
         * <li><strong>19</strong>: PolarDB </li>
         * <li><strong>20</strong>: ApsaraDB for PostgreSQL </li>
         * <li><strong>21</strong>: Microservices Engine </li>
         * <li><strong>22</strong>: File Storage NAS </li>
         * <li><strong>23</strong>: Data Security Center </li>
         * <li><strong>24</strong>: Elastic IP Address </li>
         * <li><strong>25</strong>: Cloud Identity Service - EIAM </li>
         * <li><strong>26</strong>: PolarDB-X </li>
         * <li><strong>27</strong>: Elasticsearch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>Server vendor. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud Asset </li>
         * <li><strong>1</strong>: Non-cloud Asset </li>
         * <li><strong>2</strong>: IDC Asset </li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: Other Cloud Assets </li>
         * <li><strong>8</strong>: Lightweight Asset</li>
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
