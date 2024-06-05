// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Group body;

    public static CreateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponse self = new CreateGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGroupResponse setBody(Group body) {
        this.body = body;
        return this;
    }
    public Group getBody() {
        return this.body;
    }

}
