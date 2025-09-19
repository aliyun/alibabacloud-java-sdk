// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeSecurityScoreRuleRequest extends TeaModel {
    /**
     * <p>The old or new version of the security score rule. If you set this parameter to <strong>home_security_score</strong>, the new version of the security score rule is changed. Otherwise, the old version of the security score rule is changed by default.</p>
     * 
     * <strong>example:</strong>
     * <p>home_security_score</p>
     */
    @NameInMap("CalType")
    public String calType;

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
     * <p>The information about the new version of the security score rule.</p>
     */
    @NameInMap("SecurityScoreCategoryList")
    public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryList> securityScoreCategoryList;

    /**
     * <p>The information about the old version of the security score rule.</p>
     */
    @NameInMap("SecurityScoreRuleList")
    public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleList> securityScoreRuleList;

    public static ChangeSecurityScoreRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeSecurityScoreRuleRequest self = new ChangeSecurityScoreRuleRequest();
        return TeaModel.build(map, self);
    }

    public ChangeSecurityScoreRuleRequest setCalType(String calType) {
        this.calType = calType;
        return this;
    }
    public String getCalType() {
        return this.calType;
    }

    public ChangeSecurityScoreRuleRequest setResetSecurityScoreRule(Boolean resetSecurityScoreRule) {
        this.resetSecurityScoreRule = resetSecurityScoreRule;
        return this;
    }
    public Boolean getResetSecurityScoreRule() {
        return this.resetSecurityScoreRule;
    }

    public ChangeSecurityScoreRuleRequest setSecurityScoreCategoryList(java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryList> securityScoreCategoryList) {
        this.securityScoreCategoryList = securityScoreCategoryList;
        return this;
    }
    public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryList> getSecurityScoreCategoryList() {
        return this.securityScoreCategoryList;
    }

    public ChangeSecurityScoreRuleRequest setSecurityScoreRuleList(java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleList> securityScoreRuleList) {
        this.securityScoreRuleList = securityScoreRuleList;
        return this;
    }
    public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static class ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList extends TeaModel {
        /**
         * <p>The penalty point of the deduction item.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>5</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        /**
         * <p>The sub-deduction item of the security score rule.</p>
         * 
         * <strong>example:</strong>
         * <p>SSI_KEY_CONFIG</p>
         */
        @NameInMap("SubRuleType")
        public String subRuleType;

        public static ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList build(java.util.Map<String, ?> map) throws Exception {
            ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList self = new ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList();
            return TeaModel.build(map, self);
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList setScoreThreshold(Integer scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList setSubRuleType(String subRuleType) {
            this.subRuleType = subRuleType;
            return this;
        }
        public String getSubRuleType() {
            return this.subRuleType;
        }

    }

    public static class ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList extends TeaModel {
        /**
         * <p>The deducted module that is supported by the security score feature. The type of the sub-deduction item. Valid values:</p>
         * <ul>
         * <li><strong>SS_SAS_WEAK_PW</strong>: unhandled weak password risk.</li>
         * <li><strong>SS_SAS_ALARM</strong>: unhandled alert in Security Center.</li>
         * <li><strong>SS_SAS_EMG_VUL</strong>: unfixed urgent vulnerability.</li>
         * <li><strong>SS_SAS_APP_VUL</strong>: unfixed application vulnerability.</li>
         * <li><strong>SS_SAS_SYS_VUL</strong>: unfixed system vulnerability.</li>
         * <li><strong>SS_SAS_CLOUD_HC</strong>: unhandled cloud security posture management (CSPM) risk.</li>
         * <li><strong>SS_SDDP_DATA_RISK</strong>: unhandled data security risk.</li>
         * <li><strong>SS_WAF_API_RISK</strong>: unhandled API security risk.</li>
         * <li><strong>SS_DDOS_BH_ASSET</strong>: asset on which blackhole filtering is triggered.</li>
         * <li><strong>SS_SAS_AK_LEAK</strong>: unhandled AK/SK leak event.</li>
         * <li><strong>SS_PRODUCT_CONNECT</strong>: security service not integrated.</li>
         * <li><strong>SS_KEY_CONFIG</strong>: key feature configuration.</li>
         * <li><strong>SS_PRODUCT_EXPIRE</strong>: service that is about to expire.</li>
         * <li><strong>SS_AI_RISK</strong>: AI application risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SS_REINFORCE</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The threshold of deduction for the security score rule type.</p>
         * <blockquote>
         * <p> Valid values: 0 to the deduction threshold of the deduction module.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The sub-deduction items of the security score rule.</p>
         */
        @NameInMap("SecurityScoreItemList")
        public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList> securityScoreItemList;

        public static ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList build(java.util.Map<String, ?> map) throws Exception {
            ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList self = new ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList();
            return TeaModel.build(map, self);
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList setSecurityScoreItemList(java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList> securityScoreItemList) {
            this.securityScoreItemList = securityScoreItemList;
            return this;
        }
        public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleListSecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

    }

    public static class ChangeSecurityScoreRuleRequestSecurityScoreCategoryList extends TeaModel {
        /**
         * <p>The category of the security score rule. Valid values:</p>
         * <ul>
         * <li><strong>SS_SAS_HANDLE</strong>: security governance.</li>
         * <li><strong>SS_SAS_RESPOND</strong>: security response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SS_SAS_HANDLE</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The threshold of deduction for the security score rule type.</p>
         * <blockquote>
         * <p> Valid values: 0 to 100. The sum of the deduction thresholds for all deduction modules must be equal to 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        /**
         * <p>The deduction items of the security score rule.</p>
         */
        @NameInMap("SecurityRuleList")
        public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList> securityRuleList;

        public static ChangeSecurityScoreRuleRequestSecurityScoreCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ChangeSecurityScoreRuleRequestSecurityScoreCategoryList self = new ChangeSecurityScoreRuleRequestSecurityScoreCategoryList();
            return TeaModel.build(map, self);
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreCategoryList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreCategoryList setScoreThreshold(Integer scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreCategoryList setSecurityRuleList(java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList> securityRuleList) {
            this.securityRuleList = securityRuleList;
            return this;
        }
        public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryListSecurityRuleList> getSecurityRuleList() {
            return this.securityRuleList;
        }

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
         * <li><p>SS_HC: baseline risk</p>
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
         * <p>The type of the security score rule. Valid values:</p>
         * <ul>
         * <li>SS_REINFORCE: issue in key feature configuration</li>
         * <li>SS_ALARM: unhandled alert</li>
         * <li>SS_VUL: unfixed vulnerability</li>
         * <li>SS_HC: baseline risk</li>
         * <li>SS_CLOUD_HC: risk item of configuration assessment</li>
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
