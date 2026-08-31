// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListNextResourceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNextResourceRecordResponseBody body;

    public static ListNextResourceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNextResourceRecordResponse self = new ListNextResourceRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListNextResourceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNextResourceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNextResourceRecordResponse setBody(ListNextResourceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNextResourceRecordResponseBody getBody() {
        return this.body;
    }

}
