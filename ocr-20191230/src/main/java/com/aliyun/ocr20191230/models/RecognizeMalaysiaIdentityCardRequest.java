// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeMalaysiaIdentityCardRequest extends TeaModel {
    @NameInMap("ImageUrl")
    public String imageUrl;

    public static RecognizeMalaysiaIdentityCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMalaysiaIdentityCardRequest self = new RecognizeMalaysiaIdentityCardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMalaysiaIdentityCardRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
