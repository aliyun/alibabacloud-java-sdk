// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktTemplateorderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveLinkeLinktTemplateorderResponseBody body;

    public static SaveLinkeLinktTemplateorderResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktTemplateorderResponse self = new SaveLinkeLinktTemplateorderResponse();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktTemplateorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveLinkeLinktTemplateorderResponse setBody(SaveLinkeLinktTemplateorderResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveLinkeLinktTemplateorderResponseBody getBody() {
        return this.body;
    }

}
