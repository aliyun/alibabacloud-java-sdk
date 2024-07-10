// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeDrivingLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB18sTuNSzqK1RjSZPxXXc4tVXa-629-416.png">https://img.alicdn.com/tfs/TB18sTuNSzqK1RjSZPxXXc4tVXa-629-416.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeDrivingLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDrivingLicenseRequest self = new RecognizeDrivingLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeDrivingLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeDrivingLicenseRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
