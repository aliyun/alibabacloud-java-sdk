// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusResponseBody extends TeaModel {
    /**
     * <p>The health check status of the server groups that are associated with the listener.</p>
     */
    @NameInMap("ListenerHealthStatus")
    public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> listenerHealthStatus;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>- If **NextToken** is empty, it indicates that no next query is to be sent.</p>
     * <p>- If a value of **NextToken** is returned, the value is the token used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetListenerHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListenerHealthStatusResponseBody self = new GetListenerHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListenerHealthStatusResponseBody setListenerHealthStatus(java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> listenerHealthStatus) {
        this.listenerHealthStatus = listenerHealthStatus;
        return this;
    }
    public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> getListenerHealthStatus() {
        return this.listenerHealthStatus;
    }

    public GetListenerHealthStatusResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetListenerHealthStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetListenerHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListenerHealthStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason extends TeaModel {
        /**
         * <p>The reason why the **status** is abnormal. Valid values:</p>
         * <br>
         * <p>*   **CONNECT_TIMEOUT**: The NLB instance failed to connect to the backend server within the specified period of time.</p>
         * <p>*   **CONNECT_FAILED**: The NLB instance failed to connect to the backend server.</p>
         * <p>*   **RECV_RESPONSE_TIMEOUT**: The NLB instance failed to receive a response from the backend server within the specified period of time.</p>
         * <p>*   **CONNECT_INTERRUPT**: The connection between the health check and the backend servers was interrupted.</p>
         * <p>*   **HTTP_CODE_NOT_MATCH**: The HTTP status code from the backend servers was not the expected one.</p>
         * <p>*   **HTTP_INVALID_HEADER**: The format of the response from the backend servers is invalid.</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers extends TeaModel {
        /**
         * <p>The backend port.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The cause of the health check failure.</p>
         */
        @NameInMap("Reason")
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason reason;

        /**
         * <p>The ID of the backend server.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address of the backend server.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        /**
         * <p>The health check status. Valid values:</p>
         * <br>
         * <p>*   **Initial**: indicates that health checks are configured for the NLB instance, but no data was found.</p>
         * <p>*   **Unhealthy**: indicates that the backend server consecutively fails health checks.</p>
         * <p>*   **Unused**: indicates that the weight of the backend server is 0.</p>
         * <p>*   **Unavailable**: indicates that health checks are disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setReason(GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason reason) {
            this.reason = reason;
            return this;
        }
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServersReason getReason() {
            return this.reason;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos extends TeaModel {
        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: enabled</p>
         * <p>*   **false**: disabled</p>
         */
        @NameInMap("HeathCheckEnabled")
        public Boolean heathCheckEnabled;

        /**
         * <p>A list of unhealthy backend servers.</p>
         */
        @NameInMap("NonNormalServers")
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers> nonNormalServers;

        /**
         * <p>The ID of the server group.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setHeathCheckEnabled(Boolean heathCheckEnabled) {
            this.heathCheckEnabled = heathCheckEnabled;
            return this;
        }
        public Boolean getHeathCheckEnabled() {
            return this.heathCheckEnabled;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setNonNormalServers(java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers> nonNormalServers) {
            this.nonNormalServers = nonNormalServers;
            return this;
        }
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosNonNormalServers> getNonNormalServers() {
            return this.nonNormalServers;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatus extends TeaModel {
        /**
         * <p>The ID of the listener of the NLB instance.</p>
         */
        @NameInMap("ListenerId")
        public String listenerId;

        /**
         * <p>The listening port.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The listening protocol. Valid values: **TCP**, **UDP**, and **TCPSSL**.</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The information about the server groups.</p>
         */
        @NameInMap("ServerGroupInfos")
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos> serverGroupInfos;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatus build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatus self = new GetListenerHealthStatusResponseBodyListenerHealthStatus();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatus setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatus setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatus setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatus setServerGroupInfos(java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos> serverGroupInfos) {
            this.serverGroupInfos = serverGroupInfos;
            return this;
        }
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos> getServerGroupInfos() {
            return this.serverGroupInfos;
        }

    }

}
