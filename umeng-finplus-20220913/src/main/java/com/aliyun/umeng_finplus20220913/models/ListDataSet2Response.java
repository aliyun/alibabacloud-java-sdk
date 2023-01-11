// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class ListDataSet2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDataSet2ResponseBody body;

    public static ListDataSet2Response build(java.util.Map<String, ?> map) throws Exception {
        ListDataSet2Response self = new ListDataSet2Response();
        return TeaModel.build(map, self);
    }

    public ListDataSet2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSet2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSet2Response setBody(ListDataSet2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSet2ResponseBody getBody() {
        return this.body;
    }

}
