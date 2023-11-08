// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceRiskNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceRiskNumResponseBody body;

    public static ListInstanceRiskNumResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRiskNumResponse self = new ListInstanceRiskNumResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceRiskNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceRiskNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceRiskNumResponse setBody(ListInstanceRiskNumResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceRiskNumResponseBody getBody() {
        return this.body;
    }

}
