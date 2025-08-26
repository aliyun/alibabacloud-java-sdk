// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQuotaInvoiceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeQuotaInvoice/RecognizeQuotaInvoice1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeQuotaInvoice/RecognizeQuotaInvoice1.jpg</a></p>
     */
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
