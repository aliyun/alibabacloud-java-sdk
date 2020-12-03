// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class ExtractFaceFeatureCRORequest extends TeaModel {
    // 租户Id
    @NameInMap("TenantCode")
    public String tenantCode;

    // 场景Id
    @NameInMap("SceneId")
    public String sceneId;

    // image
    @NameInMap("Image")
    public String image;

    // version
    @NameInMap("Version")
    public String version;

    public static ExtractFaceFeatureCRORequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractFaceFeatureCRORequest self = new ExtractFaceFeatureCRORequest();
        return TeaModel.build(map, self);
    }

    public ExtractFaceFeatureCRORequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ExtractFaceFeatureCRORequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ExtractFaceFeatureCRORequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ExtractFaceFeatureCRORequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
