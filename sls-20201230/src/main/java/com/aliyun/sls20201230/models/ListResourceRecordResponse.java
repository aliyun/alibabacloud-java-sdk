// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListResourceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListResourceRecordResponseBody body;

    public static ListResourceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceRecordResponse self = new ListResourceRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListResourceRecordResponse setBody(ListResourceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceRecordResponseBody getBody() {
        return this.body;
    }

}
