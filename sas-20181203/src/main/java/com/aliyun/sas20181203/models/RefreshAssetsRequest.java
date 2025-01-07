// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshAssetsRequest extends TeaModel {
    /**
     * <p>The type of the asset that you want to synchronize. Valid values:</p>
     * <ul>
     * <li><strong>cloud_product</strong>: Alibaba Cloud service</li>
     * <li><strong>ecs</strong>: Elastic Compute Service (ECS) instance</li>
     * <li><strong>container_image</strong>: container image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_product</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The subtype of the cloud service.</p>
     * <blockquote>
     * <p> The following list describes the subtypes of cloud services.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CloudAssetSubType")
    public Integer cloudAssetSubType;

    /**
     * <p>The type of the cloud service. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: ECS</li>
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
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CloudAssetType")
    public Integer cloudAssetType;

    /**
     * <p>The type of the server. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
     * <li><strong>1</strong>: a third-party cloud asset</li>
     * <li><strong>2</strong>: an asset in a data center</li>
     * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: an asset provided by another cloud</li>
     * <li><strong>8</strong>: a lightweight asset</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Vendor")
    public Integer vendor;

    public static RefreshAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAssetsRequest self = new RefreshAssetsRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAssetsRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public RefreshAssetsRequest setCloudAssetSubType(Integer cloudAssetSubType) {
        this.cloudAssetSubType = cloudAssetSubType;
        return this;
    }
    public Integer getCloudAssetSubType() {
        return this.cloudAssetSubType;
    }

    public RefreshAssetsRequest setCloudAssetType(Integer cloudAssetType) {
        this.cloudAssetType = cloudAssetType;
        return this;
    }
    public Integer getCloudAssetType() {
        return this.cloudAssetType;
    }

    public RefreshAssetsRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

}
