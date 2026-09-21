// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeSecurityScoreRuleRequest extends TeaModel {
    /**
     * <p>Specifies whether to modify the new version or legacy security score rules. If the value is <strong>home_security_score</strong>, the new version security score rules are modified. Otherwise, the legacy security score rules are modified by default.</p>
     * 
     * <strong>example:</strong>
     * <p>home_security_score</p>
     */
    @NameInMap("CalType")
    public String calType;

    /**
     * <p>Specifies whether to reset to the system default rules. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ResetSecurityScoreRule")
    public Boolean resetSecurityScoreRule;

    /**
     * <p>The ID of the Alibaba Cloud account of the member accounts in the resource directory.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The list of new version security score rule deductions.</p>
     */
    @NameInMap("SecurityScoreCategoryList")
    public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreCategoryList> securityScoreCategoryList;

    /**
     * <p>The list of legacy security score rules.</p>
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

    public ChangeSecurityScoreRuleRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
         * <p>The deduction value for the individual item.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The deduction threshold for the individual item.</p>
         * <blockquote>
         * <p>The valid range is 0 to the deduction threshold of the security score rule type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        /**
         * <p>The security score rule sub-item.</p>
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
         * <p>The type of the security score rule sub-item. Valid values:</p>
         * <ul>
         * <li><strong>SS_SAS_WEAK_PW</strong>: Pending weak passwords to fix.</li>
         * <li><strong>SS_SAS_ALARM</strong>: Pending Security Center alerts.</li>
         * <li><strong>SS_SAS_EMG_VUL</strong>: Pending emergency vulnerabilities to fix.</li>
         * <li><strong>SS_SAS_APP_VUL</strong>: Pending application vulnerabilities to fix.</li>
         * <li><strong>SS_SAS_SYS_VUL</strong>: Pending system vulnerabilities to fix.</li>
         * <li><strong>SS_SAS_CLOUD_HC</strong>: Pending Cloud Security Posture Management (CSPM) risks.</li>
         * <li><strong>SS_SDDP_DATA_RISK</strong>: Pending data security risks to remediate.</li>
         * <li><strong>SS_WAF_API_RISK</strong>: Pending API security risks.</li>
         * <li><strong>SS_DDOS_BH_ASSET</strong>: Assets under DDoS blackhole filtering.</li>
         * <li><strong>SS_SAS_AK_LEAK</strong>: Unhandled AccessKey/SecretKey leak events.</li>
         * <li><strong>SS_PRODUCT_CONNECT</strong>: Security products not properly connected.</li>
         * <li><strong>SS_KEY_CONFIG</strong>: Key feature configuration.</li>
         * <li><strong>SS_PRODUCT_EXPIRE</strong>: Products about to expire.</li>
         * <li><strong>SS_AI_RISK</strong>: AI application risks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SS_REINFORCE</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The deduction threshold for the security score rule type.</p>
         * <blockquote>
         * <p>The valid range is 0 to the deduction threshold of the security score rule category.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The list of deductions for security score rule sub-items.</p>
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
         * <li><strong>SS_SAS_HANDLE</strong>: Security governance.</li>
         * <li><strong>SS_SAS_RESPOND</strong>: Security response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SS_SAS_HANDLE</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The deduction threshold for the security score rule category.</p>
         * <blockquote>
         * <p>The valid range is 0 to 100. The sum of deduction thresholds for all security score rule categories must equal 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        /**
         * <p>The list of deductions by security score rule type.</p>
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
         * <p>The deduction value for the individual item.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The deduction threshold for the individual item.</p>
         * <blockquote>
         * <p>The valid range is 0 to the deduction threshold of the security score rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        /**
         * <p>The sub-rule type of the individual deduction item. The relationship between security score types and sub-rule types is as follows:</p>
         * <ul>
         * <li><p>SS_REINFORCE: Key feature configuration.</p>
         * <ul>
         * <li>XPRESS_INSTALL: Security Center service authorization is not enabled.</li>
         * <li>REINFORCE_SUSPICIOUS: The anti-virus feature is not enabled.</li>
         * <li>RANSOMWARE: The anti-ransomware policy is not enabled.</li>
         * <li>WEB_LOCK: The web tamper-proofing feature is not enabled.</li>
         * <li>VIRUS_SCHEDULE_SCAN: The periodic virus scan policy is not enabled.</li>
         * <li>IMAGE_REPO_SCAN: The container image scan scope is not configured.</li>
         * <li>IMAGE_SCAN_TASK: The one-click container image security risk scan has not been executed.</li>
         * </ul>
         * </li>
         * <li><p>SS_ALARM: Pending alerts.</p>
         * <ul>
         * <li>ALARM_SERIOUS: One unhandled high-risk alert event exists.</li>
         * <li>ALARM_SUSPICIOUS: One unhandled medium-risk alert event exists.</li>
         * <li>ALARM_REMIND: One unhandled low-risk alert event exists.</li>
         * </ul>
         * </li>
         * <li><p>SS_VUL: Pending vulnerabilities.</p>
         * <ul>
         * <li>CMS_UNFIX: One unfixed CMS vulnerability exists.</li>
         * <li>WIN_UNFIX: One unfixed Windows host vulnerability exists.</li>
         * <li>CVE_UNFIX: One unfixed Linux host vulnerability exists.</li>
         * <li>ERM_UNFIX: One unfixed emergency vulnerability exists.</li>
         * <li>ERM_UNCHECK: One unscanned emergency vulnerability exists.</li>
         * </ul>
         * </li>
         * <li><p>SS_HC: Baseline issues.</p>
         * <ul>
         * <li>WEAK_EXPLOIT: A weak password risk with Internet Exposure exists.</li>
         * <li>WEAK_PASSWORD: A weak password risk exists.</li>
         * <li>HC_EXPLOIT: A high-risk intrusion vulnerability exists.</li>
         * <li>HC_OTHER_WARNING: A security configuration risk exists.</li>
         * </ul>
         * </li>
         * <li><p>SS_CLOUD_HC: Cloud platform configuration check item issues.</p>
         * <ul>
         * <li>CSPM_CIEM_NOT_PASS: One failed CIEM check item exists.</li>
         * <li>CSPM_RISK_NOT_PASS: One failed security risk check item exists.</li>
         * <li>CSPM_COMPLIANCE_NOT_PASS: One failed compliance check item exists.</li>
         * </ul>
         * </li>
         * <li><p>SS_AK: AccessKey pair leak risk.</p>
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
         * <li>SS_REINFORCE: Key feature configuration.</li>
         * <li>SS_ALARM: Pending alerts.</li>
         * <li>SS_VUL: Pending vulnerabilities.</li>
         * <li>SS_HC: Baseline issues.</li>
         * <li>SS_CLOUD_HC: Cloud platform configuration check item issues.</li>
         * <li>SS_AK: AccessKey pair leak risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SS_ALARM</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The deduction value of the security score rule.</p>
         * <blockquote>
         * <p>The valid range is 0 to 100. The sum of deduction thresholds for all security score rules must equal 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The list of individual deduction items for the security score rule.</p>
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
