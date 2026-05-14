// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetJinaAiReaderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJinaAiReaderResponseBody body;

    public static GetJinaAiReaderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJinaAiReaderResponse self = new GetJinaAiReaderResponse();
        return TeaModel.build(map, self);
    }

    public GetJinaAiReaderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJinaAiReaderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJinaAiReaderResponse setBody(GetJinaAiReaderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJinaAiReaderResponseBody getBody() {
        return this.body;
    }

}
