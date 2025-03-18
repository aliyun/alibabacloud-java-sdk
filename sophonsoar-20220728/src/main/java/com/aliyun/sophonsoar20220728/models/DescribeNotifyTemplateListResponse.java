// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeNotifyTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNotifyTemplateListResponseBody body;

    public static DescribeNotifyTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotifyTemplateListResponse self = new DescribeNotifyTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNotifyTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNotifyTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNotifyTemplateListResponse setBody(DescribeNotifyTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNotifyTemplateListResponseBody getBody() {
        return this.body;
    }

}
