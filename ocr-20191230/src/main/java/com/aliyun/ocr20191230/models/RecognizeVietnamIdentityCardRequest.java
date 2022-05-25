// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVietnamIdentityCardRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static RecognizeVietnamIdentityCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVietnamIdentityCardRequest self = new RecognizeVietnamIdentityCardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVietnamIdentityCardRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
