// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteVCUInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVCUInstanceResponseBody body;

    public static DeleteVCUInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVCUInstanceResponse self = new DeleteVCUInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVCUInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVCUInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVCUInstanceResponse setBody(DeleteVCUInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVCUInstanceResponseBody getBody() {
        return this.body;
    }

}
