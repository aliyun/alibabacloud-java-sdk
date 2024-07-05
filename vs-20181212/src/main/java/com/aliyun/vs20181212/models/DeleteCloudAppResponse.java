// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteCloudAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudAppResponseBody body;

    public static DeleteCloudAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudAppResponse self = new DeleteCloudAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudAppResponse setBody(DeleteCloudAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudAppResponseBody getBody() {
        return this.body;
    }

}
