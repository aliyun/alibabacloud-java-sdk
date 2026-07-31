// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeBaseSystemRulesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>80736FA5-FA87-55F6-AA69-C5477C6FE6D0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of system protection rules.</p>
     */
    @NameInMap("Rules")
    public java.util.List<DescribeBaseSystemRulesResponseBodyRules> rules;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeBaseSystemRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBaseSystemRulesResponseBody self = new DescribeBaseSystemRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBaseSystemRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBaseSystemRulesResponseBody setRules(java.util.List<DescribeBaseSystemRulesResponseBodyRules> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<DescribeBaseSystemRulesResponseBodyRules> getRules() {
        return this.rules;
    }

    public DescribeBaseSystemRulesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBaseSystemRulesResponseBodyRules extends TeaModel {
        /**
         * <p>The CVE ID of the vulnerability associated with the system rule.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2021-34538</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The detection module. Valid values:</p>
         * <ul>
         * <li><strong>sqli</strong>: SQL injection.</li>
         * <li><strong>xss</strong>: cross-site scripting (XSS).</li>
         * <li><strong>cmdi</strong>: OS command injection.</li>
         * <li><strong>expression_injection</strong>: expression injection.</li>
         * <li><strong>java_deserialization</strong>: Java deserialization.</li>
         * <li><strong>dot_net_deserialization</strong>: .NET deserialization.</li>
         * <li><strong>php_deserialization</strong>: PHP deserialization.</li>
         * <li><strong>code_exec</strong>: code execution.</li>
         * <li><strong>ssrf</strong>: server-side request forgery (SSRF).</li>
         * <li><strong>path_traversal</strong>: path traversal.</li>
         * <li><strong>arbitrary_file_uploading</strong>: arbitrary file upload.</li>
         * <li><strong>webshell</strong>: webshell.</li>
         * <li><strong>rfilei</strong>: remote file inclusion (RFI).</li>
         * <li><strong>lfilei</strong>: local file inclusion (LFI).</li>
         * <li><strong>protocol_violation</strong>: protocol violation.</li>
         * <li><strong>scanner_behavior</strong>: scanner behavior.</li>
         * <li><strong>logic_flaw</strong>: business logic bug.</li>
         * <li><strong>arbitrary_file_reading</strong>: arbitrary file reading.</li>
         * <li><strong>arbitrary_file_download</strong>: arbitrary file download.</li>
         * <li><strong>xxe</strong>: XML external entity injection.</li>
         * <li><strong>csrf</strong>: cross-site request forgery.</li>
         * <li><strong>crlf</strong>: CRLF.</li>
         * <li><strong>other</strong>: other.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sqli</p>
         */
        @NameInMap("DetectType")
        public String detectType;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>super_strict</strong>: Super strict.</p>
         * </li>
         * <li><p><strong>strict</strong>: Strict.</p>
         * </li>
         * <li><p><strong>medium</strong>: Medium.</p>
         * </li>
         * <li><p><strong>loose</strong>: Loose.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>super_strict</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The rule action. Valid values:</p>
         * <ul>
         * <li><p><strong>block</strong>: Block.</p>
         * </li>
         * <li><p><strong>monitor</strong>: Monitor.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("RuleAction")
        public String ruleAction;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>113089</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>systemRuleTest</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Disabled.</li>
         * <li><strong>0</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleStatus")
        public Integer ruleStatus;

        /**
         * <p>The time when the rule was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1665460629000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeBaseSystemRulesResponseBodyRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeBaseSystemRulesResponseBodyRules self = new DescribeBaseSystemRulesResponseBodyRules();
            return TeaModel.build(map, self);
        }

        public DescribeBaseSystemRulesResponseBodyRules setCveId(String cveId) {
            this.cveId = cveId;
            return this;
        }
        public String getCveId() {
            return this.cveId;
        }

        public DescribeBaseSystemRulesResponseBodyRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBaseSystemRulesResponseBodyRules setDetectType(String detectType) {
            this.detectType = detectType;
            return this;
        }
        public String getDetectType() {
            return this.detectType;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRuleAction(String ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public String getRuleAction() {
            return this.ruleAction;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeBaseSystemRulesResponseBodyRules setRuleStatus(Integer ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public Integer getRuleStatus() {
            return this.ruleStatus;
        }

        public DescribeBaseSystemRulesResponseBodyRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
