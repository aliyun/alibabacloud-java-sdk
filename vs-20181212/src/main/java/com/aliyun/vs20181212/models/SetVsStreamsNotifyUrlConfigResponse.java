// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SetVsStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SetVsStreamsNotifyUrlConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetVsStreamsNotifyUrlConfigResponse setBody(SetVsStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetVsStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
