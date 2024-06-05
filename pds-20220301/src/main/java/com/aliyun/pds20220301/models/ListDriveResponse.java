// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDriveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDriveResponseBody body;

    public static ListDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDriveResponse self = new ListDriveResponse();
        return TeaModel.build(map, self);
    }

    public ListDriveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDriveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDriveResponse setBody(ListDriveResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDriveResponseBody getBody() {
        return this.body;
    }

}
