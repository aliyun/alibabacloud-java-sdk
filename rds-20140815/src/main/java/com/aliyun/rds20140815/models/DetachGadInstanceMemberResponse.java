// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachGadInstanceMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachGadInstanceMemberResponseBody body;

    public static DetachGadInstanceMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachGadInstanceMemberResponse self = new DetachGadInstanceMemberResponse();
        return TeaModel.build(map, self);
    }

    public DetachGadInstanceMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachGadInstanceMemberResponse setBody(DetachGadInstanceMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachGadInstanceMemberResponseBody getBody() {
        return this.body;
    }

}
