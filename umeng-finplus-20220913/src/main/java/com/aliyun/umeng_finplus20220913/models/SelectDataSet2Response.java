// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SelectDataSet2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SelectDataSet2ResponseBody body;

    public static SelectDataSet2Response build(java.util.Map<String, ?> map) throws Exception {
        SelectDataSet2Response self = new SelectDataSet2Response();
        return TeaModel.build(map, self);
    }

    public SelectDataSet2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SelectDataSet2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SelectDataSet2Response setBody(SelectDataSet2ResponseBody body) {
        this.body = body;
        return this;
    }
    public SelectDataSet2ResponseBody getBody() {
        return this.body;
    }

}
