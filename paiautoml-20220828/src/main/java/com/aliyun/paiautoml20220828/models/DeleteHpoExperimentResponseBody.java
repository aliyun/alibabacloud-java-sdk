// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class DeleteHpoExperimentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Detail")
    public java.util.Map<String, ?> detail;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHpoExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHpoExperimentResponseBody self = new DeleteHpoExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHpoExperimentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteHpoExperimentResponseBody setDetail(java.util.Map<String, ?> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.Map<String, ?> getDetail() {
        return this.detail;
    }

    public DeleteHpoExperimentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteHpoExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
