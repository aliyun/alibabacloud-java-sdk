// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiConfigErrorResponseBody extends TeaModel {
    /**
     * <p>The information about the configuration errors.</p>
     */
    @NameInMap("DpiConfigError")
    public java.util.List<ListDpiConfigErrorResponseBodyDpiConfigError> dpiConfigError;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that was used to query the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F47B5293-27B6-48EF-A9C6-E90A41449813</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>The IDs of the application groups that have configuration errors.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/196754.html">ListDpiGroups</a> operation to query application group IDs and information about the applications.</p>
         */
        @NameInMap("DpiGroupIds")
        public java.util.List<String> dpiGroupIds;

        /**
         * <p>The IDs of applications that have configuration errors.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/196630.html">ListDpiSignatures</a> operation to query application IDs and information about the applications.</p>
         */
        @NameInMap("DpiSignatureIds")
        public java.util.List<String> dpiSignatureIds;

        /**
         * <p>The IDs of rules that are applied to applications with configuration errors.</p>
         * <ul>
         * <li>If you make the request to query configuration errors of ACLs, the IDs of ACL rules that have configuration errors are returned.</li>
         * <li>If you make the request to query configuration errors of QoS polices, the IDs of the 5-tuples in the QoS polices that have configuration errors are returned.</li>
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
         * <p>The type of the configuration error. Valid values:</p>
         * <ul>
         * <li><strong>DeviceNotSupported</strong>: The SAG instance does not support the DPI feature.</li>
         * <li><strong>VersionNotSupported</strong>: The version of the DPI feature is outdated.</li>
         * <li><strong>NotEnable</strong>: The DPI feature is disabled on the SAG instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DeviceNotSupported</p>
         */
        @NameInMap("ErrorType")
        public String errorType;

        /**
         * <p>The information about the configuration errors.</p>
         */
        @NameInMap("RuleConfigErrorList")
        public java.util.List<ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList> ruleConfigErrorList;

        /**
         * <p>The serial number of the SAG instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-2160808****</p>
         */
        @NameInMap("SN")
        public String SN;

        /**
         * <p>The ID of the SAG instance.</p>
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
