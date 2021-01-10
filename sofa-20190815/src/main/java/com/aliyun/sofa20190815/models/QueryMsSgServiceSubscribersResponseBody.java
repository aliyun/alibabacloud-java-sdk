// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsSgServiceSubscribersResponseBody extends TeaModel {
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

    @NameInMap("Subscribers")
    public java.util.List<QueryMsSgServiceSubscribersResponseBodySubscribers> subscribers;

    public static QueryMsSgServiceSubscribersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsSgServiceSubscribersResponseBody self = new QueryMsSgServiceSubscribersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsSgServiceSubscribersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsSgServiceSubscribersResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsSgServiceSubscribersResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsSgServiceSubscribersResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsSgServiceSubscribersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsSgServiceSubscribersResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsSgServiceSubscribersResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsSgServiceSubscribersResponseBody setSubscribers(java.util.List<QueryMsSgServiceSubscribersResponseBodySubscribers> subscribers) {
        this.subscribers = subscribers;
        return this;
    }
    public java.util.List<QueryMsSgServiceSubscribersResponseBodySubscribers> getSubscribers() {
        return this.subscribers;
    }

    public static class QueryMsSgServiceSubscribersResponseBodySubscribers extends TeaModel {
        @NameInMap("Alive")
        public Boolean alive;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CheckSum")
        public String checkSum;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Zone")
        public String zone;

        public static QueryMsSgServiceSubscribersResponseBodySubscribers build(java.util.Map<String, ?> map) throws Exception {
            QueryMsSgServiceSubscribersResponseBodySubscribers self = new QueryMsSgServiceSubscribersResponseBodySubscribers();
            return TeaModel.build(map, self);
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setAlive(Boolean alive) {
            this.alive = alive;
            return this;
        }
        public Boolean getAlive() {
            return this.alive;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setCheckSum(String checkSum) {
            this.checkSum = checkSum;
            return this;
        }
        public String getCheckSum() {
            return this.checkSum;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public QueryMsSgServiceSubscribersResponseBodySubscribers setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
