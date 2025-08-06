// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteVodRealTimeLogLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVodRealTimeLogLogstoreResponseBody body;

    public static DeleteVodRealTimeLogLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodRealTimeLogLogstoreResponse self = new DeleteVodRealTimeLogLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVodRealTimeLogLogstoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVodRealTimeLogLogstoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVodRealTimeLogLogstoreResponse setBody(DeleteVodRealTimeLogLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodRealTimeLogLogstoreResponseBody getBody() {
        return this.body;
    }

}
