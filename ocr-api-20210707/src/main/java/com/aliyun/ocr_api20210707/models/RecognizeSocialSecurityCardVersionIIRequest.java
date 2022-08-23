// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeSocialSecurityCardVersionIIRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeSocialSecurityCardVersionIIRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeSocialSecurityCardVersionIIRequest self = new RecognizeSocialSecurityCardVersionIIRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeSocialSecurityCardVersionIIRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeSocialSecurityCardVersionIIRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
