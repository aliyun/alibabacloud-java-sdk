// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListFilePushStatusesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFilePushStatusesResponseBody body;

    public static ListFilePushStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFilePushStatusesResponse self = new ListFilePushStatusesResponse();
        return TeaModel.build(map, self);
    }

    public ListFilePushStatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFilePushStatusesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFilePushStatusesResponse setBody(ListFilePushStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFilePushStatusesResponseBody getBody() {
        return this.body;
    }

}
