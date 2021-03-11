// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DeleteVsStreamsNotifyUrlConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteVsStreamsNotifyUrlConfigResponse setBody(DeleteVsStreamsNotifyUrlConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVsStreamsNotifyUrlConfigResponseBody getBody() {
        return this.body;
    }

}
