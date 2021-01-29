// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeIdentityCardAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("ImageType")
    public Integer imageType;

    @NameInMap("Side")
    public String side;

    public static RecognizeIdentityCardAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIdentityCardAdvanceRequest self = new RecognizeIdentityCardAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeIdentityCardAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RecognizeIdentityCardAdvanceRequest setImageType(Integer imageType) {
        this.imageType = imageType;
        return this;
    }
    public Integer getImageType() {
        return this.imageType;
    }

    public RecognizeIdentityCardAdvanceRequest setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

}
