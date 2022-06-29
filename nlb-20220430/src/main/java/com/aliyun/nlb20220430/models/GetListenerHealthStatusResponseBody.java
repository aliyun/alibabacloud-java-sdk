// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ListenerHealthStatus")
    public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatus> listenerHealthStatus;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetListenerHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListenerHealthStatusResponseBody self = new GetListenerHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListenerHealthStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetListenerHealthStatusResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetListenerHealthStatusResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetListenerHealthStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public GetListenerHealthStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public GetListenerHealthStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetListenerHealthStatusResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel extends TeaModel {
        // 服务器描述信息
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        // 服务器端口
        @NameInMap("Port")
        public Integer port;

        // 服务器所属的服务器组ID
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        // 服务器id
        @NameInMap("ServerId")
        public String serverId;

        // 服务器ip
        @NameInMap("ServerIp")
        public String serverIp;

        // 服务器类型
        @NameInMap("ServerType")
        public String serverType;

        // 服务器的状态
        @NameInMap("Status")
        public String status;

        // 后端权重
        @NameInMap("Weight")
        public Integer weight;

        // 服务器对应的zoneId
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel extends TeaModel {
        @NameInMap("ActualReturnCode")
        public String actualReturnCode;

        @NameInMap("ExpectReturnCode")
        public String expectReturnCode;

        // CONNECT_TIMEOUT, CONNECT_FAILED, RECV_RESPONSE_FAILED, RECV_RESPONSE_TIMEOUT, SEND_REQUEST_FAILED, SEND_REQUEST_TIMEOUT, RESPONSE_FORMAT_ERROR, RESPONSE_MISMATCH
        @NameInMap("ReasonCode")
        public String reasonCode;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel setActualReturnCode(String actualReturnCode) {
            this.actualReturnCode = actualReturnCode;
            return this;
        }
        public String getActualReturnCode() {
            return this.actualReturnCode;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel setExpectReturnCode(String expectReturnCode) {
            this.expectReturnCode = expectReturnCode;
            return this;
        }
        public String getExpectReturnCode() {
            return this.expectReturnCode;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers extends TeaModel {
        @NameInMap("BackendServerModel")
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel backendServerModel;

        @NameInMap("HealthCheckReasonModel")
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel healthCheckReasonModel;

        @NameInMap("Status")
        public String status;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers setBackendServerModel(GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel backendServerModel) {
            this.backendServerModel = backendServerModel;
            return this;
        }
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersBackendServerModel getBackendServerModel() {
            return this.backendServerModel;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers setHealthCheckReasonModel(GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel healthCheckReasonModel) {
            this.healthCheckReasonModel = healthCheckReasonModel;
            return this;
        }
        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServersHealthCheckReasonModel getHealthCheckReasonModel() {
            return this.healthCheckReasonModel;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos extends TeaModel {
        @NameInMap("AbnormalServers")
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers> abnormalServers;

        @NameInMap("HeathCheckEnabled")
        public Boolean heathCheckEnabled;

        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos build(java.util.Map<String, ?> map) throws Exception {
            GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos self = new GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos();
            return TeaModel.build(map, self);
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setAbnormalServers(java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers> abnormalServers) {
            this.abnormalServers = abnormalServers;
            return this;
        }
        public java.util.List<GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfosAbnormalServers> getAbnormalServers() {
            return this.abnormalServers;
        }

        public GetListenerHealthStatusResponseBodyListenerHealthStatusServerGroupInfos setHeathCheckEnabled(Boolean heathCheckEnabled) {
            this.heathCheckEnabled = heathCheckEnabled;
            return this;
        }
        public Boolean getHeathCheckEnabled() {
            return this.heathCheckEnabled;
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
        @NameInMap("ListenerId")
        public String listenerId;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

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
