// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountDeliveryChannelStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMultiAccountDeliveryChannelStatisticsResponseBody body;

    public static GetMultiAccountDeliveryChannelStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountDeliveryChannelStatisticsResponse self = new GetMultiAccountDeliveryChannelStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountDeliveryChannelStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMultiAccountDeliveryChannelStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMultiAccountDeliveryChannelStatisticsResponse setBody(GetMultiAccountDeliveryChannelStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMultiAccountDeliveryChannelStatisticsResponseBody getBody() {
        return this.body;
    }

}
