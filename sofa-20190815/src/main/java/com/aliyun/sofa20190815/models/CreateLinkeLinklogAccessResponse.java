// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinklogAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeLinklogAccessResponseBody body;

    public static CreateLinkeLinklogAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinklogAccessResponse self = new CreateLinkeLinklogAccessResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinklogAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeLinklogAccessResponse setBody(CreateLinkeLinklogAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeLinklogAccessResponseBody getBody() {
        return this.body;
    }

}
