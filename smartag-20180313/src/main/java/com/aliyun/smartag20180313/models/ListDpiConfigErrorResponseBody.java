// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiConfigErrorResponseBody extends TeaModel {
    /**
     * <p>A list of DPI configuration errors.</p>
     */
    @NameInMap("DpiConfigError")
    public java.util.List<ListDpiConfigErrorResponseBodyDpiConfigError> dpiConfigError;

    /**
     * <p>The maximum number of configuration errors to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F47B5293-27B6-48EF-A9C6-E90A41449813</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of DPI configuration errors.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListDpiConfigErrorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDpiConfigErrorResponseBody self = new ListDpiConfigErrorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDpiConfigErrorResponseBody setDpiConfigError(java.util.List<ListDpiConfigErrorResponseBodyDpiConfigError> dpiConfigError) {
        this.dpiConfigError = dpiConfigError;
        return this;
    }
    public java.util.List<ListDpiConfigErrorResponseBodyDpiConfigError> getDpiConfigError() {
        return this.dpiConfigError;
    }

    public ListDpiConfigErrorResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDpiConfigErrorResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDpiConfigErrorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDpiConfigErrorResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList extends TeaModel {
        /**
         * <p>A list of IDs of application groups that have configuration errors.</p>
         */
        @NameInMap("DpiGroupIds")
        public java.util.List<String> dpiGroupIds;

        /**
         * <p>A list of IDs of applications that have configuration errors.</p>
         */
        @NameInMap("DpiSignatureIds")
        public java.util.List<String> dpiSignatureIds;

        /**
         * <p>The ID of the rule that is associated with the application that has a configuration error.</p>
         * <ul>
         * <li>If you query DPI configuration errors for Resource Access Management, this parameter indicates the ID of the Resource Access Management rule instance that has a configuration error.</li>
         * <li>If you query DPI configuration errors for a QoS policy, this parameter indicates the ID of the quintuple rule instance that has a configuration error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qospy-axud4s62gz632b****</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList build(java.util.Map<String, ?> map) throws Exception {
            ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList self = new ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList();
            return TeaModel.build(map, self);
        }

        public ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList setDpiGroupIds(java.util.List<String> dpiGroupIds) {
            this.dpiGroupIds = dpiGroupIds;
            return this;
        }
        public java.util.List<String> getDpiGroupIds() {
            return this.dpiGroupIds;
        }

        public ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList setDpiSignatureIds(java.util.List<String> dpiSignatureIds) {
            this.dpiSignatureIds = dpiSignatureIds;
            return this;
        }
        public java.util.List<String> getDpiSignatureIds() {
            return this.dpiSignatureIds;
        }

        public ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class ListDpiConfigErrorResponseBodyDpiConfigError extends TeaModel {
        /**
         * <p>The type of the configuration error.</p>
         * <ul>
         * <li>DeviceNotSupported: The Smart Access Gateway device does not support the DPI feature.</li>
         * <li>VersionNotSupported: The DPI version of the Smart Access Gateway device is too old.</li>
         * <li><strong>NotEnable</strong>: The DPI feature is disabled for the Smart Access Gateway device.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DeviceNotSupported</p>
         */
        @NameInMap("ErrorType")
        public String errorType;

        /**
         * <p>A list of rule configuration errors.</p>
         */
        @NameInMap("RuleConfigErrorList")
        public java.util.List<ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList> ruleConfigErrorList;

        /**
         * <p>The serial number of the Smart Access Gateway device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-2160808****</p>
         */
        @NameInMap("SN")
        public String SN;

        /**
         * <p>The ID of the Smart Access Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-1e8sgws6b133b8****</p>
         */
        @NameInMap("SmartAGId")
        public String smartAGId;

        public static ListDpiConfigErrorResponseBodyDpiConfigError build(java.util.Map<String, ?> map) throws Exception {
            ListDpiConfigErrorResponseBodyDpiConfigError self = new ListDpiConfigErrorResponseBodyDpiConfigError();
            return TeaModel.build(map, self);
        }

        public ListDpiConfigErrorResponseBodyDpiConfigError setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public ListDpiConfigErrorResponseBodyDpiConfigError setRuleConfigErrorList(java.util.List<ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList> ruleConfigErrorList) {
            this.ruleConfigErrorList = ruleConfigErrorList;
            return this;
        }
        public java.util.List<ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList> getRuleConfigErrorList() {
            return this.ruleConfigErrorList;
        }

        public ListDpiConfigErrorResponseBodyDpiConfigError setSN(String SN) {
            this.SN = SN;
            return this;
        }
        public String getSN() {
            return this.SN;
        }

        public ListDpiConfigErrorResponseBodyDpiConfigError setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

    }

}
