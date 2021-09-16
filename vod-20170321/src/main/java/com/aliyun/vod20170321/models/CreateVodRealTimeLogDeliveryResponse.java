// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateVodRealTimeLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateVodRealTimeLogDeliveryResponse setBody(CreateVodRealTimeLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVodRealTimeLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
