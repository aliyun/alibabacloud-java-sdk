// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetDetailRequest extends TeaModel {
    /**
     * <p>The subtype of the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AssetSubType")
    public Integer assetSubType;

    /**
     * <p>The type of the cloud asset. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Elastic Compute Service (ECS).</li>
     * <li><strong>1</strong>: Server Load Balancer (SLB).</li>
     * <li><strong>3</strong>: ApsaraDB RDS.</li>
     * <li><strong>4</strong>: ApsaraDB for MongoDB.</li>
     * <li><strong>5</strong>: ApsaraDB for Redis.</li>
     * <li><strong>6</strong>: Container Registry.</li>
     * <li><strong>8</strong>: Container Service for Kubernetes.</li>
     * <li><strong>9</strong>: Virtual Private Cloud (VPC).</li>
     * <li><strong>11</strong>: ActionTrail.</li>
     * <li><strong>12</strong>: Alibaba Cloud CDN (CDN).</li>
     * <li><strong>13</strong>: Certificate Management Service.</li>
     * <li><strong>14</strong>: Apsara Devops.</li>
     * <li><strong>15</strong>: Resource Access Management (RAM).</li>
     * <li><strong>16</strong>: Anti-DDoS.</li>
     * <li><strong>17</strong>: Web Application Firewall (WAF).</li>
     * <li><strong>18</strong>: Object Storage Service (OSS).</li>
     * <li><strong>19</strong>: PolarDB.</li>
     * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL.</li>
     * <li><strong>21</strong>: Microservices Engine (MSE).</li>
     * <li><strong>22</strong>: File Storage NAS (NAS).</li>
     * <li><strong>23</strong>: Data Security Center (DSC).</li>
     * <li><strong>24</strong>: Elastic IP Address (EIP).</li>
     * <li><strong>25</strong>: Identity as a Service (IDaaS)-Employee Identity and Access Management (EIAM).</li>
     * <li><strong>26</strong>: PolarDB-X.</li>
     * <li><strong>27</strong>: Elasticsearch.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>14</p>
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
     * <ul>
     * <li><strong>0</strong>: Alibaba Cloud.</li>
     * <li><strong>1</strong>: service provider that is unrecognized.</li>
     * <li><strong>2</strong>: data center.</li>
     * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: third-party service provider.</li>
     * <li><strong>8</strong>: simple application server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
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
         * 
         * <strong>example:</strong>
         * <p>sg-wz9hf86vbzbrrde7****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region in which the cloud asset resides.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
