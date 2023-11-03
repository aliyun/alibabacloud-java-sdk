// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSecurityScoreRuleResponseBody extends TeaModel {
    /**
     * <p>The status of the custom settings of the security score feature.</p>
     * <br>
     * <p>*   true: enabled</p>
     * <p>*   false: disabled</p>
     */
    @NameInMap("EnableStatus")
    public Boolean enableStatus;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of deducted modules that are supported by the security score feature.</p>
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

    public GetSecurityScoreRuleResponseBody setSecurityScoreRuleList(java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleList> securityScoreRuleList) {
        this.securityScoreRuleList = securityScoreRuleList;
        return this;
    }
    public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static class GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList extends TeaModel {
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
         * <p>    *   REINFORCE_SUSPICIOUS: The antivirus feature is disabled.</p>
         * <p>    *   RANSOMWARE: The anti-ransomware policy is disabled.</p>
         * <p>    *   WEB_LOCK: The web tamper proofing feature is disabled.</p>
         * <p>    *   VIRUS_SCHEDULE_SCAN: The periodic virus scan policy is disabled.</p>
         * <p>    *   IMAGE_REPO_SCAN: The range of container image scan is not configured.</p>
         * <p>    *   IMAGE_SCAN_TASK: The feature of one-click scan of container images for security risks is not performed.</p>
         * <br>
         * <p>*   SS_ALARM: unhandled alert.</p>
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
         * <p>    *   ERM_UNFIX: An unfixed urgent vulnerability is detected.</p>
         * <p>    *   ERM_UNCHECK: An undetected urgent vulnerability exists.</p>
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

        /**
         * <p>The description of the deduction item in a deduction module.</p>
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
         * <p>The deducted module that is supported by the security score feature. Valid values:</p>
         * <br>
         * <p>*   SS_REINFORCE: issue in key feature configuration</p>
         * <p>*   SS_ALARM: unhandled alert</p>
         * <p>*   SS_VUL: unfixed vulnerability</p>
         * <p>*   SS_HC: baseline risk</p>
         * <p>*   SS_CLOUD_HC: risk item of configuration assessment</p>
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
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList> securityScoreItemList;

        /**
         * <p>The description of the deduction module.</p>
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
