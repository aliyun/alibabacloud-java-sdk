// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTrainTicketAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeTrainTicketAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTrainTicketAdvanceRequest self = new RecognizeTrainTicketAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTrainTicketAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
