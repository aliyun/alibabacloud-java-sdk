// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateApplicationGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationGroupResponseBody body;

    public static UpdateApplicationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationGroupResponse self = new UpdateApplicationGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationGroupResponse setBody(UpdateApplicationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationGroupResponseBody getBody() {
        return this.body;
    }

}
