// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCurrentuserswitchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutCurrentuserswitchResponseBody body;

    public static CreateLinkeBahamutCurrentuserswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCurrentuserswitchResponse self = new CreateLinkeBahamutCurrentuserswitchResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCurrentuserswitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutCurrentuserswitchResponse setBody(CreateLinkeBahamutCurrentuserswitchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutCurrentuserswitchResponseBody getBody() {
        return this.body;
    }

}
