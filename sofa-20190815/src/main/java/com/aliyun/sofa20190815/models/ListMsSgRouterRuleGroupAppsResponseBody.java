// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgRouterRuleGroupAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("AppNames")
    public java.util.List<ListMsSgRouterRuleGroupAppsResponseBodyAppNames> appNames;

    public static ListMsSgRouterRuleGroupAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgRouterRuleGroupAppsResponseBody self = new ListMsSgRouterRuleGroupAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgRouterRuleGroupAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgRouterRuleGroupAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgRouterRuleGroupAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgRouterRuleGroupAppsResponseBody setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListMsSgRouterRuleGroupAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgRouterRuleGroupAppsResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListMsSgRouterRuleGroupAppsResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListMsSgRouterRuleGroupAppsResponseBody setAppNames(java.util.List<ListMsSgRouterRuleGroupAppsResponseBodyAppNames> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<ListMsSgRouterRuleGroupAppsResponseBodyAppNames> getAppNames() {
        return this.appNames;
    }

    public static class ListMsSgRouterRuleGroupAppsResponseBodyAppNames extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("RuleNum")
        public Long ruleNum;

        public static ListMsSgRouterRuleGroupAppsResponseBodyAppNames build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgRouterRuleGroupAppsResponseBodyAppNames self = new ListMsSgRouterRuleGroupAppsResponseBodyAppNames();
            return TeaModel.build(map, self);
        }

        public ListMsSgRouterRuleGroupAppsResponseBodyAppNames setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgRouterRuleGroupAppsResponseBodyAppNames setRuleNum(Long ruleNum) {
            this.ruleNum = ruleNum;
            return this;
        }
        public Long getRuleNum() {
            return this.ruleNum;
        }

    }

}
