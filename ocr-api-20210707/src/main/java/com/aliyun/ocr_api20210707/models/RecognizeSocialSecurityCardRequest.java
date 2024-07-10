// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeSocialSecurityCardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01zpM9bJ1Pa5pCwJat7_!!6000000001856-0-tps-282-179.jpg">https://img.alicdn.com/imgextra/i4/O1CN01zpM9bJ1Pa5pCwJat7_!!6000000001856-0-tps-282-179.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeSocialSecurityCardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeSocialSecurityCardRequest self = new RecognizeSocialSecurityCardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeSocialSecurityCardRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeSocialSecurityCardRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
