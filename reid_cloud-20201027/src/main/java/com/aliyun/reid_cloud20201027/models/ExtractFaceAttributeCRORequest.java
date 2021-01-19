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

    // 是否监控场景
    @NameInMap("Monitor")
    public Boolean monitor;

    // 版本
    @NameInMap("Version")
    public String version;

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

    public ExtractFaceAttributeCRORequest setMonitor(Boolean monitor) {
        this.monitor = monitor;
        return this;
    }
    public Boolean getMonitor() {
        return this.monitor;
    }

    public ExtractFaceAttributeCRORequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
