// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServicePubKeysResponseBody extends TeaModel {
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
    public java.util.List<QueryMsSgServicePubKeysResponseBodySimpleServiceInfos> simpleServiceInfos;

    public static QueryMsSgServicePubKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServicePubKeysResponseBody self = new QueryMsSgServicePubKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServicePubKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgServicePubKeysResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgServicePubKeysResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgServicePubKeysResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsSgServicePubKeysResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServicePubKeysResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsSgServicePubKeysResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsSgServicePubKeysResponseBody setSimpleServiceInfos(java.util.List<QueryMsSgServicePubKeysResponseBodySimpleServiceInfos> simpleServiceInfos) {
        this.simpleServiceInfos = simpleServiceInfos;
        return this;
    }
    public java.util.List<QueryMsSgServicePubKeysResponseBodySimpleServiceInfos> getSimpleServiceInfos() {
        return this.simpleServiceInfos;
    }

    public static class QueryMsSgServicePubKeysResponseBodySimpleServiceInfosAppInfos extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Url")
        public String url;

        public static QueryMsSgServicePubKeysResponseBodySimpleServiceInfosAppInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServicePubKeysResponseBodySimpleServiceInfosAppInfos self = new QueryMsSgServicePubKeysResponseBodySimpleServiceInfosAppInfos();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServicePubKeysResponseBodySimpleServiceInfosAppInfos setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsSgServicePubKeysResponseBodySimpleServiceInfosAppInfos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMsSgServicePubKeysResponseBodySimpleServiceInfos extends TeaModel {
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
        public java.util.List<QueryMsSgServicePubKeysResponseBodySimpleServiceInfosAppInfos> appInfos;

        public static QueryMsSgServicePubKeysResponseBodySimpleServiceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServicePubKeysResponseBodySimpleServiceInfos self = new QueryMsSgServicePubKeysResponseBodySimpleServiceInfos();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServicePubKeysResponseBodySimpleServiceInfos setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMsSgServicePubKeysResponseBodySimpleServiceInfos setPubCount(Long pubCount) {
            this.pubCount = pubCount;
            return this;
        }
        public Long getPubCount() {
            return this.pubCount;
        }

        public QueryMsSgServicePubKeysResponseBodySimpleServiceInfos setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public QueryMsSgServicePubKeysResponseBodySimpleServiceInfos setSubCount(Long subCount) {
            this.subCount = subCount;
            return this;
        }
        public Long getSubCount() {
            return this.subCount;
        }

        public QueryMsSgServicePubKeysResponseBodySimpleServiceInfos setPubApp(java.util.List<String> pubApp) {
            this.pubApp = pubApp;
            return this;
        }
        public java.util.List<String> getPubApp() {
            return this.pubApp;
        }

        public QueryMsSgServicePubKeysResponseBodySimpleServiceInfos setAppInfos(java.util.List<QueryMsSgServicePubKeysResponseBodySimpleServiceInfosAppInfos> appInfos) {
            this.appInfos = appInfos;
            return this;
        }
        public java.util.List<QueryMsSgServicePubKeysResponseBodySimpleServiceInfosAppInfos> getAppInfos() {
            return this.appInfos;
        }

    }

}
