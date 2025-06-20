// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CreateOperatorResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateOperatorResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateOperatorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOperatorResponseBody self = new CreateOperatorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOperatorResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateOperatorResponseBody setData(CreateOperatorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOperatorResponseBodyData getData() {
        return this.data;
    }

    public CreateOperatorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOperatorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOperatorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOperatorResponseBodyData extends TeaModel {
        @NameInMap("ApproveStrategyId")
        public Long approveStrategyId;

        @NameInMap("RuleId")
        public Long ruleId;

        public static CreateOperatorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOperatorResponseBodyData self = new CreateOperatorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOperatorResponseBodyData setApproveStrategyId(Long approveStrategyId) {
            this.approveStrategyId = approveStrategyId;
            return this;
        }
        public Long getApproveStrategyId() {
            return this.approveStrategyId;
        }

        public CreateOperatorResponseBodyData setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
