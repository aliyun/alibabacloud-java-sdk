// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeProtectionModuleRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rules")
    public java.util.List<DescribeProtectionModuleRulesResponseBodyRules> rules;

    public static DescribeProtectionModuleRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProtectionModuleRulesResponseBody self = new DescribeProtectionModuleRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProtectionModuleRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeProtectionModuleRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProtectionModuleRulesResponseBody setRules(java.util.List<DescribeProtectionModuleRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeProtectionModuleRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public static class DescribeProtectionModuleRulesResponseBodyRules extends TeaModel {
        @NameInMap("Status")
        public Long status;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Version")
        public Long version;

        @NameInMap("Content")
        public java.util.Map<String, ?> content;

        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeProtectionModuleRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeProtectionModuleRulesResponseBodyRules self = new DescribeProtectionModuleRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeProtectionModuleRulesResponseBodyRules setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public DescribeProtectionModuleRulesResponseBodyRules setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public DescribeProtectionModuleRulesResponseBodyRules setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeProtectionModuleRulesResponseBodyRules setContent(java.util.Map<String, ?> content) {
            this.content = content;
            return this;
        }
        public java.util.Map<String, ?> getContent() {
            return this.content;
        }

        public DescribeProtectionModuleRulesResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
