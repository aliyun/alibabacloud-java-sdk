// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTaxiInvoiceAdvanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeTaxiInvoice/RecognizeTaxiInvoice2.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeTaxiInvoice/RecognizeTaxiInvoice2.jpg</a></p>
     */
    @NameInMap("ImageURL")
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
