// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoFaceAdvanceRequest extends TeaModel {
    @NameInMap("AddWatermark")
    public Boolean addWatermark;

    @NameInMap("Enhance")
    public Boolean enhance;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReferenceURL")
    public java.io.InputStream referenceURLObject;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

    @NameInMap("WatermarkType")
    public String watermarkType;

    public static MergeVideoFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoFaceAdvanceRequest self = new MergeVideoFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public MergeVideoFaceAdvanceRequest setAddWatermark(Boolean addWatermark) {
        this.addWatermark = addWatermark;
        return this;
    }
    public Boolean getAddWatermark() {
        return this.addWatermark;
    }

    public MergeVideoFaceAdvanceRequest setEnhance(Boolean enhance) {
        this.enhance = enhance;
        return this;
    }
    public Boolean getEnhance() {
        return this.enhance;
    }

    public MergeVideoFaceAdvanceRequest setReferenceURLObject(java.io.InputStream referenceURLObject) {
        this.referenceURLObject = referenceURLObject;
        return this;
    }
    public java.io.InputStream getReferenceURLObject() {
        return this.referenceURLObject;
    }

    public MergeVideoFaceAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

    public MergeVideoFaceAdvanceRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

}
