// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCloudAssetSchemasRequest extends TeaModel {
    /**
     * <p>Whether to filter out attributes that can be associated with other assets.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AssociatedDataOnly")
    public Boolean associatedDataOnly;

    /**
     * <p>The types of cloud assets.</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<ListCloudAssetSchemasRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>List of asset data names</p>
     */
    @NameInMap("DataNames")
    public java.util.List<String> dataNames;

    /**
     * <p>The language type for requesting and receiving messages, with a default value of <strong>zh</strong>. The values can be: - <strong>zh</strong>: Chinese - <strong>en</strong>: English</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListCloudAssetSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAssetSchemasRequest self = new ListCloudAssetSchemasRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudAssetSchemasRequest setAssociatedDataOnly(Boolean associatedDataOnly) {
        this.associatedDataOnly = associatedDataOnly;
        return this;
    }
    public Boolean getAssociatedDataOnly() {
        return this.associatedDataOnly;
    }

    public ListCloudAssetSchemasRequest setCloudAssetTypes(java.util.List<ListCloudAssetSchemasRequestCloudAssetTypes> cloudAssetTypes) {
        this.cloudAssetTypes = cloudAssetTypes;
        return this;
    }
    public java.util.List<ListCloudAssetSchemasRequestCloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    public ListCloudAssetSchemasRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCloudAssetSchemasRequest setDataNames(java.util.List<String> dataNames) {
        this.dataNames = dataNames;
        return this;
    }
    public java.util.List<String> getDataNames() {
        return this.dataNames;
    }

    public ListCloudAssetSchemasRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCloudAssetSchemasRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class ListCloudAssetSchemasRequestCloudAssetTypes extends TeaModel {
        /**
         * <p>The subtype of the cloud service or asset. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: ECS</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * <li><strong>1</strong>: disk (storage)</li>
         * <li><strong>2</strong>: security group</li>
         * </ul>
         * </li>
         * <li><p><strong>1</strong>: SLB</p>
         * <ul>
         * <li><strong>0</strong>: SLB</li>
         * <li><strong>1</strong>: Application Load Balancer (ALB)</li>
         * </ul>
         * </li>
         * <li><p><strong>3</strong>: ApsaraDB RDS</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>4</strong>: MongoDB</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>5</strong>: Redis</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>6</strong>: Container Registry</p>
         * <ul>
         * <li><strong>1</strong>: Enterprise Edition</li>
         * <li><strong>2</strong>: Personal Edition</li>
         * </ul>
         * </li>
         * <li><p><strong>8</strong>: ACK</p>
         * <ul>
         * <li><strong>0</strong>: cluster</li>
         * </ul>
         * </li>
         * <li><p><strong>9</strong>: VPC</p>
         * <ul>
         * <li><strong>0</strong>: NAT gateway</li>
         * <li><strong>1</strong>: Elastic IP address (EIP)</li>
         * <li><strong>2</strong>: VPN</li>
         * <li><strong>3</strong>: VPC Flow Logs</li>
         * </ul>
         * </li>
         * <li><p><strong>11</strong>: ActionTrail</p>
         * <ul>
         * <li><strong>0</strong>: trail</li>
         * </ul>
         * </li>
         * <li><p><strong>12</strong>: CDN</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</p>
         * <ul>
         * <li><strong>0</strong>: certificate</li>
         * </ul>
         * </li>
         * <li><p><strong>14</strong>: Apsara Devops</p>
         * <ul>
         * <li><strong>0</strong>: organization</li>
         * </ul>
         * </li>
         * <li><p><strong>16</strong>: Anti-DDoS</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>17</strong>: WAF</p>
         * <ul>
         * <li><strong>0</strong>: domain name</li>
         * </ul>
         * </li>
         * <li><p><strong>18</strong>: OSS</p>
         * <ul>
         * <li><strong>0</strong>: bucket</li>
         * </ul>
         * </li>
         * <li><p><strong>19</strong>: PolarDB</p>
         * <ul>
         * <li><strong>0</strong>: cluster</li>
         * </ul>
         * </li>
         * <li><p><strong>20</strong>: ApsaraDB RDS for PostgreSQL</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>21</strong>: MSE</p>
         * <ul>
         * <li><strong>0</strong>: cluster</li>
         * </ul>
         * </li>
         * <li><p><strong>22</strong>: NAS</p>
         * <ul>
         * <li><strong>0</strong>: file system</li>
         * </ul>
         * </li>
         * <li><p><strong>23</strong>: DSC</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>24</strong>: EIP</p>
         * <ul>
         * <li><strong>0</strong>: Anycast EIP</li>
         * </ul>
         * </li>
         * <li><p><strong>25</strong>: IDaaS EIAM</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>26</strong>: PolarDB-X</p>
         * <ul>
         * <li><strong>0</strong>: instance</li>
         * </ul>
         * </li>
         * <li><p><strong>27</strong>: Elasticsearch</p>
         * <ul>
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
         * <li><strong>16</strong>: Anti-DDoS</li>
         * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
         * <li><strong>18</strong>: Object Storage Service (OSS)</li>
         * <li><strong>19</strong>: PolarDB</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
         * <li><strong>21</strong>: Microservices Engine (MSE)</li>
         * <li><strong>22</strong>: File Storage NAS (NAS)</li>
         * <li><strong>23</strong>: Data Security Center (DSC)</li>
         * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
         * <li><strong>25</strong>: IDaaS EIAM</li>
         * <li><strong>26</strong>: PolarDB-X</li>
         * <li><strong>27</strong>: Elasticsearch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>The server type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: a cloud asset provided by Alibaba Cloud</li>
         * <li><strong>1</strong>: a cloud asset outside Alibaba Cloud</li>
         * <li><strong>2</strong>: a cloud asset in a data center</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: a cloud asset provided by a third-party service provider</li>
         * <li><strong>8</strong>: a lightweight cloud asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static ListCloudAssetSchemasRequestCloudAssetTypes build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAssetSchemasRequestCloudAssetTypes self = new ListCloudAssetSchemasRequestCloudAssetTypes();
            return TeaModel.build(map, self);
        }

        public ListCloudAssetSchemasRequestCloudAssetTypes setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public ListCloudAssetSchemasRequestCloudAssetTypes setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListCloudAssetSchemasRequestCloudAssetTypes setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
