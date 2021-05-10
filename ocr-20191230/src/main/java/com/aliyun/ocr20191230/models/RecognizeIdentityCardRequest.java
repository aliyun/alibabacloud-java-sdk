// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeIdentityCardRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("Side")
    public String side;

    public static RecognizeIdentityCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIdentityCardRequest self = new RecognizeIdentityCardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeIdentityCardRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RecognizeIdentityCardRequest setSide(String side) {
        this.side = side;
        return this;
    }
    public String getSide() {
        return this.side;
    }

}
