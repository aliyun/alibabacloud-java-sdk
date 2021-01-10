// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServicesResponseBody extends TeaModel {
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

    @NameInMap("SimpleServiceInfos")
    public java.util.List<QueryMsSgServicesResponseBodySimpleServiceInfos> simpleServiceInfos;

    public static QueryMsSgServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServicesResponseBody self = new QueryMsSgServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgServicesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgServicesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgServicesResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsSgServicesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServicesResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsSgServicesResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsSgServicesResponseBody setSimpleServiceInfos(java.util.List<QueryMsSgServicesResponseBodySimpleServiceInfos> simpleServiceInfos) {
        this.simpleServiceInfos = simpleServiceInfos;
        return this;
    }
    public java.util.List<QueryMsSgServicesResponseBodySimpleServiceInfos> getSimpleServiceInfos() {
        return this.simpleServiceInfos;
    }

    public static class QueryMsSgServicesResponseBodySimpleServiceInfosAppInfos extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Url")
        public String url;

        public static QueryMsSgServicesResponseBodySimpleServiceInfosAppInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServicesResponseBodySimpleServiceInfosAppInfos self = new QueryMsSgServicesResponseBodySimpleServiceInfosAppInfos();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServicesResponseBodySimpleServiceInfosAppInfos setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsSgServicesResponseBodySimpleServiceInfosAppInfos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMsSgServicesResponseBodySimpleServiceInfos extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("PubCount")
        public Long pubCount;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("SubCount")
        public Long subCount;

        @NameInMap("PubApp")
        public java.util.List<String> pubApp;

        @NameInMap("AppInfos")
        public java.util.List<QueryMsSgServicesResponseBodySimpleServiceInfosAppInfos> appInfos;

        public static QueryMsSgServicesResponseBodySimpleServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServicesResponseBodySimpleServiceInfos self = new QueryMsSgServicesResponseBodySimpleServiceInfos();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServicesResponseBodySimpleServiceInfos setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMsSgServicesResponseBodySimpleServiceInfos setPubCount(Long pubCount) {
            this.pubCount = pubCount;
            return this;
        }
        public Long getPubCount() {
            return this.pubCount;
        }

        public QueryMsSgServicesResponseBodySimpleServiceInfos setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public QueryMsSgServicesResponseBodySimpleServiceInfos setSubCount(Long subCount) {
            this.subCount = subCount;
            return this;
        }
        public Long getSubCount() {
            return this.subCount;
        }

        public QueryMsSgServicesResponseBodySimpleServiceInfos setPubApp(java.util.List<String> pubApp) {
            this.pubApp = pubApp;
            return this;
        }
        public java.util.List<String> getPubApp() {
            return this.pubApp;
        }

        public QueryMsSgServicesResponseBodySimpleServiceInfos setAppInfos(java.util.List<QueryMsSgServicesResponseBodySimpleServiceInfosAppInfos> appInfos) {
            this.appInfos = appInfos;
            return this;
        }
        public java.util.List<QueryMsSgServicesResponseBodySimpleServiceInfosAppInfos> getAppInfos() {
            return this.appInfos;
        }

    }

}
