// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSClientsResponseBody extends TeaModel {
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

    @NameInMap("List")
    public java.util.List<QueryTSClientsResponseBodyList> list;

    public static QueryTSClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSClientsResponseBody self = new QueryTSClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSClientsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSClientsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSClientsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSClientsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSClientsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTSClientsResponseBody setList(java.util.List<QueryTSClientsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSClientsResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSClientsResponseBodyList extends TeaModel {
        @NameInMap("App")
        public String app;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Version")
        public String version;

        @NameInMap("Zone")
        public String zone;

        public static QueryTSClientsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSClientsResponseBodyList self = new QueryTSClientsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSClientsResponseBodyList setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public QueryTSClientsResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTSClientsResponseBodyList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryTSClientsResponseBodyList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public QueryTSClientsResponseBodyList setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

    }

}
