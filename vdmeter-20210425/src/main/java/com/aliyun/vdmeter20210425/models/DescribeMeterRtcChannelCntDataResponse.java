// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcChannelCntDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterRtcChannelCntDataResponseBody body;

    public static DescribeMeterRtcChannelCntDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcChannelCntDataResponse self = new DescribeMeterRtcChannelCntDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcChannelCntDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcChannelCntDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterRtcChannelCntDataResponse setBody(DescribeMeterRtcChannelCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcChannelCntDataResponseBody getBody() {
        return this.body;
    }

}
