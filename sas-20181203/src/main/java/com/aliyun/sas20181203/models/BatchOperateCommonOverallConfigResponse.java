// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchOperateCommonOverallConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchOperateCommonOverallConfigResponseBody body;

    public static BatchOperateCommonOverallConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchOperateCommonOverallConfigResponse self = new BatchOperateCommonOverallConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchOperateCommonOverallConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchOperateCommonOverallConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchOperateCommonOverallConfigResponse setBody(BatchOperateCommonOverallConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchOperateCommonOverallConfigResponseBody getBody() {
        return this.body;
    }

}
