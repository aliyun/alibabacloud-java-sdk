// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeIndonesiaIdentityCardRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static RecognizeIndonesiaIdentityCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIndonesiaIdentityCardRequest self = new RecognizeIndonesiaIdentityCardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeIndonesiaIdentityCardRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
