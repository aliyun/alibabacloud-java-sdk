// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBankAccountLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB17liGda67gK0jSZFHXXa9jVXa-1375-1000.png">https://img.alicdn.com/tfs/TB17liGda67gK0jSZFHXXa9jVXa-1375-1000.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeBankAccountLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankAccountLicenseRequest self = new RecognizeBankAccountLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBankAccountLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeBankAccountLicenseRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
