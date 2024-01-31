// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQuotaApplicationResponseBody body;

    public static GetQuotaApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaApplicationResponse self = new GetQuotaApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaApplicationResponse setBody(GetQuotaApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaApplicationResponseBody getBody() {
        return this.body;
    }

}
