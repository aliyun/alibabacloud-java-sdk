// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeRussiaIdentityCardRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static RecognizeRussiaIdentityCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRussiaIdentityCardRequest self = new RecognizeRussiaIdentityCardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeRussiaIdentityCardRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
