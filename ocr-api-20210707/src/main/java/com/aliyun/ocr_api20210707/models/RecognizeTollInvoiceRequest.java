// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTollInvoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i3/O1CN01uUHo411DCwPsBWDMJ_!!6000000000181-0-tps-199-254.jpg">https://img.alicdn.com/imgextra/i3/O1CN01uUHo411DCwPsBWDMJ_!!6000000000181-0-tps-199-254.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeTollInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTollInvoiceRequest self = new RecognizeTollInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTollInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeTollInvoiceRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
