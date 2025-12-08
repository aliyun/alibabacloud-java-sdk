// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DeleteVirtualClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVirtualClusterResponseBody body;

    public static DeleteVirtualClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualClusterResponse self = new DeleteVirtualClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVirtualClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVirtualClusterResponse setBody(DeleteVirtualClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVirtualClusterResponseBody getBody() {
        return this.body;
    }

}
