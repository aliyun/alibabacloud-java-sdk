// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutStagetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutStagetaskResponseBody body;

    public static CreateLinkeBahamutStagetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutStagetaskResponse self = new CreateLinkeBahamutStagetaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutStagetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutStagetaskResponse setBody(CreateLinkeBahamutStagetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutStagetaskResponseBody getBody() {
        return this.body;
    }

}
