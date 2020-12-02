// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoFaceAdvanceRequest extends TeaModel {
    @NameInMap("VideoURLObject")
    @Validation(required = true)
    public java.io.InputStream videoURLObject;

    @NameInMap("PostURL")
    @Validation(required = true)
    public String postURL;

    @NameInMap("ReferenceURL")
    @Validation(required = true)
    public String referenceURL;

    public static MergeVideoFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoFaceAdvanceRequest self = new MergeVideoFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public MergeVideoFaceAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

    public MergeVideoFaceAdvanceRequest setPostURL(String postURL) {
        this.postURL = postURL;
        return this;
    }
    public String getPostURL() {
        return this.postURL;
    }

    public MergeVideoFaceAdvanceRequest setReferenceURL(String referenceURL) {
        this.referenceURL = referenceURL;
        return this;
    }
    public String getReferenceURL() {
        return this.referenceURL;
    }

}
