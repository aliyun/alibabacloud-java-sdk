// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListOutputFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOutputFilesResponseBody body;

    public static ListOutputFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOutputFilesResponse self = new ListOutputFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListOutputFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOutputFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOutputFilesResponse setBody(ListOutputFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOutputFilesResponseBody getBody() {
        return this.body;
    }

}
