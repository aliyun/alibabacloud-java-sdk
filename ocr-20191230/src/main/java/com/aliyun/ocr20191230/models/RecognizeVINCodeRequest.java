// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVINCodeRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeVINCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVINCodeRequest self = new RecognizeVINCodeRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVINCodeRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
