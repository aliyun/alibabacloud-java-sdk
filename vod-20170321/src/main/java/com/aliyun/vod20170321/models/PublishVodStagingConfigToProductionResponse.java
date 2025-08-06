// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PublishVodStagingConfigToProductionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishVodStagingConfigToProductionResponseBody body;

    public static PublishVodStagingConfigToProductionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishVodStagingConfigToProductionResponse self = new PublishVodStagingConfigToProductionResponse();
        return TeaModel.build(map, self);
    }

    public PublishVodStagingConfigToProductionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishVodStagingConfigToProductionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishVodStagingConfigToProductionResponse setBody(PublishVodStagingConfigToProductionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishVodStagingConfigToProductionResponseBody getBody() {
        return this.body;
    }

}
