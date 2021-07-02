// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQuotaInvoiceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeQuotaInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQuotaInvoiceRequest self = new RecognizeQuotaInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeQuotaInvoiceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
