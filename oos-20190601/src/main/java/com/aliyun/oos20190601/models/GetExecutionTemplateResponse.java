// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetExecutionTemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetExecutionTemplateResponseBody body;

    public static GetExecutionTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExecutionTemplateResponse self = new GetExecutionTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetExecutionTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExecutionTemplateResponse setBody(GetExecutionTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExecutionTemplateResponseBody getBody() {
        return this.body;
    }

}
