// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutTaskResponseBody body;

    public static CreateLinkeBahamutTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutTaskResponse self = new CreateLinkeBahamutTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutTaskResponse setBody(CreateLinkeBahamutTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutTaskResponseBody getBody() {
        return this.body;
    }

}
