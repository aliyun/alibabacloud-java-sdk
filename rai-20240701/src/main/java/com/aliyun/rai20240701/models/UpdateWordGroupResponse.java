// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdateWordGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWordGroupResponseBody body;

    public static UpdateWordGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWordGroupResponse self = new UpdateWordGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWordGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWordGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWordGroupResponse setBody(UpdateWordGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWordGroupResponseBody getBody() {
        return this.body;
    }

}
