// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RectifyImageRequest extends TeaModel {
    // 相机高度 单位 cm
    @NameInMap("CameraHeight")
    public Long cameraHeight;

    // 图片地址
    @NameInMap("Url")
    public String url;

    public static RectifyImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RectifyImageRequest self = new RectifyImageRequest();
        return TeaModel.build(map, self);
    }

    public RectifyImageRequest setCameraHeight(Long cameraHeight) {
        this.cameraHeight = cameraHeight;
        return this;
    }
    public Long getCameraHeight() {
        return this.cameraHeight;
    }

    public RectifyImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
