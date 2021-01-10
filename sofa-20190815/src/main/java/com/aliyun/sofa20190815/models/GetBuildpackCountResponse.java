// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetBuildpackCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBuildpackCountResponseBody body;

    public static GetBuildpackCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBuildpackCountResponse self = new GetBuildpackCountResponse();
        return TeaModel.build(map, self);
    }

    public GetBuildpackCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBuildpackCountResponse setBody(GetBuildpackCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBuildpackCountResponseBody getBody() {
        return this.body;
    }

}
