// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecureSuggestionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The suggestions on how to handle the risks.</p>
     */
    @NameInMap("Suggestions")
    public java.util.List<DescribeSecureSuggestionResponseBodySuggestions> suggestions;

    /**
     * <p>The total number of unhandled security risks.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSecureSuggestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecureSuggestionResponseBody self = new DescribeSecureSuggestionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecureSuggestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecureSuggestionResponseBody setSuggestions(java.util.List<DescribeSecureSuggestionResponseBodySuggestions> suggestions) {
        this.suggestions = suggestions;
        return this;
    }
    public java.util.List<DescribeSecureSuggestionResponseBodySuggestions> getSuggestions() {
        return this.suggestions;
    }

    public DescribeSecureSuggestionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSecureSuggestionResponseBodySuggestionsDetail extends TeaModel {
        /**
         * <p>The description of the suggestion.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The sub-type of the unhandled risk. Valid values:</p>
         * <br>
         * <p>*   **ALARM_HIGH**: Unhandled Urgency Alerts</p>
         * <p>*   **ALARM_MEDIUM**: Unhandled Warning Alerts</p>
         * <p>*   **ALARM_LOW**: Unhandled Reminder Alerts</p>
         * <p>*   **VUL_EMR_UNCHECK**: Unchecked Urgent Vulnerabilities</p>
         * <p>*   **VUL_EMR_UNFIX**: Unfixed Urgent Vulnerabilities</p>
         * <p>*   **VUL_WIN**: Unfixed Windows Server Vulnerabilities</p>
         * <p>*   **VUL_LINUX**: Unfixed Linux Server Vulnerabilities</p>
         * <p>*   **VUL_CMS**: Unfixed CMS Vulnerabilities</p>
         * <p>*   **ACCESSKEY_LEAK**: AccessKey Leakage Risks</p>
         * <p>*   **HC_WARN**: Baseline Risks</p>
         * <p>*   **HC_WEAK_EXPLOIT_WARN**: There is a risk of weak passwords exposed by the public network.</p>
         * <p>*   **HC_WEAK_PASSWORD_WARN**: Risk of weak password</p>
         * <p>*   **HC_HIGH_EXPLOIT_WARN**: There is a high risk of invasion</p>
         * <p>*   **HC_OTHER_WARN**: Security Configuration risk</p>
         * <p>*   **HC_DATABASE_WARN**: Database has security risks</p>
         * <p>*   **CLOUD_HC_SAS_OPEN**: Security protection has not been installed on the server</p>
         * <p>*   **CLOUD_HC_AEGIS_OFFLINE**: Server protection status is offline</p>
         * <p>*   **CLOUD_HC_ACCOUNT_DOUBLE_CHECK**: Two-Factor Authentication not Enabled for Primary Account</p>
         * <p>*   **CLOUD_HC_RDS**: RDS-database security policy failed, security risks</p>
         * <p>*   **CLOUD_HC_DDOS**: Risks in Anti-DDoS Pro Back-to-Origin Settings</p>
         * <p>*   **CLOUD_HC_HIGH_LEVEL**: Cloud product configuration has high risk</p>
         * <p>*   **CLOUD_HC_OTHER_LEVEL**: Cloud product configuration has medium and low risk risks</p>
         * <p>*   **OTHER_ATTACH**: Attacks</p>
         * <p>*   **OTHER_DATABASE_ATTACH**: Database has security risks</p>
         * <p>*   **REINFORCE_BASELINE**: Config Assessment</p>
         * <p>*   **REINFORCE_SUSPICIOUS**: Antivirus</p>
         * <p>*   **REINFORCE_ANALYSIS**: Log Analysis</p>
         * <p>*   **REINFORCE_AK_LEAK**: AccessKey Leaked Intelligence Detection</p>
         * <p>*   **REINFORCE_WEB_LOCK**: Website tamper-proofing capability not configured</p>
         * <p>*   **REINFORCE_BRUTE_FORCE**: Anti brute force cracking</p>
         * <p>*   **REINFORCE_XPRESS_INSTALL**: One-click client installation</p>
         * <p>*   **REINFORCE_RANSOMWARE**: Enable anti-extortion strategy</p>
         * <p>*   **REINFORCE_UNI_RANSOMWARE**: Anti-ransomware for Databases</p>
         * <p>*   **REINFORCE_VIRUS_SCHEDULE_SCAN**: Periodic virus scan policies not configured</p>
         * <p>*   **REINFORCE_IMAGE_REPO_SCAN**: No container image scan range configured</p>
         * <p>*   **REINFORCE_IMAGE_SCAN_TASK**: Image security scan</p>
         * <p>*   **REINFORCE_K8S_LOG_ANALYSIS**: Container K8s threat detection is disabled</p>
         * <p>*   **REINFORCE_CONTAINER_NETWORK**: Container Visualization</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The name of the unhandled risk.</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribeSecureSuggestionResponseBodySuggestionsDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecureSuggestionResponseBodySuggestionsDetail self = new DescribeSecureSuggestionResponseBodySuggestionsDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSecureSuggestionResponseBodySuggestionsDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecureSuggestionResponseBodySuggestionsDetail setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public DescribeSecureSuggestionResponseBodySuggestionsDetail setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeSecureSuggestionResponseBodySuggestions extends TeaModel {
        /**
         * <p>The details of the suggestion.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeSecureSuggestionResponseBodySuggestionsDetail> detail;

        /**
         * <p>The penalty point of a deduction item.</p>
         */
        @NameInMap("Points")
        public Integer points;

        /**
         * <p>The type of the unhandled risk. Valid values:</p>
         * <br>
         * <p>*   **SS_REINFORCE**: missing configuration of key features, such as malicious behavior defense</p>
         * <p>*   **SS_ALARM**: unhandled alerts</p>
         * <p>*   **SS_VUL**: unfixed vulnerabilities</p>
         * <p>*   **SS_HC**: baseline risks</p>
         * <p>*   **SS_AK**: AccessKey pair leaks</p>
         * <p>*   **SS_CLOUD_HC**: configuration risks of cloud services</p>
         * <p>*   **OTHER**: others</p>
         */
        @NameInMap("SuggestType")
        public String suggestType;

        public static DescribeSecureSuggestionResponseBodySuggestions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecureSuggestionResponseBodySuggestions self = new DescribeSecureSuggestionResponseBodySuggestions();
            return TeaModel.build(map, self);
        }

        public DescribeSecureSuggestionResponseBodySuggestions setDetail(java.util.List<DescribeSecureSuggestionResponseBodySuggestionsDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSecureSuggestionResponseBodySuggestionsDetail> getDetail() {
            return this.detail;
        }

        public DescribeSecureSuggestionResponseBodySuggestions setPoints(Integer points) {
            this.points = points;
            return this;
        }
        public Integer getPoints() {
            return this.points;
        }

        public DescribeSecureSuggestionResponseBodySuggestions setSuggestType(String suggestType) {
            this.suggestType = suggestType;
            return this;
        }
        public String getSuggestType() {
            return this.suggestType;
        }

    }

}
