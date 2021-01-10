// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCodequalityflowtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutCodequalityflowtaskResponseBody body;

    public static CreateLinkeBahamutCodequalityflowtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCodequalityflowtaskResponse self = new CreateLinkeBahamutCodequalityflowtaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCodequalityflowtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutCodequalityflowtaskResponse setBody(CreateLinkeBahamutCodequalityflowtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutCodequalityflowtaskResponseBody getBody() {
        return this.body;
    }

}
