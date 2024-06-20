// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateStreamingOutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStreamingOutResponseBody body;

    public static UpdateStreamingOutResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStreamingOutResponse self = new UpdateStreamingOutResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStreamingOutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStreamingOutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStreamingOutResponse setBody(UpdateStreamingOutResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStreamingOutResponseBody getBody() {
        return this.body;
    }

}
