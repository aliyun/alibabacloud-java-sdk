// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDataSourceStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataSourceStatsResponseBody body;

    public static GetDataSourceStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceStatsResponse self = new GetDataSourceStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceStatsResponse setBody(GetDataSourceStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceStatsResponseBody getBody() {
        return this.body;
    }

}
