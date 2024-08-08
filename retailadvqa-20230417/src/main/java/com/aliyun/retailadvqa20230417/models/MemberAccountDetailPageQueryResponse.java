// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class MemberAccountDetailPageQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MemberAccountDetailPageQueryResponseBody body;

    public static MemberAccountDetailPageQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        MemberAccountDetailPageQueryResponse self = new MemberAccountDetailPageQueryResponse();
        return TeaModel.build(map, self);
    }

    public MemberAccountDetailPageQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MemberAccountDetailPageQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MemberAccountDetailPageQueryResponse setBody(MemberAccountDetailPageQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public MemberAccountDetailPageQueryResponseBody getBody() {
        return this.body;
    }

}
