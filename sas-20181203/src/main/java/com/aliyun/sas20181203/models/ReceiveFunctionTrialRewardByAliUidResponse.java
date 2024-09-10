// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ReceiveFunctionTrialRewardByAliUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReceiveFunctionTrialRewardByAliUidResponseBody body;

    public static ReceiveFunctionTrialRewardByAliUidResponse build(java.util.Map<String, ?> map) throws Exception {
        ReceiveFunctionTrialRewardByAliUidResponse self = new ReceiveFunctionTrialRewardByAliUidResponse();
        return TeaModel.build(map, self);
    }

    public ReceiveFunctionTrialRewardByAliUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReceiveFunctionTrialRewardByAliUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReceiveFunctionTrialRewardByAliUidResponse setBody(ReceiveFunctionTrialRewardByAliUidResponseBody body) {
        this.body = body;
        return this;
    }
    public ReceiveFunctionTrialRewardByAliUidResponseBody getBody() {
        return this.body;
    }

}
