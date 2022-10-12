// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoModelFaceRequest extends TeaModel {
    @NameInMap("FaceImageURL")
    public String faceImageURL;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("UserId")
    public String userId;

    public static MergeVideoModelFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoModelFaceRequest self = new MergeVideoModelFaceRequest();
        return TeaModel.build(map, self);
    }

    public MergeVideoModelFaceRequest setFaceImageURL(String faceImageURL) {
        this.faceImageURL = faceImageURL;
        return this;
    }
    public String getFaceImageURL() {
        return this.faceImageURL;
    }

    public MergeVideoModelFaceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public MergeVideoModelFaceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
