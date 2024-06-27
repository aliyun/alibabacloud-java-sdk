// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleSceneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSampleSceneListResponseBody body;

    public static DescribeSampleSceneListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleSceneListResponse self = new DescribeSampleSceneListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSampleSceneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSampleSceneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSampleSceneListResponse setBody(DescribeSampleSceneListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSampleSceneListResponseBody getBody() {
        return this.body;
    }

}
