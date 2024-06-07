// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeInternationalIdcardRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Country")
    public String country;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeInternationalIdcardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeInternationalIdcardRequest self = new RecognizeInternationalIdcardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeInternationalIdcardRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public RecognizeInternationalIdcardRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeInternationalIdcardRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
