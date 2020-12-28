// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractEcommerceVideoRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("Duration")
    @Validation(required = true)
    public Float duration;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    public static AbstractEcommerceVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        AbstractEcommerceVideoRequest self = new AbstractEcommerceVideoRequest();
        return TeaModel.build(map, self);
    }

    public AbstractEcommerceVideoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public AbstractEcommerceVideoRequest setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public AbstractEcommerceVideoRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public AbstractEcommerceVideoRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

}
