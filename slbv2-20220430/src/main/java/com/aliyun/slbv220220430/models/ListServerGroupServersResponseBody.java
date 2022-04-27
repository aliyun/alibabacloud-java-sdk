// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slbv220220430.models;

import com.aliyun.tea.*;

public class ListServerGroupServersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListServerGroupServersResponseBodyData data;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListServerGroupServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupServersResponseBody self = new ListServerGroupServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServerGroupServersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListServerGroupServersResponseBody setData(ListServerGroupServersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListServerGroupServersResponseBodyData getData() {
        return this.data;
    }

    public ListServerGroupServersResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListServerGroupServersResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListServerGroupServersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListServerGroupServersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServerGroupServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServerGroupServersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListServerGroupServersResponseBodyDataServers extends TeaModel {
        // 服务器描述信息
        @NameInMap("Description")
        public String description;

        // 服务器端口
        @NameInMap("Port")
        public Integer port;

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

        public static ListServerGroupServersResponseBodyDataServers build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupServersResponseBodyDataServers self = new ListServerGroupServersResponseBodyDataServers();
            return TeaModel.build(map, self);
        }

        public ListServerGroupServersResponseBodyDataServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListServerGroupServersResponseBodyDataServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListServerGroupServersResponseBodyDataServers setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        public ListServerGroupServersResponseBodyDataServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public ListServerGroupServersResponseBodyDataServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public ListServerGroupServersResponseBodyDataServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public ListServerGroupServersResponseBodyDataServers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListServerGroupServersResponseBodyDataServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public ListServerGroupServersResponseBodyDataServers setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListServerGroupServersResponseBodyData extends TeaModel {
        @NameInMap("MaxResults")
        public Integer maxResults;

        @NameInMap("NextToken")
        public String nextToken;

        @NameInMap("Servers")
        public java.util.List<ListServerGroupServersResponseBodyDataServers> servers;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListServerGroupServersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupServersResponseBodyData self = new ListServerGroupServersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServerGroupServersResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListServerGroupServersResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListServerGroupServersResponseBodyData setServers(java.util.List<ListServerGroupServersResponseBodyDataServers> servers) {
            this.servers = servers;
            return this;
        }
        public java.util.List<ListServerGroupServersResponseBodyDataServers> getServers() {
            return this.servers;
        }

        public ListServerGroupServersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
