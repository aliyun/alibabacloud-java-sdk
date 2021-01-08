// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetIssueByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetIssueByIdResponseBody body;

    public static GetIssueByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIssueByIdResponse self = new GetIssueByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetIssueByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIssueByIdResponse setBody(GetIssueByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIssueByIdResponseBody getBody() {
        return this.body;
    }

}
