// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshAssetsRequest extends TeaModel {
    // The type of the asset that you want to synchronize.default **ecs**, Valid values:
    // 
    // *   **cloud_product**: Alibaba Cloud service
    // *   **ecs**: Elastic Compute Service (ECS) instance
    // *   **container_image**: container image
    @NameInMap("AssetType")
    public String assetType;

    // The subtype of the cloud service.
    // 
    // >  The following list describes the subtypes of cloud services.
    @NameInMap("CloudAssetSubType")
    public Integer cloudAssetSubType;

    // The type of the cloud service. Valid values:
    // 
    // *   **0**: ECS
    // *   **1**: Server Load Balancer (SLB)
    // *   **3**: ApsaraDB RDS
    // *   **4**: ApsaraDB for MongoDB (MongoDB)
    // *   **5**: ApsaraDB for Redis (Redis)
    // *   **6**: Container Registry
    // *   **8**: Container Service for Kubernetes (ACK)
    // *   **9**: Virtual Private Cloud (VPC)
    // *   **11**: ActionTrail
    // *   **12**: Alibaba Cloud CDN (CDN)
    // *   **13**: Certificate Management Service (formerly SSL Certificates Service)
    // *   **14**: Apsara Devops
    // *   **15**: Resource Access Management (RAM)
    // *   **16**: Anti-DDoS
    // *   **17**: Web Application Firewall (WAF)
    // *   **18**: Object Storage Service (OSS)
    // *   **19**: PolarDB
    // *   **20**: ApsaraDB RDS for PostgreSQL
    // *   **21**: Microservices Engine (MSE)
    // *   **22**: Apsara File Storage NAS (NAS)
    // *   **23**: Data Security Center (DSC)
    // *   **24**: Elastic IP Address (EIP)
    @NameInMap("CloudAssetType")
    public Integer cloudAssetType;

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

}
