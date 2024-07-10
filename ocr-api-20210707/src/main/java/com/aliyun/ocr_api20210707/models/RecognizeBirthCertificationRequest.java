// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBirthCertificationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1P6Yll8Bh1e4jSZFhXXcC9VXa-1381-962.png">https://img.alicdn.com/tfs/TB1P6Yll8Bh1e4jSZFhXXcC9VXa-1381-962.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeBirthCertificationRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBirthCertificationRequest self = new RecognizeBirthCertificationRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBirthCertificationRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeBirthCertificationRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
