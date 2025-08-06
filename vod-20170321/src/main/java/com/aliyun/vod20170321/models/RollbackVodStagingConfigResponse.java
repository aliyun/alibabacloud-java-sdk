// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RollbackVodStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackVodStagingConfigResponseBody body;

    public static RollbackVodStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackVodStagingConfigResponse self = new RollbackVodStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public RollbackVodStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackVodStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackVodStagingConfigResponse setBody(RollbackVodStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackVodStagingConfigResponseBody getBody() {
        return this.body;
    }

}
