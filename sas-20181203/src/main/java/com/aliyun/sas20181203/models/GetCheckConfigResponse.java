// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckConfigResponseBody body;

    public static GetCheckConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConfigResponse self = new GetCheckConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckConfigResponse setBody(GetCheckConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckConfigResponseBody getBody() {
        return this.body;
    }

}
