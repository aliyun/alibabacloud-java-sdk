// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class DetectCardScreenshotRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static DetectCardScreenshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectCardScreenshotRequest self = new DetectCardScreenshotRequest();
        return TeaModel.build(map, self);
    }

    public DetectCardScreenshotRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
