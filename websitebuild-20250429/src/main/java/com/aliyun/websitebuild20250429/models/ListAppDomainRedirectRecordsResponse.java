// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppDomainRedirectRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppDomainRedirectRecordsResponseBody body;

    public static ListAppDomainRedirectRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppDomainRedirectRecordsResponse self = new ListAppDomainRedirectRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppDomainRedirectRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppDomainRedirectRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppDomainRedirectRecordsResponse setBody(ListAppDomainRedirectRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppDomainRedirectRecordsResponseBody getBody() {
        return this.body;
    }

}
