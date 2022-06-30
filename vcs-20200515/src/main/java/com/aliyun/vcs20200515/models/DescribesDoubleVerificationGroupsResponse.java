// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribesDoubleVerificationGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribesDoubleVerificationGroupsResponseBody body;

    public static DescribesDoubleVerificationGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribesDoubleVerificationGroupsResponse self = new DescribesDoubleVerificationGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribesDoubleVerificationGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribesDoubleVerificationGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribesDoubleVerificationGroupsResponse setBody(DescribesDoubleVerificationGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribesDoubleVerificationGroupsResponseBody getBody() {
        return this.body;
    }

}
