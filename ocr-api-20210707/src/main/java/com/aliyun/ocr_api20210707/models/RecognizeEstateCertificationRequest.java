// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEstateCertificationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1idy2XDZmx1VjSZFGXXax2XXa-713-1133.png">https://img.alicdn.com/tfs/TB1idy2XDZmx1VjSZFGXXax2XXa-713-1133.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeEstateCertificationRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEstateCertificationRequest self = new RecognizeEstateCertificationRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeEstateCertificationRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeEstateCertificationRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
