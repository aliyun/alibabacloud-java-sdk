// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodSpecificConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVodSpecificConfigResponseBody body;

    public static DeleteVodSpecificConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodSpecificConfigResponse self = new DeleteVodSpecificConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVodSpecificConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVodSpecificConfigResponse setBody(DeleteVodSpecificConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodSpecificConfigResponseBody getBody() {
        return this.body;
    }

}
