// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCommonPrintedInvoiceRequest extends TeaModel {
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
