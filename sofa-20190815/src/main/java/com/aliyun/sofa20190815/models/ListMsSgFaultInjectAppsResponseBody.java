// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultInjectAppsResponseBody extends TeaModel {
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
    public java.util.List<ListMsSgFaultInjectAppsResponseBodyAppNames> appNames;

    public static ListMsSgFaultInjectAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultInjectAppsResponseBody self = new ListMsSgFaultInjectAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultInjectAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgFaultInjectAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgFaultInjectAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgFaultInjectAppsResponseBody setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ListMsSgFaultInjectAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgFaultInjectAppsResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListMsSgFaultInjectAppsResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListMsSgFaultInjectAppsResponseBody setAppNames(java.util.List<ListMsSgFaultInjectAppsResponseBodyAppNames> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<ListMsSgFaultInjectAppsResponseBodyAppNames> getAppNames() {
        return this.appNames;
    }

    public static class ListMsSgFaultInjectAppsResponseBodyAppNames extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("RuleNum")
        public Long ruleNum;

        public static ListMsSgFaultInjectAppsResponseBodyAppNames build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultInjectAppsResponseBodyAppNames self = new ListMsSgFaultInjectAppsResponseBodyAppNames();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultInjectAppsResponseBodyAppNames setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgFaultInjectAppsResponseBodyAppNames setRuleNum(Long ruleNum) {
            this.ruleNum = ruleNum;
            return this;
        }
        public Long getRuleNum() {
            return this.ruleNum;
        }

    }

}
