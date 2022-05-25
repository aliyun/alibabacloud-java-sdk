// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVietnamIdentityCardAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    public static RecognizeVietnamIdentityCardAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVietnamIdentityCardAdvanceRequest self = new RecognizeVietnamIdentityCardAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVietnamIdentityCardAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

}
