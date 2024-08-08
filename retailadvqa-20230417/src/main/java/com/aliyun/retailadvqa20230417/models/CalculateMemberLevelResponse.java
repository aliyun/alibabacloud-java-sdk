// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class CalculateMemberLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CalculateMemberLevelResponseBody body;

    public static CalculateMemberLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        CalculateMemberLevelResponse self = new CalculateMemberLevelResponse();
        return TeaModel.build(map, self);
    }

    public CalculateMemberLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalculateMemberLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CalculateMemberLevelResponse setBody(CalculateMemberLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public CalculateMemberLevelResponseBody getBody() {
        return this.body;
    }

}
