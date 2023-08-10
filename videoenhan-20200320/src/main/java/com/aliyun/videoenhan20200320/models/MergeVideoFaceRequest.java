// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoFaceRequest extends TeaModel {
    @NameInMap("AddWatermark")
    public Boolean addWatermark;

    @NameInMap("ReferenceURL")
    public String referenceURL;

    @NameInMap("VideoURL")
    public String videoURL;

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

}
