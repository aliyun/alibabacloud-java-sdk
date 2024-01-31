// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCustomBlockRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomBlockRecordResponseBody body;

    public static DeleteCustomBlockRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomBlockRecordResponse self = new DeleteCustomBlockRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomBlockRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomBlockRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomBlockRecordResponse setBody(DeleteCustomBlockRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomBlockRecordResponseBody getBody() {
        return this.body;
    }

}
