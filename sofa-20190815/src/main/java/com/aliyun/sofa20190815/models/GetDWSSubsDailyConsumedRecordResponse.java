// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsDailyConsumedRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSSubsDailyConsumedRecordResponseBody body;

    public static GetDWSSubsDailyConsumedRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsDailyConsumedRecordResponse self = new GetDWSSubsDailyConsumedRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsDailyConsumedRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSSubsDailyConsumedRecordResponse setBody(GetDWSSubsDailyConsumedRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSSubsDailyConsumedRecordResponseBody getBody() {
        return this.body;
    }

}
