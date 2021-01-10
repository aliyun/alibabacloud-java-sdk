// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCReleaseplanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLDCReleaseplanResponseBody body;

    public static CreateLDCReleaseplanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCReleaseplanResponse self = new CreateLDCReleaseplanResponse();
        return TeaModel.build(map, self);
    }

    public CreateLDCReleaseplanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLDCReleaseplanResponse setBody(CreateLDCReleaseplanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLDCReleaseplanResponseBody getBody() {
        return this.body;
    }

}
