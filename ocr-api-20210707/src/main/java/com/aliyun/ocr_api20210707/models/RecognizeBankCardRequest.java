// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBankCardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1fL.fiCzqK1RjSZPcXXbTepXa-3116-2139.jpg">https://img.alicdn.com/tfs/TB1fL.fiCzqK1RjSZPcXXbTepXa-3116-2139.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeBankCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankCardRequest self = new RecognizeBankCardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBankCardRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeBankCardRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
