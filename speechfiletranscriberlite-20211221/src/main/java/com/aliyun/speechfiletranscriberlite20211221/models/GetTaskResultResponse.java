// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.speechfiletranscriberlite20211221.models;

import com.aliyun.tea.*;

public class GetTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskResultResponseBody body;

    public static GetTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultResponse self = new GetTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskResultResponse setBody(GetTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskResultResponseBody getBody() {
        return this.body;
    }

}
