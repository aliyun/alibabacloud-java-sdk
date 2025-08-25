// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleVideoAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>anime</p>
     */
    @NameInMap("CartoonStyle")
    public String cartoonStyle;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/xxx/eas/EvaluateVideoQuality/123.mp4">https://viapi-test.oss-cn-shanghai.aliyuncs.com/test/xxx/eas/EvaluateVideoQuality/123.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static GenerateHumanAnimeStyleVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleVideoAdvanceRequest self = new GenerateHumanAnimeStyleVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleVideoAdvanceRequest setCartoonStyle(String cartoonStyle) {
        this.cartoonStyle = cartoonStyle;
        return this;
    }
    public String getCartoonStyle() {
        return this.cartoonStyle;
    }

    public GenerateHumanAnimeStyleVideoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

}
