// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutUsertokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutUsertokenResponseBody body;

    public static CreateLinkeBahamutUsertokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutUsertokenResponse self = new CreateLinkeBahamutUsertokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutUsertokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutUsertokenResponse setBody(CreateLinkeBahamutUsertokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutUsertokenResponseBody getBody() {
        return this.body;
    }

}
