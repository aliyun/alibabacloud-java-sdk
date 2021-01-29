// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVINCodeAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("ImageType")
    public Integer imageType;

    public static RecognizeVINCodeAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVINCodeAdvanceRequest self = new RecognizeVINCodeAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVINCodeAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RecognizeVINCodeAdvanceRequest setImageType(Integer imageType) {
        this.imageType = imageType;
        return this;
    }
    public Integer getImageType() {
        return this.imageType;
    }

}
