// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutAppofflinecreateofflineappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutAppofflinecreateofflineappResponseBody body;

    public static CreateLinkeBahamutAppofflinecreateofflineappResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutAppofflinecreateofflineappResponse self = new CreateLinkeBahamutAppofflinecreateofflineappResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutAppofflinecreateofflineappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutAppofflinecreateofflineappResponse setBody(CreateLinkeBahamutAppofflinecreateofflineappResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutAppofflinecreateofflineappResponseBody getBody() {
        return this.body;
    }

}
