// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLastOnceTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLastOnceTaskInfoResponseBody body;

    public static GetLastOnceTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLastOnceTaskInfoResponse self = new GetLastOnceTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLastOnceTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLastOnceTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLastOnceTaskInfoResponse setBody(GetLastOnceTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLastOnceTaskInfoResponseBody getBody() {
        return this.body;
    }

}
