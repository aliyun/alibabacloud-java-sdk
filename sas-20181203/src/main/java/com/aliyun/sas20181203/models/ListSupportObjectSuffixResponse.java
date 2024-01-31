// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSupportObjectSuffixResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSupportObjectSuffixResponseBody body;

    public static ListSupportObjectSuffixResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSupportObjectSuffixResponse self = new ListSupportObjectSuffixResponse();
        return TeaModel.build(map, self);
    }

    public ListSupportObjectSuffixResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSupportObjectSuffixResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSupportObjectSuffixResponse setBody(ListSupportObjectSuffixResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSupportObjectSuffixResponseBody getBody() {
        return this.body;
    }

}
