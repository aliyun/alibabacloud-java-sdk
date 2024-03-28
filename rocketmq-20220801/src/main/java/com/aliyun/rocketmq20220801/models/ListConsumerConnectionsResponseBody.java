// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerConnectionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListConsumerConnectionsResponseBodyData data;

    @NameInMap("dynamicCode")
    public String dynamicCode;

    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListConsumerConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerConnectionsResponseBody self = new ListConsumerConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsumerConnectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsumerConnectionsResponseBody setData(ListConsumerConnectionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListConsumerConnectionsResponseBodyData getData() {
        return this.data;
    }

    public ListConsumerConnectionsResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public ListConsumerConnectionsResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListConsumerConnectionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListConsumerConnectionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListConsumerConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConsumerConnectionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListConsumerConnectionsResponseBodyDataConnections extends TeaModel {
        @NameInMap("clientId")
        public String clientId;

        @NameInMap("egressIp")
        public String egressIp;

        @NameInMap("hostname")
        public String hostname;

        @NameInMap("language")
        public String language;

        @NameInMap("messageModel")
        public String messageModel;

        @NameInMap("version")
        public String version;

        public static ListConsumerConnectionsResponseBodyDataConnections build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerConnectionsResponseBodyDataConnections self = new ListConsumerConnectionsResponseBodyDataConnections();
            return TeaModel.build(map, self);
        }

        public ListConsumerConnectionsResponseBodyDataConnections setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListConsumerConnectionsResponseBodyDataConnections setEgressIp(String egressIp) {
            this.egressIp = egressIp;
            return this;
        }
        public String getEgressIp() {
            return this.egressIp;
        }

        public ListConsumerConnectionsResponseBodyDataConnections setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public ListConsumerConnectionsResponseBodyDataConnections setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListConsumerConnectionsResponseBodyDataConnections setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public ListConsumerConnectionsResponseBodyDataConnections setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListConsumerConnectionsResponseBodyData extends TeaModel {
        @NameInMap("connections")
        public java.util.List<ListConsumerConnectionsResponseBodyDataConnections> connections;

        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("regionId")
        public String regionId;

        public static ListConsumerConnectionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsumerConnectionsResponseBodyData self = new ListConsumerConnectionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsumerConnectionsResponseBodyData setConnections(java.util.List<ListConsumerConnectionsResponseBodyDataConnections> connections) {
            this.connections = connections;
            return this;
        }
        public java.util.List<ListConsumerConnectionsResponseBodyDataConnections> getConnections() {
            return this.connections;
        }

        public ListConsumerConnectionsResponseBodyData setConsumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        public ListConsumerConnectionsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListConsumerConnectionsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
