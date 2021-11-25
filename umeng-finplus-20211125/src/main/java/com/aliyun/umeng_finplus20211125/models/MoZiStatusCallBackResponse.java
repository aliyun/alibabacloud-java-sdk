// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211125.models;

import com.aliyun.tea.*;

public class MoZiStatusCallBackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public String body;

    public static MoZiStatusCallBackResponse build(java.util.Map<String, ?> map) throws Exception {
        MoZiStatusCallBackResponse self = new MoZiStatusCallBackResponse();
        return TeaModel.build(map, self);
    }

    public MoZiStatusCallBackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoZiStatusCallBackResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
