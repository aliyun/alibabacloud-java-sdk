// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class AddProjectMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddProjectMembersResponseBody body;

    public static AddProjectMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMembersResponse self = new AddProjectMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddProjectMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProjectMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddProjectMembersResponse setBody(AddProjectMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProjectMembersResponseBody getBody() {
        return this.body;
    }

}
