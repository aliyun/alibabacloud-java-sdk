// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeChinapassportAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeChinapassportAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeChinapassportAdvanceRequest self = new RecognizeChinapassportAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeChinapassportAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
