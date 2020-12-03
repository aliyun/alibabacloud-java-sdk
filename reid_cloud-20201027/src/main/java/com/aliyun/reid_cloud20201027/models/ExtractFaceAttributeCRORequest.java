// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class ExtractFaceAttributeCRORequest extends TeaModel {
    // 租户Id
    @NameInMap("TenantId")
    public String tenantId;

    // 场景Id
    @NameInMap("SceneId")
    public String sceneId;

    // 图片地址
    @NameInMap("Image")
    public String image;

    // 请求属性列表
    @NameInMap("Types")
    public java.util.List<String> types;

    public static ExtractFaceAttributeCRORequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractFaceAttributeCRORequest self = new ExtractFaceAttributeCRORequest();
        return TeaModel.build(map, self);
    }

    public ExtractFaceAttributeCRORequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExtractFaceAttributeCRORequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ExtractFaceAttributeCRORequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ExtractFaceAttributeCRORequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
