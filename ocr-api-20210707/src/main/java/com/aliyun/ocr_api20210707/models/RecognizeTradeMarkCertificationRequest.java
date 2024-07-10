// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTradeMarkCertificationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1SZiGdfb2gK0jSZK9XXaEgFXa-1654-2340.png">https://img.alicdn.com/tfs/TB1SZiGdfb2gK0jSZK9XXaEgFXa-1654-2340.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeTradeMarkCertificationRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTradeMarkCertificationRequest self = new RecognizeTradeMarkCertificationRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTradeMarkCertificationRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeTradeMarkCertificationRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
