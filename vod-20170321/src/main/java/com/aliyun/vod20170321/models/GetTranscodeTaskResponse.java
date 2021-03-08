// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTranscodeTaskResponseBody body;

    public static GetTranscodeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTaskResponse self = new GetTranscodeTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranscodeTaskResponse setBody(GetTranscodeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranscodeTaskResponseBody getBody() {
        return this.body;
    }

}
