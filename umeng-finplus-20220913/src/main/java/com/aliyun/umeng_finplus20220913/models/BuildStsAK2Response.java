// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class BuildStsAK2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BuildStsAK2ResponseBody body;

    public static BuildStsAK2Response build(java.util.Map<String, ?> map) throws Exception {
        BuildStsAK2Response self = new BuildStsAK2Response();
        return TeaModel.build(map, self);
    }

    public BuildStsAK2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BuildStsAK2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BuildStsAK2Response setBody(BuildStsAK2ResponseBody body) {
        this.body = body;
        return this;
    }
    public BuildStsAK2ResponseBody getBody() {
        return this.body;
    }

}
