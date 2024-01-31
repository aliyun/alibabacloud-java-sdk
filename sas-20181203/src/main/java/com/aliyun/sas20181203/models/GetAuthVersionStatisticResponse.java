// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAuthVersionStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthVersionStatisticResponseBody body;

    public static GetAuthVersionStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthVersionStatisticResponse self = new GetAuthVersionStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthVersionStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthVersionStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthVersionStatisticResponse setBody(GetAuthVersionStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthVersionStatisticResponseBody getBody() {
        return this.body;
    }

}
