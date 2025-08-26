// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTicketInvoiceAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeTicketInvoice/RecognizeTicketInvoice1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeTicketInvoice/RecognizeTicketInvoice1.png</a></p>
     */
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
