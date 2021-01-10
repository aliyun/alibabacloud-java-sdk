// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskIssueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskIssueResponseBody body;

    public static GetClriskIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskIssueResponse self = new GetClriskIssueResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskIssueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskIssueResponse setBody(GetClriskIssueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskIssueResponseBody getBody() {
        return this.body;
    }

}
