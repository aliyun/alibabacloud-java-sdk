// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTurkeyIdentityCardRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static RecognizeTurkeyIdentityCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTurkeyIdentityCardRequest self = new RecognizeTurkeyIdentityCardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTurkeyIdentityCardRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
