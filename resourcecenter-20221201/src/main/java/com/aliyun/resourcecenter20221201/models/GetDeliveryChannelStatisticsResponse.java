// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetDeliveryChannelStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeliveryChannelStatisticsResponseBody body;

    public static GetDeliveryChannelStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryChannelStatisticsResponse self = new GetDeliveryChannelStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetDeliveryChannelStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeliveryChannelStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeliveryChannelStatisticsResponse setBody(GetDeliveryChannelStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeliveryChannelStatisticsResponseBody getBody() {
        return this.body;
    }

}
