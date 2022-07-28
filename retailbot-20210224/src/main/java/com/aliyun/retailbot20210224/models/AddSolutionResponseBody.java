// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class AddSolutionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SolutionId")
    public Long solutionId;

    @NameInMap("Success")
    public Boolean success;

    public static AddSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddSolutionResponseBody self = new AddSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public AddSolutionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddSolutionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddSolutionResponseBody setSolutionId(Long solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public Long getSolutionId() {
        return this.solutionId;
    }

    public AddSolutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
