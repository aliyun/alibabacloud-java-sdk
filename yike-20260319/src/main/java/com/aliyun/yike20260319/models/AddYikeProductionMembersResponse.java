// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class AddYikeProductionMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddYikeProductionMembersResponseBody body;

    public static AddYikeProductionMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddYikeProductionMembersResponse self = new AddYikeProductionMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddYikeProductionMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddYikeProductionMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddYikeProductionMembersResponse setBody(AddYikeProductionMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddYikeProductionMembersResponseBody getBody() {
        return this.body;
    }

}
