// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRecordRtUsageByTaskProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterRecordRtUsageByTaskProfileResponseBody body;

    public static DescribeMeterRecordRtUsageByTaskProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRecordRtUsageByTaskProfileResponse self = new DescribeMeterRecordRtUsageByTaskProfileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRecordRtUsageByTaskProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRecordRtUsageByTaskProfileResponse setBody(DescribeMeterRecordRtUsageByTaskProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRecordRtUsageByTaskProfileResponseBody getBody() {
        return this.body;
    }

}
