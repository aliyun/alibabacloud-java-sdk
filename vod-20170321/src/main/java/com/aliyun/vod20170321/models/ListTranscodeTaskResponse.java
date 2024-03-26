// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListTranscodeTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTranscodeTaskResponseBody body;

    public static ListTranscodeTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTranscodeTaskResponse self = new ListTranscodeTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListTranscodeTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTranscodeTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTranscodeTaskResponse setBody(ListTranscodeTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTranscodeTaskResponseBody getBody() {
        return this.body;
    }

}
