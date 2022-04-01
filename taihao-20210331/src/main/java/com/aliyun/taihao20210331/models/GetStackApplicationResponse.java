// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetStackApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStackApplicationResponseBody body;

    public static GetStackApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackApplicationResponse self = new GetStackApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetStackApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackApplicationResponse setBody(GetStackApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackApplicationResponseBody getBody() {
        return this.body;
    }

}
