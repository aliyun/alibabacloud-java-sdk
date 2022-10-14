// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCharacterRequest extends TeaModel {
    @NameInMap("VideoURL")
    public String videoURL;

    public static RecognizeVideoCharacterRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCharacterRequest self = new RecognizeVideoCharacterRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCharacterRequest setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }
    public String getVideoURL() {
        return this.videoURL;
    }

}
