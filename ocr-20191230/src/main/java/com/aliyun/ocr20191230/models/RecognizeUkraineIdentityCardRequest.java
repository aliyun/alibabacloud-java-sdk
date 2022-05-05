// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeUkraineIdentityCardRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static RecognizeUkraineIdentityCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeUkraineIdentityCardRequest self = new RecognizeUkraineIdentityCardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeUkraineIdentityCardRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
