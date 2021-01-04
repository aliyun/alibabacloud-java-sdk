// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ValidateTemplateContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateTemplateContentResponseBody body;

    public static ValidateTemplateContentResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateTemplateContentResponse self = new ValidateTemplateContentResponse();
        return TeaModel.build(map, self);
    }

    public ValidateTemplateContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateTemplateContentResponse setBody(ValidateTemplateContentResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateTemplateContentResponseBody getBody() {
        return this.body;
    }

}
