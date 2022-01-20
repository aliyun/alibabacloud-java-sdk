// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstanceStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceStatisticsResponseBody body;

    public static ListInstanceStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStatisticsResponse self = new ListInstanceStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceStatisticsResponse setBody(ListInstanceStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceStatisticsResponseBody getBody() {
        return this.body;
    }

}
