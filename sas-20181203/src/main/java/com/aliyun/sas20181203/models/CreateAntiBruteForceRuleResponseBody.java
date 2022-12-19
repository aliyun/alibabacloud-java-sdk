// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateAntiBruteForceRuleResponseBody extends TeaModel {
    // The information about the defense rule.
    @NameInMap("CreateAntiBruteForceRule")
    public CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule createAntiBruteForceRule;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAntiBruteForceRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntiBruteForceRuleResponseBody self = new CreateAntiBruteForceRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntiBruteForceRuleResponseBody setCreateAntiBruteForceRule(CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule createAntiBruteForceRule) {
        this.createAntiBruteForceRule = createAntiBruteForceRule;
        return this;
    }
    public CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule getCreateAntiBruteForceRule() {
        return this.createAntiBruteForceRule;
    }

    public CreateAntiBruteForceRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule extends TeaModel {
        // The ID of the defense rule.
        @NameInMap("RuleId")
        public Long ruleId;

        public static CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule build(java.util.Map<String, ?> map) throws Exception {
            CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule self = new CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule();
            return TeaModel.build(map, self);
        }

        public CreateAntiBruteForceRuleResponseBodyCreateAntiBruteForceRule setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
