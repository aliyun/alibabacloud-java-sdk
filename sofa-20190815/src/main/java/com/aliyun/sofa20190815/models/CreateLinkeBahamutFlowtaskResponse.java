// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutFlowtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutFlowtaskResponseBody body;

    public static CreateLinkeBahamutFlowtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutFlowtaskResponse self = new CreateLinkeBahamutFlowtaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutFlowtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutFlowtaskResponse setBody(CreateLinkeBahamutFlowtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutFlowtaskResponseBody getBody() {
        return this.body;
    }

}
