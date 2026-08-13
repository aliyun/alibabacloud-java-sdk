// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetUserCreditUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserCreditUsageResponseBody body;

    public static GetUserCreditUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserCreditUsageResponse self = new GetUserCreditUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetUserCreditUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserCreditUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserCreditUsageResponse setBody(GetUserCreditUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserCreditUsageResponseBody getBody() {
        return this.body;
    }

}
