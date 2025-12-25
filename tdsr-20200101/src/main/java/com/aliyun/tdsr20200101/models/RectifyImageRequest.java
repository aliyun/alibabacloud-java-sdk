// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class RectifyImageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>160</p>
     */
    @NameInMap("CameraHeight")
    public Long cameraHeight;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyundoc.com/****.jpg">https://www.aliyundoc.com/****.jpg</a></p>
     */
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
