// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListObjectScanEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListObjectScanEventResponseBody body;

    public static ListObjectScanEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListObjectScanEventResponse self = new ListObjectScanEventResponse();
        return TeaModel.build(map, self);
    }

    public ListObjectScanEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListObjectScanEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListObjectScanEventResponse setBody(ListObjectScanEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListObjectScanEventResponseBody getBody() {
        return this.body;
    }

}
