// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeSecurityScoreRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to reset to the system default rule. Valid values:</p>
     * <br>
     * <p>*   true: yes</p>
     * <p>*   false: no</p>
     */
    @NameInMap("ResetSecurityScoreRule")
    public Boolean resetSecurityScoreRule;

    /**
     * <p>The list of deducted modules that are supported by the security score feature.</p>
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
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The threshold for the deduction item.</p>
         * <br>
         * <p>>  Valid values: 0 to the deduction threshold of the deduction module.</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        /**
         * <p>The deduction item of the deduction module. The following list describes the deduction modules and their deduction items:</p>
         * <br>
         * <p>*   SS_REINFORCE: issue in key feature configuration</p>
         * <br>
         * <p>    *   XPRESS_INSTALL: Security Center is not authorized.</p>
         * <p>    *   REINFORCE_SUSPICIOUS: The anti-virus feature is disabled.</p>
         * <p>    *   RANSOMWARE: The anti-ransomware policy is disabled.</p>
         * <p>    *   WEB_LOCK: The web tamper proofing feature is disabled.</p>
         * <p>    *   VIRUS_SCHEDULE_SCAN: The periodic virus scan policy is disabled.</p>
         * <p>    *   IMAGE_REPO_SCAN: The container image scan range is not configured.</p>
         * <p>    *   IMAGE_SCAN_TASK: The feature of one-click scan of container images for security risks is not performed.</p>
         * <br>
         * <p>*   SS_ALARM: unhandled alert</p>
         * <br>
         * <p>    *   ALARM_SERIOUS: An unhandled high-risk alert event is detected.</p>
         * <p>    *   ALARM_SUSPICIOUS: An unhandled medium-risk alarm event is detected.</p>
         * <p>    *   ALARM_REMIND: An unhandled low-risk alarm event is detected.</p>
         * <br>
         * <p>*   SS_VUL: unfixed vulnerability</p>
         * <br>
         * <p>    *   CMS_UNFIX: An unfixed Web-CMS vulnerability is detected.</p>
         * <p>    *   WIN_UNFIX: An unfixed Windows host vulnerability is detected.</p>
         * <p>    *   CVE_UNFIX: An unfixed Linux host vulnerability is detected.</p>
         * <p>    *   ERM_UNFIX: An unfixed emergency vulnerability is detected.</p>
         * <p>    *   ERM_UNCHECK: An undetected emergency vulnerability exists.</p>
         * <br>
         * <p>*   SS_HC: baseline risks</p>
         * <br>
         * <p>    *   WEAK_EXPLOIT: Weak passwords are exposed to the Internet.</p>
         * <p>    *   WEAK_PASSWORD: Weak passwords exist.</p>
         * <p>    *   HC_EXPLOIT: The data source may be hacked.</p>
         * <p>    *   HC_OTHER_WARNING: Security configuration risks exist.</p>
         * <br>
         * <p>*   SS_CLOUD_HC: Cloud platform configuration check item problem.</p>
         * <br>
         * <p>    *   CSPM_CIEM_NOT_PASS: A CIEM check item failed the check.</p>
         * <p>    *   CSPM_RISK_NOT_PASS: A security risk check item failed the check.</p>
         * <p>    *   CSPM_COMPLIANCE_NOT_PASS: A compliance check item failed the check.</p>
         * <br>
         * <p>*   SS_AK: risk of AccessKey pair leaks</p>
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
         * <p>The deducted module that is supported by the security score feature. Valid values:</p>
         * <br>
         * <p>*   SS_REINFORCE: issue in key feature configuration</p>
         * <p>*   SS_ALARM: unhandled alert</p>
         * <p>*   SS_VUL: unfixed vulnerability</p>
         * <p>*   SS_HC: baseline risk</p>
         * <p>*   SS_CLOUD_HC: Cloud platform configuration check item problem.</p>
         * <p>*   SS_AK: risk of AccessKey pair leaks</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The deduction threshold of the deduction module.</p>
         * <br>
         * <p>>  Valid values: 0 to 100. The sum of the deduction thresholds for all deduction modules must be equal to 100.</p>
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
