// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshAssetsRequest extends TeaModel {
    /**
     * <p>The type of asset to synchronize. Default value: <strong>ecs</strong>. Valid values:</p>
     * <ul>
     * <li><strong>cloud_product</strong>: cloud product</li>
     * <li><strong>ecs</strong>: server</li>
     * <li><strong>container_image</strong>: container image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_product</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The subtype of the cloud product.</p>
     * <blockquote>
     * <p>Refer to the following list for valid values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CloudAssetSubType")
    public Integer cloudAssetSubType;

    /**
     * <p>The type of cloud product. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: server</li>
     * <li><strong>1</strong>: load balancing</li>
     * <li><strong>3</strong>: ApsaraDB RDS database</li>
     * <li><strong>4</strong>: ApsaraDB for MongoDB database</li>
     * <li><strong>5</strong>: Tair (Redis® OSS-Compatible) database</li>
     * <li><strong>6</strong>: Container Registry</li>
     * <li><strong>8</strong>: container service for Kubernetes</li>
     * <li><strong>9</strong>: VPC</li>
     * <li><strong>11</strong>: ActionTrail</li>
     * <li><strong>12</strong>: CDN</li>
     * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
     * <li><strong>14</strong>: Apsara Devops</li>
     * <li><strong>15</strong>: access control</li>
     * <li><strong>16</strong>: Anti-DDoS</li>
     * <li><strong>17</strong>: Web Application Firewall</li>
     * <li><strong>18</strong>: OSS</li>
     * <li><strong>19</strong>: cloud-native relational database PolarDB</li>
     * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL database</li>
     * <li><strong>21</strong>: Microservices Engine</li>
     * <li><strong>22</strong>: File Storage NAS</li>
     * <li><strong>23</strong>: Data Security Center</li>
     * <li><strong>24</strong>: EIP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CloudAssetType")
    public Integer cloudAssetType;

    /**
     * <p>The ID of the Alibaba Cloud account of the member accounts in the resource directory.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The server vendor. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Alibaba Cloud asset</li>
     * <li><strong>1</strong>: asset outside the cloud</li>
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

    public RefreshAssetsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public RefreshAssetsRequest setVendor(Integer vendor) {
        this.vendor = vendor;
        return this;
    }
    public Integer getVendor() {
        return this.vendor;
    }

}
