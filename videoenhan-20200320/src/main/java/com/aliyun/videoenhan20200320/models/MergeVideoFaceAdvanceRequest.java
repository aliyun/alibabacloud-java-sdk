// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoFaceAdvanceRequest extends TeaModel {
    @NameInMap("ReferenceURL")
    public java.io.InputStream referenceURLObject;

    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

    public static MergeVideoFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoFaceAdvanceRequest self = new MergeVideoFaceAdvanceRequest();
        return TeaModel.build(map, self);
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

}
