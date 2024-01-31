// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckStandardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckStandardResponseBody body;

    public static ListCheckStandardResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckStandardResponse self = new ListCheckStandardResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckStandardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckStandardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckStandardResponse setBody(ListCheckStandardResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckStandardResponseBody getBody() {
        return this.body;
    }

}
