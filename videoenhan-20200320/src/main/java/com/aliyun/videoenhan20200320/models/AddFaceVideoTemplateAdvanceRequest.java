// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AddFaceVideoTemplateAdvanceRequest extends TeaModel {
    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

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

}
