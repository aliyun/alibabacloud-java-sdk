// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetAclAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAclAttributeResponseBody body;

    public static GetAclAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAclAttributeResponse self = new GetAclAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetAclAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAclAttributeResponse setBody(GetAclAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAclAttributeResponseBody getBody() {
        return this.body;
    }

}
