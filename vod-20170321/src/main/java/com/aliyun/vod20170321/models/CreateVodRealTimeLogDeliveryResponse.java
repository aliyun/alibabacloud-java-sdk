// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateVodRealTimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVodRealTimeLogDeliveryResponseBody body;

    public static CreateVodRealTimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVodRealTimeLogDeliveryResponse self = new CreateVodRealTimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public CreateVodRealTimeLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVodRealTimeLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVodRealTimeLogDeliveryResponse setBody(CreateVodRealTimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVodRealTimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
