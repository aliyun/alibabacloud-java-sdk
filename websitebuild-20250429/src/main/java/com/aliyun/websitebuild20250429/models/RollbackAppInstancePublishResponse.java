// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RollbackAppInstancePublishResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackAppInstancePublishResponseBody body;

    public static RollbackAppInstancePublishResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackAppInstancePublishResponse self = new RollbackAppInstancePublishResponse();
        return TeaModel.build(map, self);
    }

    public RollbackAppInstancePublishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackAppInstancePublishResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackAppInstancePublishResponse setBody(RollbackAppInstancePublishResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackAppInstancePublishResponseBody getBody() {
        return this.body;
    }

}
