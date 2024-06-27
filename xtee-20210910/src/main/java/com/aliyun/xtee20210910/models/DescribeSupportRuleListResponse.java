// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSupportRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupportRuleListResponseBody body;

    public static DescribeSupportRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportRuleListResponse self = new DescribeSupportRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupportRuleListResponse setBody(DescribeSupportRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportRuleListResponseBody getBody() {
        return this.body;
    }

}
