// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeQuotaInvoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1SwAeXHr1gK0jSZR0XXbP8XXa-870-604.jpg">https://img.alicdn.com/tfs/TB1SwAeXHr1gK0jSZR0XXbP8XXa-870-604.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeQuotaInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQuotaInvoiceRequest self = new RecognizeQuotaInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeQuotaInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeQuotaInvoiceRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
