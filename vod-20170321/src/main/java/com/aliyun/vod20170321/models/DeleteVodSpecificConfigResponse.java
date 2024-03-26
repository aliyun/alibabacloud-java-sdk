// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodSpecificConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteVodSpecificConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVodSpecificConfigResponse setBody(DeleteVodSpecificConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodSpecificConfigResponseBody getBody() {
        return this.body;
    }

}
