// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetVideoDetextJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoDetextJobResponseBody body;

    public static GetVideoDetextJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDetextJobResponse self = new GetVideoDetextJobResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoDetextJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoDetextJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoDetextJobResponse setBody(GetVideoDetextJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoDetextJobResponseBody getBody() {
        return this.body;
    }

}
