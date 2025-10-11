// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GenerateUpgradeReportForSyncCloneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateUpgradeReportForSyncCloneResponseBody body;

    public static GenerateUpgradeReportForSyncCloneResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateUpgradeReportForSyncCloneResponse self = new GenerateUpgradeReportForSyncCloneResponse();
        return TeaModel.build(map, self);
    }

    public GenerateUpgradeReportForSyncCloneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateUpgradeReportForSyncCloneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateUpgradeReportForSyncCloneResponse setBody(GenerateUpgradeReportForSyncCloneResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateUpgradeReportForSyncCloneResponseBody getBody() {
        return this.body;
    }

}
