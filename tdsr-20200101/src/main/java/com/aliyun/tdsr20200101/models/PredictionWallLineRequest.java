// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PredictionWallLineRequest extends TeaModel {
    // 相机高度 单位 cm
    @NameInMap("CameraHeight")
    public Long cameraHeight;

    // 图片地址
    @NameInMap("Url")
    public String url;

    public static PredictionWallLineRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictionWallLineRequest self = new PredictionWallLineRequest();
        return TeaModel.build(map, self);
    }

    public PredictionWallLineRequest setCameraHeight(Long cameraHeight) {
        this.cameraHeight = cameraHeight;
        return this;
    }
    public Long getCameraHeight() {
        return this.cameraHeight;
    }

    public PredictionWallLineRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
