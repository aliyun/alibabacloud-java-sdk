// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizePassportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1uHglUgHqK1RjSZFEXXcGMXXa-800-502.png">https://img.alicdn.com/tfs/TB1uHglUgHqK1RjSZFEXXcGMXXa-800-502.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizePassportRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizePassportRequest self = new RecognizePassportRequest();
        return TeaModel.build(map, self);
    }

    public RecognizePassportRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizePassportRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
