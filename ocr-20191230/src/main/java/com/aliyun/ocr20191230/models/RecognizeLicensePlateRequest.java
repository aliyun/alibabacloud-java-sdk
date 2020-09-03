// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeLicensePlateRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeLicensePlateRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLicensePlateRequest self = new RecognizeLicensePlateRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeLicensePlateRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
