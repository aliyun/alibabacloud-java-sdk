// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccessKeyLastUsedResponseBody body;

    public static GetAccessKeyLastUsedResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedResponse self = new GetAccessKeyLastUsedResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessKeyLastUsedResponse setBody(GetAccessKeyLastUsedResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessKeyLastUsedResponseBody getBody() {
        return this.body;
    }

}
