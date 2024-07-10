// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCommonPrintedInvoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i2/O1CN01XU9dTh1O4CdHxXhMw_!!6000000001651-0-tps-1437-909.jpg">https://img.alicdn.com/imgextra/i2/O1CN01XU9dTh1O4CdHxXhMw_!!6000000001651-0-tps-1437-909.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeCommonPrintedInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCommonPrintedInvoiceRequest self = new RecognizeCommonPrintedInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCommonPrintedInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeCommonPrintedInvoiceRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
