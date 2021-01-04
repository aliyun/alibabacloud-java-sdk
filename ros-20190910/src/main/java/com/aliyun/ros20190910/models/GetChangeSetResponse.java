// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetChangeSetResponseBody body;

    public static GetChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetChangeSetResponse self = new GetChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public GetChangeSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetChangeSetResponse setBody(GetChangeSetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetChangeSetResponseBody getBody() {
        return this.body;
    }

}
