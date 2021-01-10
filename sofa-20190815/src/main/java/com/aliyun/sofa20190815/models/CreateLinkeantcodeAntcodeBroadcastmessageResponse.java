// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeBroadcastmessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody body;

    public static CreateLinkeantcodeAntcodeBroadcastmessageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeBroadcastmessageResponse self = new CreateLinkeantcodeAntcodeBroadcastmessageResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeBroadcastmessageResponse setBody(CreateLinkeantcodeAntcodeBroadcastmessageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeBroadcastmessageResponseBody getBody() {
        return this.body;
    }

}
