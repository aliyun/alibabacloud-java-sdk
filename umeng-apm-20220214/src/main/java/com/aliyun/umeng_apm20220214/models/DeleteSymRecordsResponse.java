// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class DeleteSymRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSymRecordsResponseBody body;

    public static DeleteSymRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSymRecordsResponse self = new DeleteSymRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSymRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSymRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSymRecordsResponse setBody(DeleteSymRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSymRecordsResponseBody getBody() {
        return this.body;
    }

}
