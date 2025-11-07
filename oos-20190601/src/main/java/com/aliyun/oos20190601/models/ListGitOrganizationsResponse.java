// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGitOrganizationsResponseBody body;

    public static ListGitOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGitOrganizationsResponse self = new ListGitOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public ListGitOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGitOrganizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGitOrganizationsResponse setBody(ListGitOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGitOrganizationsResponseBody getBody() {
        return this.body;
    }

}
