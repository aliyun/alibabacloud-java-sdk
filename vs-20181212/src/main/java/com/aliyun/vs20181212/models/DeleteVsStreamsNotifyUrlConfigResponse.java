// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteVsStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVsStreamsNotifyUrlConfigResponseBody body;

    public static DeleteVsStreamsNotifyUrlConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVsStreamsNotifyUrlConfigResponse self = new DeleteVsStreamsNotifyUrlConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVsStreamsNotifyUrlConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVsStreamsNotifyUrlConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVsStreamsNotifyUrlConfigResponse setBody(DeleteVsStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVsStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
