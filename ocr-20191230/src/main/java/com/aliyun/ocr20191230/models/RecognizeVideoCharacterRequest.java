// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCharacterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/RecognizeVideoCharacter/xxxx.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/RecognizeVideoCharacter/xxxx.mp4</a></p>
     */
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
