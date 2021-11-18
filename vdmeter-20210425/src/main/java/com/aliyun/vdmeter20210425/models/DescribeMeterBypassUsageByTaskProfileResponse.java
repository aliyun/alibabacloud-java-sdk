// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterBypassUsageByTaskProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterBypassUsageByTaskProfileResponseBody body;

    public static DescribeMeterBypassUsageByTaskProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterBypassUsageByTaskProfileResponse self = new DescribeMeterBypassUsageByTaskProfileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterBypassUsageByTaskProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterBypassUsageByTaskProfileResponse setBody(DescribeMeterBypassUsageByTaskProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterBypassUsageByTaskProfileResponseBody getBody() {
        return this.body;
    }

}
