// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class RemoveDataSet2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveDataSet2ResponseBody body;

    public static RemoveDataSet2Response build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataSet2Response self = new RemoveDataSet2Response();
        return TeaModel.build(map, self);
    }

    public RemoveDataSet2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveDataSet2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveDataSet2Response setBody(RemoveDataSet2ResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveDataSet2ResponseBody getBody() {
        return this.body;
    }

}
