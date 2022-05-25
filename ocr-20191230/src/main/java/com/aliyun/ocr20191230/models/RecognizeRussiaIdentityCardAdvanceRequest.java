// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeRussiaIdentityCardAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    public static RecognizeRussiaIdentityCardAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRussiaIdentityCardAdvanceRequest self = new RecognizeRussiaIdentityCardAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeRussiaIdentityCardAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

}
