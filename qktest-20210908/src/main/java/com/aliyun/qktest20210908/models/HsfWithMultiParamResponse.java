// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qktest20210908.models;

import com.aliyun.tea.*;

public class HsfWithMultiParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public String body;

    public static HsfWithMultiParamResponse build(java.util.Map<String, ?> map) throws Exception {
        HsfWithMultiParamResponse self = new HsfWithMultiParamResponse();
        return TeaModel.build(map, self);
    }

    public HsfWithMultiParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HsfWithMultiParamResponse setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
