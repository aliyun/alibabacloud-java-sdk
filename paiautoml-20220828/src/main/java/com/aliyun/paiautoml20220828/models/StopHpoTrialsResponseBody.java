// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class StopHpoTrialsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.Map<String, ?> results;

    public static StopHpoTrialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopHpoTrialsResponseBody self = new StopHpoTrialsResponseBody();
        return TeaModel.build(map, self);
    }

    public StopHpoTrialsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopHpoTrialsResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public StopHpoTrialsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopHpoTrialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopHpoTrialsResponseBody setResults(java.util.Map<String, ?> results) {
        this.results = results;
        return this;
    }
    public java.util.Map<String, ?> getResults() {
        return this.results;
    }

}
