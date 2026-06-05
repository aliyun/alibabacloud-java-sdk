// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OperateAppTemplateLikeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateAppTemplateLikeResponseBody body;

    public static OperateAppTemplateLikeResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAppTemplateLikeResponse self = new OperateAppTemplateLikeResponse();
        return TeaModel.build(map, self);
    }

    public OperateAppTemplateLikeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateAppTemplateLikeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateAppTemplateLikeResponse setBody(OperateAppTemplateLikeResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateAppTemplateLikeResponseBody getBody() {
        return this.body;
    }

}
