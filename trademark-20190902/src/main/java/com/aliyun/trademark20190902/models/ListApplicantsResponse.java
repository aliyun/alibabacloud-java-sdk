// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListApplicantsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicantsResponseBody body;

    public static ListApplicantsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicantsResponse self = new ListApplicantsResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicantsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicantsResponse setBody(ListApplicantsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicantsResponseBody getBody() {
        return this.body;
    }

}
