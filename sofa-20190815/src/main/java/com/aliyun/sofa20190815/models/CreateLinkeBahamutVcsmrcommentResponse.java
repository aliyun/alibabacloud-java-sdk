// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutVcsmrcommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeBahamutVcsmrcommentResponseBody body;

    public static CreateLinkeBahamutVcsmrcommentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutVcsmrcommentResponse self = new CreateLinkeBahamutVcsmrcommentResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutVcsmrcommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeBahamutVcsmrcommentResponse setBody(CreateLinkeBahamutVcsmrcommentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeBahamutVcsmrcommentResponseBody getBody() {
        return this.body;
    }

}
