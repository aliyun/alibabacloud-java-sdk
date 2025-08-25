// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleVideoRequest extends TeaModel {
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
    public String videoUrl;

    public static GenerateHumanAnimeStyleVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleVideoRequest self = new GenerateHumanAnimeStyleVideoRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleVideoRequest setCartoonStyle(String cartoonStyle) {
        this.cartoonStyle = cartoonStyle;
        return this;
    }
    public String getCartoonStyle() {
        return this.cartoonStyle;
    }

    public GenerateHumanAnimeStyleVideoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
