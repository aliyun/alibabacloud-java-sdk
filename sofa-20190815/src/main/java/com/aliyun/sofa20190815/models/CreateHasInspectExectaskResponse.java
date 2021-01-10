// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasInspectExectaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasInspectExectaskResponseBody body;

    public static CreateHasInspectExectaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasInspectExectaskResponse self = new CreateHasInspectExectaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasInspectExectaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasInspectExectaskResponse setBody(CreateHasInspectExectaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasInspectExectaskResponseBody getBody() {
        return this.body;
    }

}
