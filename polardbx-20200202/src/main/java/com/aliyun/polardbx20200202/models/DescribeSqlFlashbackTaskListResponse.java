// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSqlFlashbackTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSqlFlashbackTaskListResponseBody body;

    public static DescribeSqlFlashbackTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlFlashbackTaskListResponse self = new DescribeSqlFlashbackTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSqlFlashbackTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSqlFlashbackTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSqlFlashbackTaskListResponse setBody(DescribeSqlFlashbackTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSqlFlashbackTaskListResponseBody getBody() {
        return this.body;
    }

}
