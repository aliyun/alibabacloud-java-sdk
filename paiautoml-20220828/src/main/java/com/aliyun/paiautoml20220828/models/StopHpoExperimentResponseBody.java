// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class StopHpoExperimentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public java.util.Map<String, String> detail;

    @NameInMap("ExpId")
    public String expId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static StopHpoExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopHpoExperimentResponseBody self = new StopHpoExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public StopHpoExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopHpoExperimentResponseBody setDetail(java.util.Map<String, String> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, String> getDetail() {
        return this.detail;
    }

    public StopHpoExperimentResponseBody setExpId(String expId) {
        this.expId = expId;
        return this;
    }
    public String getExpId() {
        return this.expId;
    }

    public StopHpoExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopHpoExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
