// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateStackGroupResponseBody body;

    public static UpdateStackGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackGroupResponse self = new UpdateStackGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStackGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStackGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateStackGroupResponse setBody(UpdateStackGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStackGroupResponseBody getBody() {
        return this.body;
    }

}
