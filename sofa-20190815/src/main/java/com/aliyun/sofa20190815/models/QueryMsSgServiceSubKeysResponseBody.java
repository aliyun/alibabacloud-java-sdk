// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubKeysResponseBody extends TeaModel {
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
    public java.util.List<QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos> simpleServiceInfos;

    public static QueryMsSgServiceSubKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubKeysResponseBody self = new QueryMsSgServiceSubKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgServiceSubKeysResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgServiceSubKeysResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgServiceSubKeysResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsSgServiceSubKeysResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServiceSubKeysResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsSgServiceSubKeysResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsSgServiceSubKeysResponseBody setSimpleServiceInfos(java.util.List<QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos> simpleServiceInfos) {
        this.simpleServiceInfos = simpleServiceInfos;
        return this;
    }
    public java.util.List<QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos> getSimpleServiceInfos() {
        return this.simpleServiceInfos;
    }

    public static class QueryMsSgServiceSubKeysResponseBodySimpleServiceInfosAppInfos extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Url")
        public String url;

        public static QueryMsSgServiceSubKeysResponseBodySimpleServiceInfosAppInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServiceSubKeysResponseBodySimpleServiceInfosAppInfos self = new QueryMsSgServiceSubKeysResponseBodySimpleServiceInfosAppInfos();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServiceSubKeysResponseBodySimpleServiceInfosAppInfos setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsSgServiceSubKeysResponseBodySimpleServiceInfosAppInfos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos extends TeaModel {
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
        public java.util.List<QueryMsSgServiceSubKeysResponseBodySimpleServiceInfosAppInfos> appInfos;

        public static QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos self = new QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos setPubCount(Long pubCount) {
            this.pubCount = pubCount;
            return this;
        }
        public Long getPubCount() {
            return this.pubCount;
        }

        public QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos setSubCount(Long subCount) {
            this.subCount = subCount;
            return this;
        }
        public Long getSubCount() {
            return this.subCount;
        }

        public QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos setPubApp(java.util.List<String> pubApp) {
            this.pubApp = pubApp;
            return this;
        }
        public java.util.List<String> getPubApp() {
            return this.pubApp;
        }

        public QueryMsSgServiceSubKeysResponseBodySimpleServiceInfos setAppInfos(java.util.List<QueryMsSgServiceSubKeysResponseBodySimpleServiceInfosAppInfos> appInfos) {
            this.appInfos = appInfos;
            return this;
        }
        public java.util.List<QueryMsSgServiceSubKeysResponseBodySimpleServiceInfosAppInfos> getAppInfos() {
            return this.appInfos;
        }

    }

}
