// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoModelFaceAdvanceRequest extends TeaModel {
    @NameInMap("FaceImageURLObject")
    @Validation(required = true)
    public java.io.InputStream faceImageURLObject;

    // A short description of struct
    @NameInMap("UserId")
    public String userId;

    @NameInMap("TemplateId")
    public String templateId;

    public static MergeVideoModelFaceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoModelFaceAdvanceRequest self = new MergeVideoModelFaceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public MergeVideoModelFaceAdvanceRequest setFaceImageURLObject(java.io.InputStream faceImageURLObject) {
        this.faceImageURLObject = faceImageURLObject;
        return this;
    }
    public java.io.InputStream getFaceImageURLObject() {
        return this.faceImageURLObject;
    }

    public MergeVideoModelFaceAdvanceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MergeVideoModelFaceAdvanceRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
