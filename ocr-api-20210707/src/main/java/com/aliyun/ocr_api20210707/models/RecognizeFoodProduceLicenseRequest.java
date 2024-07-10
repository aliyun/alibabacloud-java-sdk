// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeFoodProduceLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1YaMhXKT2gK0jSZFvXXXnFXXa-1414-1000.png">https://img.alicdn.com/tfs/TB1YaMhXKT2gK0jSZFvXXXnFXXa-1414-1000.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeFoodProduceLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFoodProduceLicenseRequest self = new RecognizeFoodProduceLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFoodProduceLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeFoodProduceLicenseRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
