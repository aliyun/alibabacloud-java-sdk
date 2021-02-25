// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class JoinThirdCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public JoinThirdCallResponseBody body;

    public static JoinThirdCallResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinThirdCallResponse self = new JoinThirdCallResponse();
        return TeaModel.build(map, self);
    }

    public JoinThirdCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinThirdCallResponse setBody(JoinThirdCallResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinThirdCallResponseBody getBody() {
        return this.body;
    }

}
