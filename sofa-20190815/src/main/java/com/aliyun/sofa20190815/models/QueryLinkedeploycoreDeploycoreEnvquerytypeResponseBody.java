// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    public static QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody self = new QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreEnvquerytypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
