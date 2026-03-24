// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAttackEventDashboardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttackEventDashboardResponseBody body;

    public static GetAttackEventDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttackEventDashboardResponse self = new GetAttackEventDashboardResponse();
        return TeaModel.build(map, self);
    }

    public GetAttackEventDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttackEventDashboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttackEventDashboardResponse setBody(GetAttackEventDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttackEventDashboardResponseBody getBody() {
        return this.body;
    }

}
