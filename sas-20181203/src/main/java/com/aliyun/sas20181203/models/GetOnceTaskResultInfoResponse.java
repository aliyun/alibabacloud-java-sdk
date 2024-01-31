// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOnceTaskResultInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOnceTaskResultInfoResponseBody body;

    public static GetOnceTaskResultInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOnceTaskResultInfoResponse self = new GetOnceTaskResultInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetOnceTaskResultInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOnceTaskResultInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOnceTaskResultInfoResponse setBody(GetOnceTaskResultInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOnceTaskResultInfoResponseBody getBody() {
        return this.body;
    }

}
