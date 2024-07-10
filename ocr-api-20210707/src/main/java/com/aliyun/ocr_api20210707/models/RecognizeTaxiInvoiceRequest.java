// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTaxiInvoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1.OicXebviK0jSZFNXXaApXXa-364-982.jpg">https://img.alicdn.com/tfs/TB1.OicXebviK0jSZFNXXaApXXa-364-982.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeTaxiInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTaxiInvoiceRequest self = new RecognizeTaxiInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTaxiInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeTaxiInvoiceRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
