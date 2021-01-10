// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCommonuserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutCommonuserResponseBody body;

    public static CreateLinkeBahamutCommonuserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCommonuserResponse self = new CreateLinkeBahamutCommonuserResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCommonuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutCommonuserResponse setBody(CreateLinkeBahamutCommonuserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutCommonuserResponseBody getBody() {
        return this.body;
    }

}
