// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ChangeVideoSizeAdvanceRequest extends TeaModel {
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
    public java.io.InputStream videoUrlObject;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static ChangeVideoSizeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeVideoSizeAdvanceRequest self = new ChangeVideoSizeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ChangeVideoSizeAdvanceRequest setB(Integer b) {
        this.b = b;
        return this;
    }
    public Integer getB() {
        return this.b;
    }

    public ChangeVideoSizeAdvanceRequest setCropType(String cropType) {
        this.cropType = cropType;
        return this;
    }
    public String getCropType() {
        return this.cropType;
    }

    public ChangeVideoSizeAdvanceRequest setFillType(String fillType) {
        this.fillType = fillType;
        return this;
    }
    public String getFillType() {
        return this.fillType;
    }

    public ChangeVideoSizeAdvanceRequest setG(Integer g) {
        this.g = g;
        return this;
    }
    public Integer getG() {
        return this.g;
    }

    public ChangeVideoSizeAdvanceRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public ChangeVideoSizeAdvanceRequest setR(Integer r) {
        this.r = r;
        return this;
    }
    public Integer getR() {
        return this.r;
    }

    public ChangeVideoSizeAdvanceRequest setTightness(Float tightness) {
        this.tightness = tightness;
        return this;
    }
    public Float getTightness() {
        return this.tightness;
    }

    public ChangeVideoSizeAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public ChangeVideoSizeAdvanceRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
