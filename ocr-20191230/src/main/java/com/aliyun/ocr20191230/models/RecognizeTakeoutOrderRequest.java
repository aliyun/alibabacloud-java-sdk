// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTakeoutOrderRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeTakeoutOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTakeoutOrderRequest self = new RecognizeTakeoutOrderRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTakeoutOrderRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
