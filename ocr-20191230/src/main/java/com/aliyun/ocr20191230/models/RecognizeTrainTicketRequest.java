// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTrainTicketRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeTrainTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTrainTicketRequest self = new RecognizeTrainTicketRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTrainTicketRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
