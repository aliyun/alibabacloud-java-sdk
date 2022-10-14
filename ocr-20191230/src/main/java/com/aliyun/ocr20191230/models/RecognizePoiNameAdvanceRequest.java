// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePoiNameAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static RecognizePoiNameAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePoiNameAdvanceRequest self = new RecognizePoiNameAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizePoiNameAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
