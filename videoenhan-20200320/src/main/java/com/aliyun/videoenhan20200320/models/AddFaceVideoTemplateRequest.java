// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AddFaceVideoTemplateRequest extends TeaModel {
    // A short description of struct
    @NameInMap("UserId")
    public String userId;

    @NameInMap("VideoURL")
    public String videoURL;

    public static AddFaceVideoTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceVideoTemplateRequest self = new AddFaceVideoTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceVideoTemplateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AddFaceVideoTemplateRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

}
