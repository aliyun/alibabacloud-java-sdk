// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeMaskingRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeMaskingRulesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeMaskingRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMaskingRulesResponseBody self = new DescribeMaskingRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMaskingRulesResponseBody setData(DescribeMaskingRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeMaskingRulesResponseBodyData getData() {
        return this.data;
    }

    public DescribeMaskingRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMaskingRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMaskingRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeMaskingRulesResponseBodyData extends TeaModel {
        @NameInMap("RuleList")
        public java.util.List<String> ruleList;

        public static DescribeMaskingRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMaskingRulesResponseBodyData self = new DescribeMaskingRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMaskingRulesResponseBodyData setRuleList(java.util.List<String> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<String> getRuleList() {
            return this.ruleList;
        }

    }

}
