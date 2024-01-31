// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirusScanTaskResponseBody body;

    public static ListVirusScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTaskResponse self = new ListVirusScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirusScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirusScanTaskResponse setBody(ListVirusScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirusScanTaskResponseBody getBody() {
        return this.body;
    }

}
