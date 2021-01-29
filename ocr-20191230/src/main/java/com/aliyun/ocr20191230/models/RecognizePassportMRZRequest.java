// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePassportMRZRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizePassportMRZRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePassportMRZRequest self = new RecognizePassportMRZRequest();
        return TeaModel.build(map, self);
    }

    public RecognizePassportMRZRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
