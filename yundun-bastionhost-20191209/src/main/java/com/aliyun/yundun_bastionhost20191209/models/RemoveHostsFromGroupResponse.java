// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveHostsFromGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveHostsFromGroupResponseBody body;

    public static RemoveHostsFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveHostsFromGroupResponse self = new RemoveHostsFromGroupResponse();
        return TeaModel.build(map, self);
    }

    public RemoveHostsFromGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveHostsFromGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveHostsFromGroupResponse setBody(RemoveHostsFromGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveHostsFromGroupResponseBody getBody() {
        return this.body;
    }

}
