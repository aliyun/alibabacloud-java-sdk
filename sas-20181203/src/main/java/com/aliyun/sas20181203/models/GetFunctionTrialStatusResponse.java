// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFunctionTrialStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFunctionTrialStatusResponseBody body;

    public static GetFunctionTrialStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionTrialStatusResponse self = new GetFunctionTrialStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetFunctionTrialStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFunctionTrialStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFunctionTrialStatusResponse setBody(GetFunctionTrialStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFunctionTrialStatusResponseBody getBody() {
        return this.body;
    }

}
