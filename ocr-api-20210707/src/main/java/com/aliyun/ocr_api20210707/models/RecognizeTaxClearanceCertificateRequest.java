// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTaxClearanceCertificateRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeTaxClearanceCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTaxClearanceCertificateRequest self = new RecognizeTaxClearanceCertificateRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTaxClearanceCertificateRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeTaxClearanceCertificateRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
