// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByMsgIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMessageGetByMsgIdResponseBody body;

    public static OnsMessageGetByMsgIdResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByMsgIdResponse self = new OnsMessageGetByMsgIdResponse();
        return TeaModel.build(map, self);
    }

    public OnsMessageGetByMsgIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMessageGetByMsgIdResponse setBody(OnsMessageGetByMsgIdResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMessageGetByMsgIdResponseBody getBody() {
        return this.body;
    }

}
