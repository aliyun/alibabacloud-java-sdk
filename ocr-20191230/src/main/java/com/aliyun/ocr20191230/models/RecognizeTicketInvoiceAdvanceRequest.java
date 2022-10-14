// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTicketInvoiceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static RecognizeTicketInvoiceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTicketInvoiceAdvanceRequest self = new RecognizeTicketInvoiceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTicketInvoiceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
