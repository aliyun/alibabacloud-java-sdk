// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QuerySecurityCheckReportResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p> 200: The request was successful. Other codes (such as 500 or 400): An error occurred.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public QuerySecurityCheckReportResponseBodyData data;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySecurityCheckReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityCheckReportResponseBody self = new QuerySecurityCheckReportResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySecurityCheckReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySecurityCheckReportResponseBody setData(QuerySecurityCheckReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySecurityCheckReportResponseBodyData getData() {
        return this.data;
    }

    public QuerySecurityCheckReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySecurityCheckReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySecurityCheckReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySecurityCheckReportResponseBodyData extends TeaModel {
        /**
         * <p>The subscription status of the cloud security guide. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not subscribed </li>
         * <li><strong>1</strong>: subscribed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CloudSecurityGuide")
        public Integer cloudSecurityGuide;

        /**
         * <p>The number of pending items for configuration audit.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConfigCheckNumber")
        public Integer configCheckNumber;

        /**
         * <p>The number of pending items for security contacts.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ContactCheckNumber")
        public Integer contactCheckNumber;

        /**
         * <p>The number of risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RiskEventNumber")
        public Integer riskEventNumber;

        /**
         * <p>The number of pending items for Elastic Compute Service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SasCheckNumber")
        public Integer sasCheckNumber;

        /**
         * <p>The security check result status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no risk</li>
         * <li><strong>1</strong>: risks exist </li>
         * <li><strong>2</strong>: items to be optimized exist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SecurityStatus")
        public Integer securityStatus;

        /**
         * <p>The suggestion text.</p>
         * 
         * <strong>example:</strong>
         * <p>exist risk event。</p>
         */
        @NameInMap("SuggestionText")
        public String suggestionText;

        public static QuerySecurityCheckReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySecurityCheckReportResponseBodyData self = new QuerySecurityCheckReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySecurityCheckReportResponseBodyData setCloudSecurityGuide(Integer cloudSecurityGuide) {
            this.cloudSecurityGuide = cloudSecurityGuide;
            return this;
        }
        public Integer getCloudSecurityGuide() {
            return this.cloudSecurityGuide;
        }

        public QuerySecurityCheckReportResponseBodyData setConfigCheckNumber(Integer configCheckNumber) {
            this.configCheckNumber = configCheckNumber;
            return this;
        }
        public Integer getConfigCheckNumber() {
            return this.configCheckNumber;
        }

        public QuerySecurityCheckReportResponseBodyData setContactCheckNumber(Integer contactCheckNumber) {
            this.contactCheckNumber = contactCheckNumber;
            return this;
        }
        public Integer getContactCheckNumber() {
            return this.contactCheckNumber;
        }

        public QuerySecurityCheckReportResponseBodyData setRiskEventNumber(Integer riskEventNumber) {
            this.riskEventNumber = riskEventNumber;
            return this;
        }
        public Integer getRiskEventNumber() {
            return this.riskEventNumber;
        }

        public QuerySecurityCheckReportResponseBodyData setSasCheckNumber(Integer sasCheckNumber) {
            this.sasCheckNumber = sasCheckNumber;
            return this;
        }
        public Integer getSasCheckNumber() {
            return this.sasCheckNumber;
        }

        public QuerySecurityCheckReportResponseBodyData setSecurityStatus(Integer securityStatus) {
            this.securityStatus = securityStatus;
            return this;
        }
        public Integer getSecurityStatus() {
            return this.securityStatus;
        }

        public QuerySecurityCheckReportResponseBodyData setSuggestionText(String suggestionText) {
            this.suggestionText = suggestionText;
            return this;
        }
        public String getSuggestionText() {
            return this.suggestionText;
        }

    }

}
