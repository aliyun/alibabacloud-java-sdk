// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportClriskTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportClriskTemplateResponseBody body;

    public static ImportClriskTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportClriskTemplateResponse self = new ImportClriskTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ImportClriskTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportClriskTemplateResponse setBody(ImportClriskTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportClriskTemplateResponseBody getBody() {
        return this.body;
    }

}
