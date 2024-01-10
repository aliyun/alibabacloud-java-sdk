// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectModifyRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectModifyRecordsResponseBody body;

    public static ListProjectModifyRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectModifyRecordsResponse self = new ListProjectModifyRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectModifyRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectModifyRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProjectModifyRecordsResponse setBody(ListProjectModifyRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectModifyRecordsResponseBody getBody() {
        return this.body;
    }

}
