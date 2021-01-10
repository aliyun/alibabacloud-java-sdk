// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionsDailyConsumedRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSPartitionsDailyConsumedRecordResponseBody body;

    public static GetDWSPartitionsDailyConsumedRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionsDailyConsumedRecordResponse self = new GetDWSPartitionsDailyConsumedRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionsDailyConsumedRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSPartitionsDailyConsumedRecordResponse setBody(GetDWSPartitionsDailyConsumedRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSPartitionsDailyConsumedRecordResponseBody getBody() {
        return this.body;
    }

}
