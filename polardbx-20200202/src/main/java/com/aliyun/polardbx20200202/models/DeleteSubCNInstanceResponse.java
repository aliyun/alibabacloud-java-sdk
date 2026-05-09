// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteSubCNInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSubCNInstanceResponseBody body;

    public static DeleteSubCNInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubCNInstanceResponse self = new DeleteSubCNInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubCNInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubCNInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubCNInstanceResponse setBody(DeleteSubCNInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubCNInstanceResponseBody getBody() {
        return this.body;
    }

}
