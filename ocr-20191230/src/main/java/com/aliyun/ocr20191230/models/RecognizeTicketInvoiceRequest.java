// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTicketInvoiceRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeTicketInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTicketInvoiceRequest self = new RecognizeTicketInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTicketInvoiceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
