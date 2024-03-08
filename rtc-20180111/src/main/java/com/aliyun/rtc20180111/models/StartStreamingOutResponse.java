// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartStreamingOutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartStreamingOutResponseBody body;

    public static StartStreamingOutResponse build(java.util.Map<String, ?> map) throws Exception {
        StartStreamingOutResponse self = new StartStreamingOutResponse();
        return TeaModel.build(map, self);
    }

    public StartStreamingOutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartStreamingOutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartStreamingOutResponse setBody(StartStreamingOutResponseBody body) {
        this.body = body;
        return this;
    }
    public StartStreamingOutResponseBody getBody() {
        return this.body;
    }

}
