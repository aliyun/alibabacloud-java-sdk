// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInstanceAuthRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceAuthRangeResponseBody body;

    public static GetInstanceAuthRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAuthRangeResponse self = new GetInstanceAuthRangeResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceAuthRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceAuthRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceAuthRangeResponse setBody(GetInstanceAuthRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceAuthRangeResponseBody getBody() {
        return this.body;
    }

}
