// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody body;

    public static DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse self = new DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponse setBody(DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody getBody() {
        return this.body;
    }

}
