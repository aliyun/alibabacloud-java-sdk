// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigClientsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Clients")
    public java.util.List<QueryMsConfigClientsResponseBodyClients> clients;

    public static QueryMsConfigClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigClientsResponseBody self = new QueryMsConfigClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsConfigClientsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsConfigClientsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsConfigClientsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryMsConfigClientsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsConfigClientsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryMsConfigClientsResponseBody setClients(java.util.List<QueryMsConfigClientsResponseBodyClients> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<QueryMsConfigClientsResponseBodyClients> getClients() {
        return this.clients;
    }

    public static class QueryMsConfigClientsResponseBodyClients extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Data")
        public String data;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("PushData")
        public String pushData;

        public static QueryMsConfigClientsResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            QueryMsConfigClientsResponseBodyClients self = new QueryMsConfigClientsResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public QueryMsConfigClientsResponseBodyClients setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryMsConfigClientsResponseBodyClients setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryMsConfigClientsResponseBodyClients setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryMsConfigClientsResponseBodyClients setPushData(String pushData) {
            this.pushData = pushData;
            return this;
        }
        public String getPushData() {
            return this.pushData;
        }

    }

}
