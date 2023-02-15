// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCharacterAdvanceRequest extends TeaModel {
    @NameInMap("VideoURL")
    public java.io.InputStream videoURLObject;

    public static RecognizeVideoCharacterAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCharacterAdvanceRequest self = new RecognizeVideoCharacterAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCharacterAdvanceRequest setVideoURLObject(java.io.InputStream videoURLObject) {
        this.videoURLObject = videoURLObject;
        return this;
    }
    public java.io.InputStream getVideoURLObject() {
        return this.videoURLObject;
    }

}
