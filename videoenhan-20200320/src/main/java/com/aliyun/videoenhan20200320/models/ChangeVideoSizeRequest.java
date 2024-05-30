// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ChangeVideoSizeRequest extends TeaModel {
    @NameInMap("B")
    public Integer b;

    @NameInMap("CropType")
    public String cropType;

    @NameInMap("FillType")
    public String fillType;

    @NameInMap("G")
    public Integer g;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Height")
    public Integer height;

    @NameInMap("R")
    public Integer r;

    @NameInMap("Tightness")
    public Float tightness;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoUrl")
    public String videoUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static ChangeVideoSizeRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeVideoSizeRequest self = new ChangeVideoSizeRequest();
        return TeaModel.build(map, self);
    }

    public ChangeVideoSizeRequest setB(Integer b) {
        this.b = b;
        return this;
    }
    public Integer getB() {
        return this.b;
    }

    public ChangeVideoSizeRequest setCropType(String cropType) {
        this.cropType = cropType;
        return this;
    }
    public String getCropType() {
        return this.cropType;
    }

    public ChangeVideoSizeRequest setFillType(String fillType) {
        this.fillType = fillType;
        return this;
    }
    public String getFillType() {
        return this.fillType;
    }

    public ChangeVideoSizeRequest setG(Integer g) {
        this.g = g;
        return this;
    }
    public Integer getG() {
        return this.g;
    }

    public ChangeVideoSizeRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public ChangeVideoSizeRequest setR(Integer r) {
        this.r = r;
        return this;
    }
    public Integer getR() {
        return this.r;
    }

    public ChangeVideoSizeRequest setTightness(Float tightness) {
        this.tightness = tightness;
        return this;
    }
    public Float getTightness() {
        return this.tightness;
    }

    public ChangeVideoSizeRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public ChangeVideoSizeRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
