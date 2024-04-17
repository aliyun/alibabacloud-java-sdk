// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCompressFileDetectResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCompressFileDetectResultResponseBody body;

    public static ListCompressFileDetectResultResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCompressFileDetectResultResponse self = new ListCompressFileDetectResultResponse();
        return TeaModel.build(map, self);
    }

    public ListCompressFileDetectResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCompressFileDetectResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCompressFileDetectResultResponse setBody(ListCompressFileDetectResultResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCompressFileDetectResultResponseBody getBody() {
        return this.body;
    }

}
