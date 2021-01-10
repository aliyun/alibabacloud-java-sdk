// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAllMsSgCircuitBreakerRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("RuleModels")
    public java.util.List<ListAllMsSgCircuitBreakerRulesResponseBodyRuleModels> ruleModels;

    public static ListAllMsSgCircuitBreakerRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAllMsSgCircuitBreakerRulesResponseBody self = new ListAllMsSgCircuitBreakerRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAllMsSgCircuitBreakerRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAllMsSgCircuitBreakerRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAllMsSgCircuitBreakerRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAllMsSgCircuitBreakerRulesResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListAllMsSgCircuitBreakerRulesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAllMsSgCircuitBreakerRulesResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListAllMsSgCircuitBreakerRulesResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListAllMsSgCircuitBreakerRulesResponseBody setRuleModels(java.util.List<ListAllMsSgCircuitBreakerRulesResponseBodyRuleModels> ruleModels) {
        this.ruleModels = ruleModels;
        return this;
    }
    public java.util.List<ListAllMsSgCircuitBreakerRulesResponseBodyRuleModels> getRuleModels() {
        return this.ruleModels;
    }

    public static class ListAllMsSgCircuitBreakerRulesResponseBodyRuleModels extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("RulesNum")
        public Long rulesNum;

        public static ListAllMsSgCircuitBreakerRulesResponseBodyRuleModels build(java.util.Map<String, ?> map) throws Exception {
            ListAllMsSgCircuitBreakerRulesResponseBodyRuleModels self = new ListAllMsSgCircuitBreakerRulesResponseBodyRuleModels();
            return TeaModel.build(map, self);
        }

        public ListAllMsSgCircuitBreakerRulesResponseBodyRuleModels setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAllMsSgCircuitBreakerRulesResponseBodyRuleModels setRulesNum(Long rulesNum) {
            this.rulesNum = rulesNum;
            return this;
        }
        public Long getRulesNum() {
            return this.rulesNum;
        }

    }

}
