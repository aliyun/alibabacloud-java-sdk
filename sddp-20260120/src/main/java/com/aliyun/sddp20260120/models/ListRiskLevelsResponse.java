// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListRiskLevelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRiskLevelsResponseBody body;

    public static ListRiskLevelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRiskLevelsResponse self = new ListRiskLevelsResponse();
        return TeaModel.build(map, self);
    }

    public ListRiskLevelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRiskLevelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRiskLevelsResponse setBody(ListRiskLevelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRiskLevelsResponseBody getBody() {
        return this.body;
    }

}
