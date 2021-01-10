// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveClriskTemplateResponseBody body;

    public static SaveClriskTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskTemplateResponse self = new SaveClriskTemplateResponse();
        return TeaModel.build(map, self);
    }

    public SaveClriskTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveClriskTemplateResponse setBody(SaveClriskTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveClriskTemplateResponseBody getBody() {
        return this.body;
    }

}
