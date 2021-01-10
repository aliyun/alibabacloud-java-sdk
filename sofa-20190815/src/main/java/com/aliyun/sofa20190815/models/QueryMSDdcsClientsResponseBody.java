// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsClientsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Clients")
    public java.util.List<QueryMSDdcsClientsResponseBodyClients> clients;

    public static QueryMSDdcsClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsClientsResponseBody self = new QueryMSDdcsClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSDdcsClientsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMSDdcsClientsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMSDdcsClientsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryMSDdcsClientsResponseBody setClients(java.util.List<QueryMSDdcsClientsResponseBodyClients> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<QueryMSDdcsClientsResponseBodyClients> getClients() {
        return this.clients;
    }

    public static class QueryMSDdcsClientsResponseBodyClients extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Data")
        public String data;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("PushData")
        public String pushData;

        public static QueryMSDdcsClientsResponseBodyClients build(java.util.Map<String, ?> map) throws Exception {
            QueryMSDdcsClientsResponseBodyClients self = new QueryMSDdcsClientsResponseBodyClients();
            return TeaModel.build(map, self);
        }

        public QueryMSDdcsClientsResponseBodyClients setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryMSDdcsClientsResponseBodyClients setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public QueryMSDdcsClientsResponseBodyClients setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryMSDdcsClientsResponseBodyClients setPushData(String pushData) {
            this.pushData = pushData;
            return this;
        }
        public String getPushData() {
            return this.pushData;
        }

    }

}
