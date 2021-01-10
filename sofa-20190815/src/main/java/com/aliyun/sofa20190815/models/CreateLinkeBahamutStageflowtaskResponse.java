// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutStageflowtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutStageflowtaskResponseBody body;

    public static CreateLinkeBahamutStageflowtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutStageflowtaskResponse self = new CreateLinkeBahamutStageflowtaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutStageflowtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutStageflowtaskResponse setBody(CreateLinkeBahamutStageflowtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutStageflowtaskResponseBody getBody() {
        return this.body;
    }

}
