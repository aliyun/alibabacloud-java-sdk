// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCharacterAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/RecognizeVideoCharacter/xxxx.mp4">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/videoenhan/RecognizeVideoCharacter/xxxx.mp4</a></p>
     */
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
