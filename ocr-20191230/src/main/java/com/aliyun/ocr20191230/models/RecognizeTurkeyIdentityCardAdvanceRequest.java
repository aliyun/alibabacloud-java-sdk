// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTurkeyIdentityCardAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public java.io.InputStream imageUrlObject;

    public static RecognizeTurkeyIdentityCardAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTurkeyIdentityCardAdvanceRequest self = new RecognizeTurkeyIdentityCardAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTurkeyIdentityCardAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

}
