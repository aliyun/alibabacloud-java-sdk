// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshAssetsRequest extends TeaModel {
    /**
     * <p>The type of the asset that you want to synchronize. Valid values:</p>
     * <br>
     * <p>*   **cloud_product**: Alibaba Cloud service</p>
     * <p>*   **ecs**: Elastic Compute Service (ECS) instance</p>
     * <p>*   **container_image**: container image</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The subtype of the cloud service.</p>
     * <br>
     * <p>>  The following list describes the subtypes of cloud services.</p>
     */
    @NameInMap("CloudAssetSubType")
    public Integer cloudAssetSubType;

    /**
     * <p>The type of the cloud service. Valid values:</p>
     * <br>
     * <p>*   **0**: ECS</p>
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
     */
    @NameInMap("CloudAssetType")
    public Integer cloudAssetType;

    /**
     * <p>The type of the server. Valid values:</p>
     * <br>
     * <p>*   **0**: an asset provided by Alibaba Cloud</p>
     * <p>*   **1**: a third-party cloud asset</p>
     * <p>*   **2**: an asset in a data center</p>
     * <p>*   **3**, **4**, **5**, and **7**: an asset provided by another cloud</p>
     * <p>*   **8**: a lightweight asset</p>
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
