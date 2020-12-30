// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetLogsListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogsListResponseBody body;

    public static GetLogsListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogsListResponse self = new GetLogsListResponse();
        return TeaModel.build(map, self);
    }

    public GetLogsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogsListResponse setBody(GetLogsListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogsListResponseBody getBody() {
        return this.body;
    }

}
