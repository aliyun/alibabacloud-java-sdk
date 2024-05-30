// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AddFaceVideoTemplateAdvanceRequest extends TeaModel {
    @NameInMap("VideoScene")
    public String videoScene;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

    public static AddFaceVideoTemplateAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceVideoTemplateAdvanceRequest self = new AddFaceVideoTemplateAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceVideoTemplateAdvanceRequest setVideoScene(String videoScene) {
        this.videoScene = videoScene;
        return this;
    }
    public String getVideoScene() {
        return this.videoScene;
    }

    public AddFaceVideoTemplateAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

}
