// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeInternationalBusinessLicenseRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeInternationalBusinessLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeInternationalBusinessLicenseRequest self = new RecognizeInternationalBusinessLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeInternationalBusinessLicenseRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public RecognizeInternationalBusinessLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeInternationalBusinessLicenseRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
