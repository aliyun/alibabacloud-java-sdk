// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddDatabasesToGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDatabasesToGroupResponseBody body;

    public static AddDatabasesToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDatabasesToGroupResponse self = new AddDatabasesToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddDatabasesToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDatabasesToGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDatabasesToGroupResponse setBody(AddDatabasesToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDatabasesToGroupResponseBody getBody() {
        return this.body;
    }

}
