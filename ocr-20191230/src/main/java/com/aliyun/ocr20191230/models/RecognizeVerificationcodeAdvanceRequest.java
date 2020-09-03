// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVerificationcodeAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeVerificationcodeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVerificationcodeAdvanceRequest self = new RecognizeVerificationcodeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVerificationcodeAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
