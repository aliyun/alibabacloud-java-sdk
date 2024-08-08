// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class AddMemberBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMemberBasicInfoResponseBody body;

    public static AddMemberBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMemberBasicInfoResponse self = new AddMemberBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public AddMemberBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMemberBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMemberBasicInfoResponse setBody(AddMemberBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMemberBasicInfoResponseBody getBody() {
        return this.body;
    }

}
