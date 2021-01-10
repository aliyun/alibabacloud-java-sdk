// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSSubsTaskResponseBody body;

    public static GetDWSSubsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsTaskResponse self = new GetDWSSubsTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSSubsTaskResponse setBody(GetDWSSubsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSSubsTaskResponseBody getBody() {
        return this.body;
    }

}
