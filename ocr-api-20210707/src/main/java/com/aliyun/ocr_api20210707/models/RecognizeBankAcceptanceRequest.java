// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBankAcceptanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i1/O1CN016eNk0d1ubhKP4y6gK_!!6000000006056-2-tps-631-570.png">https://img.alicdn.com/imgextra/i1/O1CN016eNk0d1ubhKP4y6gK_!!6000000006056-2-tps-631-570.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeBankAcceptanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankAcceptanceRequest self = new RecognizeBankAcceptanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBankAcceptanceRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeBankAcceptanceRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
