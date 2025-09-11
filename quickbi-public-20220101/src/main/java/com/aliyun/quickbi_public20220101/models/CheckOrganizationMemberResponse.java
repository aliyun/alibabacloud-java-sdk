// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CheckOrganizationMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckOrganizationMemberResponseBody body;

    public static CheckOrganizationMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOrganizationMemberResponse self = new CheckOrganizationMemberResponse();
        return TeaModel.build(map, self);
    }

    public CheckOrganizationMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckOrganizationMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckOrganizationMemberResponse setBody(CheckOrganizationMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckOrganizationMemberResponseBody getBody() {
        return this.body;
    }

}
