// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetValidDeductInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetValidDeductInstancesResponseBody body;

    public static GetValidDeductInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetValidDeductInstancesResponse self = new GetValidDeductInstancesResponse();
        return TeaModel.build(map, self);
    }

    public GetValidDeductInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetValidDeductInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetValidDeductInstancesResponse setBody(GetValidDeductInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetValidDeductInstancesResponseBody getBody() {
        return this.body;
    }

}
