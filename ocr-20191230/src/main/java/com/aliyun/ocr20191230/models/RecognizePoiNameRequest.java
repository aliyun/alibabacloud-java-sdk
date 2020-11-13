// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePoiNameRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizePoiNameRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePoiNameRequest self = new RecognizePoiNameRequest();
        return TeaModel.build(map, self);
    }

    public RecognizePoiNameRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
