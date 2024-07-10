// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTrainInvoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1u1HrUmzqK1RjSZFpXXakSXXa-1200-900.jpg">https://img.alicdn.com/tfs/TB1u1HrUmzqK1RjSZFpXXakSXXa-1200-900.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeTrainInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTrainInvoiceRequest self = new RecognizeTrainInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTrainInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeTrainInvoiceRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
