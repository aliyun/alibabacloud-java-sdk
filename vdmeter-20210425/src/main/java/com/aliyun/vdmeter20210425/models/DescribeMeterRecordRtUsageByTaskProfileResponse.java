// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRecordRtUsageByTaskProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeMeterRecordRtUsageByTaskProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterRecordRtUsageByTaskProfileResponse setBody(DescribeMeterRecordRtUsageByTaskProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRecordRtUsageByTaskProfileResponseBody getBody() {
        return this.body;
    }

}
