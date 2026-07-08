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
         * <p>The CVE ID of the vulnerability that is associated with the system protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2021-34538</p>
         */
        @NameInMap("CveId")
        public String cveId;

        /**
         * <p>The description of the system protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of attack that the system protection rule detects. Valid values:</p>
         * <ul>
         * <li><p><strong>sqli</strong>: SQL injection.</p>
         * </li>
         * <li><p><strong>xss</strong>: cross-site scripting (XSS).</p>
         * </li>
         * <li><p><strong>cmdi</strong>: OS command injection.</p>
         * </li>
         * <li><p><strong>expression_injection</strong>: expression injection.</p>
         * </li>
         * <li><p><strong>java_deserialization</strong>: Java deserialization.</p>
         * </li>
         * <li><p><strong>dot_net_deserialization</strong>: .NET deserialization.</p>
         * </li>
         * <li><p><strong>php_deserialization</strong>: PHP deserialization.</p>
         * </li>
         * <li><p><strong>code_exec</strong>: code execution.</p>
         * </li>
         * <li><p><strong>ssrf</strong>: server-side request forgery (SSRF).</p>
         * </li>
         * <li><p><strong>path_traversal</strong>: path traversal.</p>
         * </li>
         * <li><p><strong>arbitrary_file_uploading</strong>: arbitrary file upload.</p>
         * </li>
         * <li><p><strong>webshell</strong>: webshell.</p>
         * </li>
         * <li><p><strong>rfilei</strong>: remote file inclusion (RFI).</p>
         * </li>
         * <li><p><strong>lfilei</strong>: local file inclusion (LFI).</p>
         * </li>
         * <li><p><strong>protocol_violation</strong>: protocol violation.</p>
         * </li>
         * <li><p><strong>scanner_behavior</strong>: scanner behavior.</p>
         * </li>
         * <li><p><strong>logic_flaw</strong>: logic flaw.</p>
         * </li>
         * <li><p><strong>arbitrary_file_reading</strong>: arbitrary file read.</p>
         * </li>
         * <li><p><strong>arbitrary_file_download</strong>: arbitrary file download.</p>
         * </li>
         * <li><p><strong>xxe</strong>: external entity injection.</p>
         * </li>
         * <li><p><strong>csrf</strong>: cross-site request forgery (CSRF).</p>
         * </li>
         * <li><p><strong>crlf</strong>: CRLF injection.</p>
         * </li>
         * <li><p><strong>other</strong>: other.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sqli</p>
         */
        @NameInMap("DetectType")
        public String detectType;

        /**
         * <p>The risk level of the system protection rule. Valid values:</p>
         * <ul>
         * <li><p><strong>super_strict</strong>: Very Strict.</p>
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
         * <p>The action of the system protection rule. Valid values:</p>
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
         * <p>The ID of the system protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>113089</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The name of the system protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>systemRuleTest</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the system protection rule. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: disabled.</p>
         * </li>
         * <li><p><strong>0</strong>: enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleStatus")
        public Integer ruleStatus;

        /**
         * <p>The time when the system protection rule was last updated. This value is a UNIX timestamp. Unit: milliseconds.</p>
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
