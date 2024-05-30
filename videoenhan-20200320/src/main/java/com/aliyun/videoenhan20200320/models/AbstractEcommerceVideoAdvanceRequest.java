// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractEcommerceVideoAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Duration")
    public Float duration;

    @NameInMap("Height")
    public Integer height;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    @NameInMap("Width")
    public Integer width;

    public static AbstractEcommerceVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AbstractEcommerceVideoAdvanceRequest self = new AbstractEcommerceVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AbstractEcommerceVideoAdvanceRequest setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public AbstractEcommerceVideoAdvanceRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AbstractEcommerceVideoAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public AbstractEcommerceVideoAdvanceRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
