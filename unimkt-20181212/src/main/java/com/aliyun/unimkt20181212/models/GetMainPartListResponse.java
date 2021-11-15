// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetMainPartListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMainPartListResponseBody body;

    public static GetMainPartListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMainPartListResponse self = new GetMainPartListResponse();
        return TeaModel.build(map, self);
    }

    public GetMainPartListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMainPartListResponse setBody(GetMainPartListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMainPartListResponseBody getBody() {
        return this.body;
    }

}
