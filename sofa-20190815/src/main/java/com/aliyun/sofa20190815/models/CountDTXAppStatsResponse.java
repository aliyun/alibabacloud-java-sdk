// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountDTXAppStatsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CountDTXAppStatsResponseBody body;

    public static CountDTXAppStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        CountDTXAppStatsResponse self = new CountDTXAppStatsResponse();
        return TeaModel.build(map, self);
    }

    public CountDTXAppStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountDTXAppStatsResponse setBody(CountDTXAppStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public CountDTXAppStatsResponseBody getBody() {
        return this.body;
    }

}
