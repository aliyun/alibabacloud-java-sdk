// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class GetReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Release body;

    public static GetReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetReleaseResponse self = new GetReleaseResponse();
        return TeaModel.build(map, self);
    }

    public GetReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetReleaseResponse setBody(Release body) {
        this.body = body;
        return this;
    }
    public Release getBody() {
        return this.body;
    }

}
