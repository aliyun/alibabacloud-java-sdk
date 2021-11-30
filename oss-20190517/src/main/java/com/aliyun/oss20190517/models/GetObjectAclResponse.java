// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectAclResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetObjectAclResponseBody body;

    public static GetObjectAclResponse build(java.util.Map<String, ?> map) throws Exception {
        GetObjectAclResponse self = new GetObjectAclResponse();
        return TeaModel.build(map, self);
    }

    public GetObjectAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetObjectAclResponse setBody(GetObjectAclResponseBody body) {
        this.body = body;
        return this;
    }
    public GetObjectAclResponseBody getBody() {
        return this.body;
    }

}
