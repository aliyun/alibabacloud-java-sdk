// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetAgentFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAgentFileUrlResponseBody body;

    public static GetAgentFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentFileUrlResponse self = new GetAgentFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentFileUrlResponse setBody(GetAgentFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentFileUrlResponseBody getBody() {
        return this.body;
    }

}
