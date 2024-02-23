// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tingwu20230930.models;

import com.aliyun.tea.*;

public class GetTranscriptionPhrasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTranscriptionPhrasesResponseBody body;

    public static GetTranscriptionPhrasesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTranscriptionPhrasesResponse self = new GetTranscriptionPhrasesResponse();
        return TeaModel.build(map, self);
    }

    public GetTranscriptionPhrasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTranscriptionPhrasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTranscriptionPhrasesResponse setBody(GetTranscriptionPhrasesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTranscriptionPhrasesResponseBody getBody() {
        return this.body;
    }

}
