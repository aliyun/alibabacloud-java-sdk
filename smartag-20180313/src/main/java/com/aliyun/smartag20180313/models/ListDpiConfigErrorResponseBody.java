// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiConfigErrorResponseBody extends TeaModel {
    @NameInMap("DpiConfigError")
    public java.util.List<ListDpiConfigErrorResponseBodyDpiConfigError> dpiConfigError;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DpiGroupIds")
        public java.util.List<String> dpiGroupIds;

        @NameInMap("DpiSignatureIds")
        public java.util.List<String> dpiSignatureIds;

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
        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("RuleConfigErrorList")
        public java.util.List<ListDpiConfigErrorResponseBodyDpiConfigErrorRuleConfigErrorList> ruleConfigErrorList;

        @NameInMap("SN")
        public String SN;

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
