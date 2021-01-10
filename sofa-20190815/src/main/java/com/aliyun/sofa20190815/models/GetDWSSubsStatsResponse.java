// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSSubsStatsResponseBody body;

    public static GetDWSSubsStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsStatsResponse self = new GetDWSSubsStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSSubsStatsResponse setBody(GetDWSSubsStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSSubsStatsResponseBody getBody() {
        return this.body;
    }

}
