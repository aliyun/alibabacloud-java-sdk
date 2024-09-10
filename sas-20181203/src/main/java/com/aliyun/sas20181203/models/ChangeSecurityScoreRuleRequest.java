// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeSecurityScoreRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to reset to the system default rule. Valid values:</p>
     * <ul>
     * <li>true: yes</li>
     * <li>false: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ResetSecurityScoreRule")
    public Boolean resetSecurityScoreRule;

    /**
     * <p>The list of deduction modules that are supported by the security score feature.</p>
     */
    @NameInMap("SecurityScoreRuleList")
    public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleList> securityScoreRuleList;

    public static ChangeSecurityScoreRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeSecurityScoreRuleRequest self = new ChangeSecurityScoreRuleRequest();
        return TeaModel.build(map, self);
    }

    public ChangeSecurityScoreRuleRequest setResetSecurityScoreRule(Boolean resetSecurityScoreRule) {
        this.resetSecurityScoreRule = resetSecurityScoreRule;
        return this;
    }
    public Boolean getResetSecurityScoreRule() {
        return this.resetSecurityScoreRule;
    }

    public ChangeSecurityScoreRuleRequest setSecurityScoreRuleList(java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleList> securityScoreRuleList) {
        this.securityScoreRuleList = securityScoreRuleList;
        return this;
    }
    public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static class ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList extends TeaModel {
        /**
         * <p>The penalty point of the deduction item.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The threshold for the deduction item.</p>
         * <blockquote>
         * <p> Valid values: 0 to the deduction threshold of the deduction module.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        /**
         * <p>The deduction item of the deduction module. The following list describes the deduction modules and their deduction items:</p>
         * <ul>
         * <li><p>SS_REINFORCE: issue in key feature configuration</p>
         * <ul>
         * <li>XPRESS_INSTALL: Security Center is not authorized.</li>
         * <li>REINFORCE_SUSPICIOUS: The anti-virus feature is disabled.</li>
         * <li>RANSOMWARE: The anti-ransomware policy is disabled.</li>
         * <li>WEB_LOCK: The web tamper proofing feature is disabled.</li>
         * <li>VIRUS_SCHEDULE_SCAN: The periodic virus scan policy is disabled.</li>
         * <li>IMAGE_REPO_SCAN: The container image scan range is not configured.</li>
         * <li>IMAGE_SCAN_TASK: The feature of one-click scan of container images for security risks is not performed.</li>
         * </ul>
         * </li>
         * <li><p>SS_ALARM: unhandled alert</p>
         * <ul>
         * <li>ALARM_SERIOUS: An unhandled high-risk alert event is detected.</li>
         * <li>ALARM_SUSPICIOUS: An unhandled medium-risk alarm event is detected.</li>
         * <li>ALARM_REMIND: An unhandled low-risk alarm event is detected.</li>
         * </ul>
         * </li>
         * <li><p>SS_VUL: unfixed vulnerability</p>
         * <ul>
         * <li>CMS_UNFIX: An unfixed Web-CMS vulnerability is detected.</li>
         * <li>WIN_UNFIX: An unfixed Windows host vulnerability is detected.</li>
         * <li>CVE_UNFIX: An unfixed Linux host vulnerability is detected.</li>
         * <li>ERM_UNFIX: An unfixed emergency vulnerability is detected.</li>
         * <li>ERM_UNCHECK: An undetected emergency vulnerability exists.</li>
         * </ul>
         * </li>
         * <li><p>SS_HC: baseline risks</p>
         * <ul>
         * <li>WEAK_EXPLOIT: Weak passwords are exposed to the Internet.</li>
         * <li>WEAK_PASSWORD: Weak passwords exist.</li>
         * <li>HC_EXPLOIT: The data source may be hacked.</li>
         * <li>HC_OTHER_WARNING: Security configuration risks exist.</li>
         * </ul>
         * </li>
         * <li><p>SS_CLOUD_HC: Cloud platform configuration check item problem.</p>
         * <ul>
         * <li>CSPM_CIEM_NOT_PASS: A CIEM check item failed the check.</li>
         * <li>CSPM_RISK_NOT_PASS: A security risk check item failed the check.</li>
         * <li>CSPM_COMPLIANCE_NOT_PASS: A compliance check item failed the check.</li>
         * </ul>
         * </li>
         * <li><p>SS_AK: risk of AccessKey pair leaks</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALARM_SERIOUS</p>
         */
        @NameInMap("SubRuleType")
        public String subRuleType;

        public static ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList build(java.util.Map<String, ?> map) throws Exception {
            ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList self = new ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList();
            return TeaModel.build(map, self);
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList setScoreThreshold(Integer scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList setSubRuleType(String subRuleType) {
            this.subRuleType = subRuleType;
            return this;
        }
        public String getSubRuleType() {
            return this.subRuleType;
        }

    }

    public static class ChangeSecurityScoreRuleRequestSecurityScoreRuleList extends TeaModel {
        /**
         * <p>The deduction module that is supported by the security score feature. Valid values:</p>
         * <ul>
         * <li>SS_REINFORCE: issue in key feature configuration</li>
         * <li>SS_ALARM: unhandled alert</li>
         * <li>SS_VUL: unfixed vulnerability</li>
         * <li>SS_HC: baseline risk</li>
         * <li>SS_CLOUD_HC: Cloud platform configuration check item problem.</li>
         * <li>SS_AK: risk of AccessKey pair leaks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SS_ALARM</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The deduction threshold of the deduction module.</p>
         * <blockquote>
         * <p> Valid values: 0 to 100. The sum of the deduction thresholds for all deduction modules must be equal to 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The deduction items of the deduction module.</p>
         */
        @NameInMap("SecurityScoreItemList")
        public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList> securityScoreItemList;

        public static ChangeSecurityScoreRuleRequestSecurityScoreRuleList build(java.util.Map<String, ?> map) throws Exception {
            ChangeSecurityScoreRuleRequestSecurityScoreRuleList self = new ChangeSecurityScoreRuleRequestSecurityScoreRuleList();
            return TeaModel.build(map, self);
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleList setSecurityScoreItemList(java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList> securityScoreItemList) {
            this.securityScoreItemList = securityScoreItemList;
            return this;
        }
        public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

    }

}
