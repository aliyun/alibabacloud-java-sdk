// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AddFaceVideoTemplateAdvanceRequest extends TeaModel {
    @NameInMap("VideoURLObject")
    @Validation(required = true)
    public java.io.InputStream videoURLObject;

    // A short description of struct
    @NameInMap("UserId")
    public String userId;

    public static AddFaceVideoTemplateAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceVideoTemplateAdvanceRequest self = new AddFaceVideoTemplateAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceVideoTemplateAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

    public AddFaceVideoTemplateAdvanceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
