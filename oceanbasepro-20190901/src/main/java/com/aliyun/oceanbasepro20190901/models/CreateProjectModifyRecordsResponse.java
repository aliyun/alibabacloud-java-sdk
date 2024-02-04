// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateProjectModifyRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProjectModifyRecordsResponseBody body;

    public static CreateProjectModifyRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectModifyRecordsResponse self = new CreateProjectModifyRecordsResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectModifyRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectModifyRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProjectModifyRecordsResponse setBody(CreateProjectModifyRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectModifyRecordsResponseBody getBody() {
        return this.body;
    }

}
