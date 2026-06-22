// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSecurityScoreRuleResponseBody extends TeaModel {
    /**
     * <p>The enabling status of the custom security scoring rule. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableStatus")
    public Boolean enableStatus;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of new security score rules.</p>
     */
    @NameInMap("SecurityScoreCategoryList")
    public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryList> securityScoreCategoryList;

    /**
     * <p>The list of legacy security score rules.</p>
     */
    @NameInMap("SecurityScoreRuleList")
    public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleList> securityScoreRuleList;

    public static GetSecurityScoreRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityScoreRuleResponseBody self = new GetSecurityScoreRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityScoreRuleResponseBody setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public Boolean getEnableStatus() {
        return this.enableStatus;
    }

    public GetSecurityScoreRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityScoreRuleResponseBody setSecurityScoreCategoryList(java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryList> securityScoreCategoryList) {
        this.securityScoreCategoryList = securityScoreCategoryList;
        return this;
    }
    public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryList> getSecurityScoreCategoryList() {
        return this.securityScoreCategoryList;
    }

    public GetSecurityScoreRuleResponseBody setSecurityScoreRuleList(java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleList> securityScoreRuleList) {
        this.securityScoreRuleList = securityScoreRuleList;
        return this;
    }
    public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static class GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList extends TeaModel {
        /**
         * <p>The deduction value of the individual item.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The deduction threshold of the individual item.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

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
         * <li><strong>SS_DDOS_BH_ASSET</strong>: Assets in Black Hole Activated status.</li>
         * <li><strong>SS_SAS_AK_LEAK</strong>: Unhandled AccessKey/SecretKey leakage events.</li>
         * <li><strong>SS_PRODUCT_CONNECT</strong>: Security products not in Normal connection status.</li>
         * <li><strong>SS_KEY_CONFIG</strong>: Key feature configuration.</li>
         * <li><strong>SS_PRODUCT_EXPIRE</strong>: Products about to expire.</li>
         * <li><strong>SS_AI_RISK</strong>: AI application risks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSI_AI_VUL_RISK</p>
         */
        @NameInMap("SubRuleType")
        public String subRuleType;

        /**
         * <p>The name of the security score rule sub-item.</p>
         * 
         * <strong>example:</strong>
         * <p>Unhandled application vulnerabilities exist.</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList self = new GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList();
            return TeaModel.build(map, self);
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList setScoreThreshold(Integer scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList setSubRuleType(String subRuleType) {
            this.subRuleType = subRuleType;
            return this;
        }
        public String getSubRuleType() {
            return this.subRuleType;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList extends TeaModel {
        /**
         * <p>The type of the security score rule.</p>
         * 
         * <strong>example:</strong>
         * <p>SS_AI_RISK</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The deduction threshold of the security score rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The deduction list of security score rule sub-items.</p>
         */
        @NameInMap("SecurityScoreItemList")
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList> securityScoreItemList;

        /**
         * <p>The name of the security score rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>AI Application Risks</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList self = new GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList();
            return TeaModel.build(map, self);
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList setSecurityScoreItemList(java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList> securityScoreItemList) {
            this.securityScoreItemList = securityScoreItemList;
            return this;
        }
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetSecurityScoreRuleResponseBodySecurityScoreCategoryList extends TeaModel {
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
         * <p>The deduction threshold of the security score rule category.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The deduction list of security score rule types.</p>
         */
        @NameInMap("SecurityRuleList")
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList> securityRuleList;

        /**
         * <p>The name of the security score rule category.</p>
         * 
         * <strong>example:</strong>
         * <p>Security Response</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetSecurityScoreRuleResponseBodySecurityScoreCategoryList build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityScoreRuleResponseBodySecurityScoreCategoryList self = new GetSecurityScoreRuleResponseBodySecurityScoreCategoryList();
            return TeaModel.build(map, self);
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryList setSecurityRuleList(java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList> securityRuleList) {
            this.securityRuleList = securityRuleList;
            return this;
        }
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList> getSecurityRuleList() {
            return this.securityRuleList;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreCategoryList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList extends TeaModel {
        /**
         * <p>The deduction value of the individual item.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The deduction threshold of the individual item.</p>
         * <blockquote>
         * <p>The configurable range is 0 to the deduction threshold of the security score rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        /**
         * <p>The sub-rule type of the security score deduction item. The relationship between security score categorization types and sub-rule types is as follows:</p>
         * <ul>
         * <li><p>SS_REINFORCE: Key feature configuration.</p>
         * <ul>
         * <li>XPRESS_INSTALL: Security Center service authorization is not enabled.</li>
         * <li>REINFORCE_SUSPICIOUS: Anti-virus feature is not enabled.</li>
         * <li>RANSOMWARE: Anti-ransomware policy is not enabled.</li>
         * <li>WEB_LOCK: Web tamper-proofing feature is not enabled.</li>
         * <li>VIRUS_SCHEDULE_SCAN: Periodic virus scan policy is not enabled.</li>
         * <li>IMAGE_REPO_SCAN: Container image scan scope is not configured.</li>
         * <li>IMAGE_SCAN_TASK: One-click container image security risk scan has not been executed.</li>
         * </ul>
         * </li>
         * <li><p>SS_ALARM: Pending alerts.</p>
         * <ul>
         * <li>ALARM_SERIOUS: One unhandled high-risk alert event exists.</li>
         * <li>ALARM_SUSPICIOUS: One unhandled medium-risk alert event exists.</li>
         * <li>ALARM_REMIND: One unhandled low-risk alert event exists.</li>
         * </ul>
         * </li>
         * <li><p>SS_VUL: Pending vulnerabilities to fix.</p>
         * <ul>
         * <li>CMS_UNFIX: One unfixed CMS vulnerability exists.</li>
         * <li>WIN_UNFIX: One unfixed Windows host vulnerability exists.</li>
         * <li>CVE_UNFIX: One unfixed Linux host vulnerability exists.</li>
         * <li>ERM_UNFIX: One unfixed emergency vulnerability exists.</li>
         * <li>ERM_UNCHECK: One undetected emergency vulnerability exists.</li>
         * </ul>
         * </li>
         * <li><p>SS_HC: Baseline issues.</p>
         * <ul>
         * <li>WEAK_EXPLOIT: Weak password risk exposed to the Internet exists.</li>
         * <li>WEAK_PASSWORD: Weak password risk exists.</li>
         * <li>HC_EXPLOIT: High-risk intrusion vulnerability exists.</li>
         * <li>HC_OTHER_WARNING: Security configuration risk exists.</li>
         * </ul>
         * </li>
         * <li><p>SS_CLOUD_HC: Cloud platform configuration check item issues.</p>
         * <ul>
         * <li>CSPM_CIEM_NOT_PASS: One failed CIEM check item exists.</li>
         * <li>CSPM_RISK_NOT_PASS: One failed security risk check item exists.</li>
         * <li>CSPM_COMPLIANCE_NOT_PASS: One failed compliance check item exists.</li>
         * </ul>
         * </li>
         * <li><p>SS_AK: AccessKey leakage risk exists.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALARM_SERIOUS</p>
         */
        @NameInMap("SubRuleType")
        public String subRuleType;

        /**
         * <p>The description of the sub-rule type for the security score deduction item.</p>
         * 
         * <strong>example:</strong>
         * <p>Unhandled Urgent Alert Event Exists</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList self = new GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList();
            return TeaModel.build(map, self);
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList setScoreThreshold(Integer scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList setSubRuleType(String subRuleType) {
            this.subRuleType = subRuleType;
            return this;
        }
        public String getSubRuleType() {
            return this.subRuleType;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetSecurityScoreRuleResponseBodySecurityScoreRuleList extends TeaModel {
        /**
         * <p>The type of the security score rule. Valid values:</p>
         * <ul>
         * <li>SS_REINFORCE: Key feature configuration.</li>
         * <li>SS_ALARM: Pending alerts.</li>
         * <li>SS_VUL: Pending vulnerabilities to fix.</li>
         * <li>SS_HC: Baseline issues.</li>
         * <li>SS_CLOUD_HC: Cloud platform configuration check item issues.</li>
         * <li>SS_AK: AccessKey leakage risk exists.</li>
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
         * <p>The configurable range is 0 to 100 points. The sum of all security score rule deduction thresholds must equal 100 points.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The list of individual deduction items for the security score rule.</p>
         */
        @NameInMap("SecurityScoreItemList")
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList> securityScoreItemList;

        /**
         * <p>The description of the security score rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Unhandled Alerts</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetSecurityScoreRuleResponseBodySecurityScoreRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityScoreRuleResponseBodySecurityScoreRuleList self = new GetSecurityScoreRuleResponseBodySecurityScoreRuleList();
            return TeaModel.build(map, self);
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleList setSecurityScoreItemList(java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList> securityScoreItemList) {
            this.securityScoreItemList = securityScoreItemList;
            return this;
        }
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
