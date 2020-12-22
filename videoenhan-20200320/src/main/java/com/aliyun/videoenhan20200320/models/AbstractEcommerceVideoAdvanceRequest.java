// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractEcommerceVideoAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("Duration")
    public Float duration;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    public static AbstractEcommerceVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AbstractEcommerceVideoAdvanceRequest self = new AbstractEcommerceVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AbstractEcommerceVideoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public AbstractEcommerceVideoAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public AbstractEcommerceVideoAdvanceRequest setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public AbstractEcommerceVideoAdvanceRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public AbstractEcommerceVideoAdvanceRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

}
