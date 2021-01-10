// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmClientsResponseBody extends TeaModel {
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

    @NameInMap("ClientInfos")
    public java.util.List<QueryMsDrmClientsResponseBodyClientInfos> clientInfos;

    public static QueryMsDrmClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmClientsResponseBody self = new QueryMsDrmClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsDrmClientsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsDrmClientsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsDrmClientsResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsDrmClientsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsDrmClientsResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsDrmClientsResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsDrmClientsResponseBody setClientInfos(java.util.List<QueryMsDrmClientsResponseBodyClientInfos> clientInfos) {
        this.clientInfos = clientInfos;
        return this;
    }
    public java.util.List<QueryMsDrmClientsResponseBodyClientInfos> getClientInfos() {
        return this.clientInfos;
    }

    public static class QueryMsDrmClientsResponseBodyClientInfos extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("PushValue")
        public String pushValue;

        @NameInMap("Value")
        public String value;

        @NameInMap("Zone")
        public String zone;

        public static QueryMsDrmClientsResponseBodyClientInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMsDrmClientsResponseBodyClientInfos self = new QueryMsDrmClientsResponseBodyClientInfos();
            return TeaModel.build(map, self);
        }

        public QueryMsDrmClientsResponseBodyClientInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryMsDrmClientsResponseBodyClientInfos setPushValue(String pushValue) {
            this.pushValue = pushValue;
            return this;
        }
        public String getPushValue() {
            return this.pushValue;
        }

        public QueryMsDrmClientsResponseBodyClientInfos setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryMsDrmClientsResponseBodyClientInfos setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
