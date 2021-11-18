// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcUserCntDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMeterRtcUserCntDataResponse setBody(DescribeMeterRtcUserCntDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRtcUserCntDataResponseBody getBody() {
        return this.body;
    }

}
