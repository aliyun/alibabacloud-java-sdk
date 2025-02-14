// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarPlaybookTaskDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSoarPlaybookTaskDetailResponseBody body;

    public static DescribeSoarPlaybookTaskDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarPlaybookTaskDetailResponse self = new DescribeSoarPlaybookTaskDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarPlaybookTaskDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarPlaybookTaskDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarPlaybookTaskDetailResponse setBody(DescribeSoarPlaybookTaskDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarPlaybookTaskDetailResponseBody getBody() {
        return this.body;
    }

}
