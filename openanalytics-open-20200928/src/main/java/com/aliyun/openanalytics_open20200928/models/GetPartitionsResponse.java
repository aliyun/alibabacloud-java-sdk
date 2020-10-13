// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class GetPartitionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPartitionsResponseBody body;

    public static GetPartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionsResponse self = new GetPartitionsResponse();
        return TeaModel.build(map, self);
    }

    public GetPartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPartitionsResponse setBody(GetPartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPartitionsResponseBody getBody() {
        return this.body;
    }

}
