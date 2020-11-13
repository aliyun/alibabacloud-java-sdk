// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class DetectCardScreenshotAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static DetectCardScreenshotAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectCardScreenshotAdvanceRequest self = new DetectCardScreenshotAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectCardScreenshotAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
