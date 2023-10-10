// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoFaceRequest extends TeaModel {
    @NameInMap("AddWatermark")
    public Boolean addWatermark;

    @NameInMap("Enhance")
    public Boolean enhance;

    @NameInMap("ReferenceURL")
    public String referenceURL;

    @NameInMap("VideoURL")
    public String videoURL;

    @NameInMap("WatermarkType")
    public String watermarkType;

    public static MergeVideoFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoFaceRequest self = new MergeVideoFaceRequest();
        return TeaModel.build(map, self);
    }

    public MergeVideoFaceRequest setAddWatermark(Boolean addWatermark) {
        this.addWatermark = addWatermark;
        return this;
    }
    public Boolean getAddWatermark() {
        return this.addWatermark;
    }

    public MergeVideoFaceRequest setEnhance(Boolean enhance) {
        this.enhance = enhance;
        return this;
    }
    public Boolean getEnhance() {
        return this.enhance;
    }

    public MergeVideoFaceRequest setReferenceURL(String referenceURL) {
        this.referenceURL = referenceURL;
        return this;
    }
    public String getReferenceURL() {
        return this.referenceURL;
    }

    public MergeVideoFaceRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

    public MergeVideoFaceRequest setWatermarkType(String watermarkType) {
        this.watermarkType = watermarkType;
        return this;
    }
    public String getWatermarkType() {
        return this.watermarkType;
    }

}
