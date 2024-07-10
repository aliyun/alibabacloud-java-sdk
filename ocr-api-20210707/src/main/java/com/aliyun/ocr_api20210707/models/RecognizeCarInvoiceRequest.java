// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCarInvoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1hC7bXCzqK1RjSZPcXXbTepXa-832-616.jpg">https://img.alicdn.com/tfs/TB1hC7bXCzqK1RjSZPcXXbTepXa-832-616.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeCarInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCarInvoiceRequest self = new RecognizeCarInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeCarInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeCarInvoiceRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
