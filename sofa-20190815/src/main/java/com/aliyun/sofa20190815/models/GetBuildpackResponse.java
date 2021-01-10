// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetBuildpackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBuildpackResponseBody body;

    public static GetBuildpackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBuildpackResponse self = new GetBuildpackResponse();
        return TeaModel.build(map, self);
    }

    public GetBuildpackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBuildpackResponse setBody(GetBuildpackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBuildpackResponseBody getBody() {
        return this.body;
    }

}
