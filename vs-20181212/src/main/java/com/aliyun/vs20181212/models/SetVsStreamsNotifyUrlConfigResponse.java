// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetVsStreamsNotifyUrlConfigResponseBody body;

    public static SetVsStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetVsStreamsNotifyUrlConfigResponse self = new SetVsStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetVsStreamsNotifyUrlConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetVsStreamsNotifyUrlConfigResponse setBody(SetVsStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetVsStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
