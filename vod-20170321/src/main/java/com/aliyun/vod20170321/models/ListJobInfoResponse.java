// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListJobInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJobInfoResponseBody body;

    public static ListJobInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJobInfoResponse self = new ListJobInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListJobInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJobInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJobInfoResponse setBody(ListJobInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJobInfoResponseBody getBody() {
        return this.body;
    }

}
