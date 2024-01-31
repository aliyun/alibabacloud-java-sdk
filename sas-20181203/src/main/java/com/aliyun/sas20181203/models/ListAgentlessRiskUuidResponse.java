// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRiskUuidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgentlessRiskUuidResponseBody body;

    public static ListAgentlessRiskUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRiskUuidResponse self = new ListAgentlessRiskUuidResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRiskUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgentlessRiskUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgentlessRiskUuidResponse setBody(ListAgentlessRiskUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgentlessRiskUuidResponseBody getBody() {
        return this.body;
    }

}
