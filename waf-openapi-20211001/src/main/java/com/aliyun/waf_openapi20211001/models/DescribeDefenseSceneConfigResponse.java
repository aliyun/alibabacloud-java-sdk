// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseSceneConfigResponseBody body;

    public static DescribeDefenseSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseSceneConfigResponse self = new DescribeDefenseSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseSceneConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseSceneConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseSceneConfigResponse setBody(DescribeDefenseSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseSceneConfigResponseBody getBody() {
        return this.body;
    }

}
