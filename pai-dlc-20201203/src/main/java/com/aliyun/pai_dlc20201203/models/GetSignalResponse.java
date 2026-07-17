// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetSignalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSignalResponseBody body;

    public static GetSignalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSignalResponse self = new GetSignalResponse();
        return TeaModel.build(map, self);
    }

    public GetSignalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSignalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSignalResponse setBody(GetSignalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSignalResponseBody getBody() {
        return this.body;
    }

}
