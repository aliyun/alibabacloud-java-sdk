// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BlockVodObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BlockVodObjectCachesResponseBody body;

    public static BlockVodObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        BlockVodObjectCachesResponse self = new BlockVodObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public BlockVodObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BlockVodObjectCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BlockVodObjectCachesResponse setBody(BlockVodObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public BlockVodObjectCachesResponseBody getBody() {
        return this.body;
    }

}
