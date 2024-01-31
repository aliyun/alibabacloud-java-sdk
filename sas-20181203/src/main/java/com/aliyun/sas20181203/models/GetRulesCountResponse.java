// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetRulesCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRulesCountResponseBody body;

    public static GetRulesCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRulesCountResponse self = new GetRulesCountResponse();
        return TeaModel.build(map, self);
    }

    public GetRulesCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRulesCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRulesCountResponse setBody(GetRulesCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRulesCountResponseBody getBody() {
        return this.body;
    }

}
