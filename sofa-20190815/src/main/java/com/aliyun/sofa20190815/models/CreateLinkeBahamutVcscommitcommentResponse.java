// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutVcscommitcommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutVcscommitcommentResponseBody body;

    public static CreateLinkeBahamutVcscommitcommentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutVcscommitcommentResponse self = new CreateLinkeBahamutVcscommitcommentResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutVcscommitcommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutVcscommitcommentResponse setBody(CreateLinkeBahamutVcscommitcommentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutVcscommitcommentResponseBody getBody() {
        return this.body;
    }

}
