// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeLicensePlateAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static RecognizeLicensePlateAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLicensePlateAdvanceRequest self = new RecognizeLicensePlateAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeLicensePlateAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
