// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetAutoOpsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoOpsTaskResponseBody body;

    public static GetAutoOpsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoOpsTaskResponse self = new GetAutoOpsTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoOpsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoOpsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoOpsTaskResponse setBody(GetAutoOpsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoOpsTaskResponseBody getBody() {
        return this.body;
    }

}
