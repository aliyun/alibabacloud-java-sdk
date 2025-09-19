// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSecurityScoreRuleResponseBody extends TeaModel {
    /**
     * <p>The status of the custom settings of the security score feature.</p>
     * <ul>
     * <li>true: enabled</li>
     * <li>false: disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableStatus")
    public Boolean enableStatus;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the new version of the security score rule.</p>
     */
    @NameInMap("SecurityScoreCategoryList")
    public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryList> securityScoreCategoryList;

    /**
     * <p>The information about the old version of the security score rule.</p>
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
         * <p>The deduction score for the item.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The threshold of the deduction score for the item.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        /**
         * <p>The type of the sub-deduction item. Valid values:</p>
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
         * <p>SSI_AI_VUL_RISK</p>
         */
        @NameInMap("SubRuleType")
        public String subRuleType;

        /**
         * <p>The name of the sub-deduction item of the security score rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Unfixed application vulnerabilities</p>
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
         * <p>The threshold of deduction for the security score rule type.</p>
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
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleListSecurityScoreItemList> securityScoreItemList;

        /**
         * <p>The name of the security score rule type.</p>
         * 
         * <strong>example:</strong>
         * <p>AI application risks</p>
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
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The deduction items of the security score rule.</p>
         */
        @NameInMap("SecurityRuleList")
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreCategoryListSecurityRuleList> securityRuleList;

        /**
         * <p>The category of the security score rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Security governance</p>
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
         * <p>The penalty point of the deduction item.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The deduction item of the deduction module. The following list describes the deduction modules and their deduction items:</p>
         * <ul>
         * <li><p>SS_REINFORCE: issue in key feature configuration</p>
         * <ul>
         * <li>XPRESS_INSTALL: Security Center is not authorized.</li>
         * <li>REINFORCE_SUSPICIOUS: The antivirus feature is disabled.</li>
         * <li>RANSOMWARE: The anti-ransomware policy is disabled.</li>
         * <li>WEB_LOCK: The web tamper proofing feature is disabled.</li>
         * <li>VIRUS_SCHEDULE_SCAN: The periodic virus scan policy is disabled.</li>
         * <li>IMAGE_REPO_SCAN: The range of container image scan is not configured.</li>
         * <li>IMAGE_SCAN_TASK: The feature of one-click scan of container images for security risks is not performed.</li>
         * </ul>
         * </li>
         * <li><p>SS_ALARM: unhandled alert.</p>
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
         * <li>ERM_UNFIX: An unfixed urgent vulnerability is detected.</li>
         * <li>ERM_UNCHECK: An undetected urgent vulnerability exists.</li>
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

        /**
         * <p>The description of the deduction item in a deduction module.</p>
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
         * <p>The deduction module that is supported by the security score feature. Valid values:</p>
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
         * <p>20</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The deduction items of the deduction module.</p>
         */
        @NameInMap("SecurityScoreItemList")
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList> securityScoreItemList;

        /**
         * <p>The description of the deduction module.</p>
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
