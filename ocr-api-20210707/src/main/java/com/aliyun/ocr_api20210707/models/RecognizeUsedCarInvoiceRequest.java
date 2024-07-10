// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeUsedCarInvoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01NiY6e220zrtvT6dFJ_!!6000000006921-0-tps-3468-4624.jpg">https://img.alicdn.com/imgextra/i4/O1CN01NiY6e220zrtvT6dFJ_!!6000000006921-0-tps-3468-4624.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeUsedCarInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeUsedCarInvoiceRequest self = new RecognizeUsedCarInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeUsedCarInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeUsedCarInvoiceRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
