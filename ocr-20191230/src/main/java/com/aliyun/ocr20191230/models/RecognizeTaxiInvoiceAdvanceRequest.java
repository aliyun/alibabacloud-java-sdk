// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTaxiInvoiceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeTaxiInvoiceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTaxiInvoiceAdvanceRequest self = new RecognizeTaxiInvoiceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTaxiInvoiceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
