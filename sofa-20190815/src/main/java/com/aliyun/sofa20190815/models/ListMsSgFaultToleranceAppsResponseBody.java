// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgFaultToleranceAppsResponseBody extends TeaModel {
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

    @NameInMap("AppModels")
    public java.util.List<ListMsSgFaultToleranceAppsResponseBodyAppModels> appModels;

    public static ListMsSgFaultToleranceAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgFaultToleranceAppsResponseBody self = new ListMsSgFaultToleranceAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMsSgFaultToleranceAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMsSgFaultToleranceAppsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMsSgFaultToleranceAppsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMsSgFaultToleranceAppsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListMsSgFaultToleranceAppsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMsSgFaultToleranceAppsResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public ListMsSgFaultToleranceAppsResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public ListMsSgFaultToleranceAppsResponseBody setAppModels(java.util.List<ListMsSgFaultToleranceAppsResponseBodyAppModels> appModels) {
        this.appModels = appModels;
        return this;
    }
    public java.util.List<ListMsSgFaultToleranceAppsResponseBodyAppModels> getAppModels() {
        return this.appModels;
    }

    public static class ListMsSgFaultToleranceAppsResponseBodyAppModels extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("RulesNum")
        public Long rulesNum;

        public static ListMsSgFaultToleranceAppsResponseBodyAppModels build(java.util.Map<String, ?> map) throws Exception {
            ListMsSgFaultToleranceAppsResponseBodyAppModels self = new ListMsSgFaultToleranceAppsResponseBodyAppModels();
            return TeaModel.build(map, self);
        }

        public ListMsSgFaultToleranceAppsResponseBodyAppModels setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMsSgFaultToleranceAppsResponseBodyAppModels setRulesNum(Long rulesNum) {
            this.rulesNum = rulesNum;
            return this;
        }
        public Long getRulesNum() {
            return this.rulesNum;
        }

    }

}
