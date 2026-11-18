// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoRemakeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoRemakeJobResponseBody body;

    public static GetVideoRemakeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoRemakeJobResponse self = new GetVideoRemakeJobResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoRemakeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoRemakeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoRemakeJobResponse setBody(GetVideoRemakeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoRemakeJobResponseBody getBody() {
        return this.body;
    }

}
