// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterBypassRtUsageByTaskProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterBypassRtUsageByTaskProfileResponseBody body;

    public static DescribeMeterBypassRtUsageByTaskProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterBypassRtUsageByTaskProfileResponse self = new DescribeMeterBypassRtUsageByTaskProfileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterBypassRtUsageByTaskProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterBypassRtUsageByTaskProfileResponse setBody(DescribeMeterBypassRtUsageByTaskProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterBypassRtUsageByTaskProfileResponseBody getBody() {
        return this.body;
    }

}
