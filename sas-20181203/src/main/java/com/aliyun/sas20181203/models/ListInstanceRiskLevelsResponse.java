// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceRiskLevelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceRiskLevelsResponseBody body;

    public static ListInstanceRiskLevelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRiskLevelsResponse self = new ListInstanceRiskLevelsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceRiskLevelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceRiskLevelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceRiskLevelsResponse setBody(ListInstanceRiskLevelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceRiskLevelsResponseBody getBody() {
        return this.body;
    }

}
