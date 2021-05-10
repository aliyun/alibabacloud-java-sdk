// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeStampRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeStampRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeStampRequest self = new RecognizeStampRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeStampRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
