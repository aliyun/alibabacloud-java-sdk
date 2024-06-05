// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListReceivedFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListReceivedFileResponseBody body;

    public static ListReceivedFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReceivedFileResponse self = new ListReceivedFileResponse();
        return TeaModel.build(map, self);
    }

    public ListReceivedFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReceivedFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReceivedFileResponse setBody(ListReceivedFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReceivedFileResponseBody getBody() {
        return this.body;
    }

}
