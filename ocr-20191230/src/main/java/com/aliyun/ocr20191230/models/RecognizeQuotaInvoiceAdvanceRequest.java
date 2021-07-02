// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQuotaInvoiceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeQuotaInvoiceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQuotaInvoiceAdvanceRequest self = new RecognizeQuotaInvoiceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeQuotaInvoiceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
