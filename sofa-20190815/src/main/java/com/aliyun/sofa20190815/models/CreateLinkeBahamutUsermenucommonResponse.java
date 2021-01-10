// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutUsermenucommonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutUsermenucommonResponseBody body;

    public static CreateLinkeBahamutUsermenucommonResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutUsermenucommonResponse self = new CreateLinkeBahamutUsermenucommonResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutUsermenucommonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutUsermenucommonResponse setBody(CreateLinkeBahamutUsermenucommonResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutUsermenucommonResponseBody getBody() {
        return this.body;
    }

}
