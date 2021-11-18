// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcChannelCntDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMeterRtcChannelCntDataResponse setBody(DescribeMeterRtcChannelCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcChannelCntDataResponseBody getBody() {
        return this.body;
    }

}
