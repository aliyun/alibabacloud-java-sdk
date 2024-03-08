// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopStreamingOutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopStreamingOutResponseBody body;

    public static StopStreamingOutResponse build(java.util.Map<String, ?> map) throws Exception {
        StopStreamingOutResponse self = new StopStreamingOutResponse();
        return TeaModel.build(map, self);
    }

    public StopStreamingOutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopStreamingOutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopStreamingOutResponse setBody(StopStreamingOutResponseBody body) {
        this.body = body;
        return this;
    }
    public StopStreamingOutResponseBody getBody() {
        return this.body;
    }

}
