// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRecordUsageByTaskProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterRecordUsageByTaskProfileResponseBody body;

    public static DescribeMeterRecordUsageByTaskProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRecordUsageByTaskProfileResponse self = new DescribeMeterRecordUsageByTaskProfileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRecordUsageByTaskProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterRecordUsageByTaskProfileResponse setBody(DescribeMeterRecordUsageByTaskProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterRecordUsageByTaskProfileResponseBody getBody() {
        return this.body;
    }

}
