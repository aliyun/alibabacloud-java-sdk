// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcUserCntDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMeterRtcUserCntDataResponseBody body;

    public static DescribeMeterRtcUserCntDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcUserCntDataResponse self = new DescribeMeterRtcUserCntDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcUserCntDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRtcUserCntDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterRtcUserCntDataResponse setBody(DescribeMeterRtcUserCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcUserCntDataResponseBody getBody() {
        return this.body;
    }

}
