// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLExplorerPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLExplorerPolicyResponseBody body;

    public static DescribeSQLExplorerPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLExplorerPolicyResponse self = new DescribeSQLExplorerPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLExplorerPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLExplorerPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLExplorerPolicyResponse setBody(DescribeSQLExplorerPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLExplorerPolicyResponseBody getBody() {
        return this.body;
    }

}
