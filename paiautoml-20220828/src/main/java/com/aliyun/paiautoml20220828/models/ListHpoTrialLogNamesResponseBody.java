// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoTrialLogNamesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    @NameInMap("LogNames")
    public java.util.List<String> logNames;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListHpoTrialLogNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHpoTrialLogNamesResponseBody self = new ListHpoTrialLogNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHpoTrialLogNamesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHpoTrialLogNamesResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public ListHpoTrialLogNamesResponseBody setLogNames(java.util.List<String> logNames) {
        this.logNames = logNames;
        return this;
    }
    public java.util.List<String> getLogNames() {
        return this.logNames;
    }

    public ListHpoTrialLogNamesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHpoTrialLogNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
