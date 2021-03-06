// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOuterCallCenterDataListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOuterCallCenterDataListResponseBody body;

    public static GetOuterCallCenterDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOuterCallCenterDataListResponse self = new GetOuterCallCenterDataListResponse();
        return TeaModel.build(map, self);
    }

    public GetOuterCallCenterDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOuterCallCenterDataListResponse setBody(GetOuterCallCenterDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOuterCallCenterDataListResponseBody getBody() {
        return this.body;
    }

}
