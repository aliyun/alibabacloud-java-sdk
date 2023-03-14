// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddHostsToGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddHostsToGroupResponseBody body;

    public static AddHostsToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddHostsToGroupResponse self = new AddHostsToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddHostsToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddHostsToGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddHostsToGroupResponse setBody(AddHostsToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddHostsToGroupResponseBody getBody() {
        return this.body;
    }

}
