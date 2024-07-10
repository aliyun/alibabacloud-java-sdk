// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBusinessLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1nnHJNSrqK1RjSZK9XXXyypXa-564-829.png">https://img.alicdn.com/tfs/TB1nnHJNSrqK1RjSZK9XXXyypXa-564-829.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeBusinessLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusinessLicenseRequest self = new RecognizeBusinessLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBusinessLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeBusinessLicenseRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
