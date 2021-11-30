// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class GetAvailableDataSetListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAvailableDataSetListResponseBody body;

    public static GetAvailableDataSetListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAvailableDataSetListResponse self = new GetAvailableDataSetListResponse();
        return TeaModel.build(map, self);
    }

    public GetAvailableDataSetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAvailableDataSetListResponse setBody(GetAvailableDataSetListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAvailableDataSetListResponseBody getBody() {
        return this.body;
    }

}
