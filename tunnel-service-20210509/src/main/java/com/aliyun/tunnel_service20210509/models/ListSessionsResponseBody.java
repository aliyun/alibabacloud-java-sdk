// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class ListSessionsResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListSessionsResponseBodyData data;

    // 错误详情
    @NameInMap("message")
    public String message;

    // 请求ID
    @NameInMap("requestId")
    public String requestId;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    public static ListSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSessionsResponseBody self = new ListSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSessionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSessionsResponseBody setData(ListSessionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSessionsResponseBodyData getData() {
        return this.data;
    }

    public ListSessionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSessionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSessionsResponseBodyDataSessions extends TeaModel {
        // 本地实例ID
        @NameInMap("localInstanceId")
        public String localInstanceId;

        // 代理实例ID
        @NameInMap("proxyId")
        public String proxyId;

        // 代理实例公网IP
        @NameInMap("proxyIp")
        public String proxyIp;

        // 代理实例端口
        @NameInMap("proxyRemotePort")
        public String proxyRemotePort;

        // 远端实例ID
        @NameInMap("remoteInstanceId")
        public String remoteInstanceId;

        // session ID
        @NameInMap("sessionId")
        public String sessionId;

        // session 状态
        @NameInMap("status")
        public String status;

        // session 名字
        @NameInMap("sessionName")
        public String sessionName;

        public static ListSessionsResponseBodyDataSessions build(java.util.Map<String, ?> map) throws Exception {
            ListSessionsResponseBodyDataSessions self = new ListSessionsResponseBodyDataSessions();
            return TeaModel.build(map, self);
        }

        public ListSessionsResponseBodyDataSessions setLocalInstanceId(String localInstanceId) {
            this.localInstanceId = localInstanceId;
            return this;
        }
        public String getLocalInstanceId() {
            return this.localInstanceId;
        }

        public ListSessionsResponseBodyDataSessions setProxyId(String proxyId) {
            this.proxyId = proxyId;
            return this;
        }
        public String getProxyId() {
            return this.proxyId;
        }

        public ListSessionsResponseBodyDataSessions setProxyIp(String proxyIp) {
            this.proxyIp = proxyIp;
            return this;
        }
        public String getProxyIp() {
            return this.proxyIp;
        }

        public ListSessionsResponseBodyDataSessions setProxyRemotePort(String proxyRemotePort) {
            this.proxyRemotePort = proxyRemotePort;
            return this;
        }
        public String getProxyRemotePort() {
            return this.proxyRemotePort;
        }

        public ListSessionsResponseBodyDataSessions setRemoteInstanceId(String remoteInstanceId) {
            this.remoteInstanceId = remoteInstanceId;
            return this;
        }
        public String getRemoteInstanceId() {
            return this.remoteInstanceId;
        }

        public ListSessionsResponseBodyDataSessions setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListSessionsResponseBodyDataSessions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSessionsResponseBodyDataSessions setSessionName(String sessionName) {
            this.sessionName = sessionName;
            return this;
        }
        public String getSessionName() {
            return this.sessionName;
        }

    }

    public static class ListSessionsResponseBodyData extends TeaModel {
        // 是否有下一页
        @NameInMap("hasNextPage")
        public Boolean hasNextPage;

        // 下一页
        @NameInMap("nextPageNum")
        public Integer nextPageNum;

        // 下一页的session个数限制
        @NameInMap("nextPageSize")
        public Integer nextPageSize;

        @NameInMap("sessions")
        public java.util.List<ListSessionsResponseBodyDataSessions> sessions;

        // session 总个数
        @NameInMap("total")
        public Integer total;

        public static ListSessionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSessionsResponseBodyData self = new ListSessionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSessionsResponseBodyData setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public ListSessionsResponseBodyData setNextPageNum(Integer nextPageNum) {
            this.nextPageNum = nextPageNum;
            return this;
        }
        public Integer getNextPageNum() {
            return this.nextPageNum;
        }

        public ListSessionsResponseBodyData setNextPageSize(Integer nextPageSize) {
            this.nextPageSize = nextPageSize;
            return this;
        }
        public Integer getNextPageSize() {
            return this.nextPageSize;
        }

        public ListSessionsResponseBodyData setSessions(java.util.List<ListSessionsResponseBodyDataSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<ListSessionsResponseBodyDataSessions> getSessions() {
            return this.sessions;
        }

        public ListSessionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
