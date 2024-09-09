// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerConnectionsResponseBody extends TeaModel {
    /**
     * <p>The returned error code.</p>
     * 
     * <strong>example:</strong>
     * <p>MissingPageNumber</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListConsumerConnectionsResponseBodyData data;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InstanceId</p>
     */
    @NameInMap("dynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("dynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The instance cannot be found.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A3620115-6F1F-5CFB-AA3F-BBD4853B2EC4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>172.17.135.197@17392#1936705963#551717232#9873695589062458</p>
         */
        @NameInMap("clientId")
        public String clientId;

        /**
         * <p>Host IP/Public IP</p>
         * 
         * <strong>example:</strong>
         * <p>xx.xx.xx.xx</p>
         */
        @NameInMap("egressIp")
        public String egressIp;

        /**
         * <p>The <code>hostname</code> of the cloud-native box.</p>
         * 
         * <strong>example:</strong>
         * <p>vos</p>
         */
        @NameInMap("hostname")
        public String hostname;

        /**
         * <p>The language of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <p>Consumption Mode</p>
         * <ul>
         * <li>BROADCASTING</li>
         * <li>CLUSTERING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BROADCASTING</p>
         */
        @NameInMap("messageModel")
        public String messageModel;

        /**
         * <p>The version of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
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
        /**
         * <p>The client connection list</p>
         */
        @NameInMap("connections")
        public java.util.List<ListConsumerConnectionsResponseBodyDataConnections> connections;

        /**
         * <p>The consumer group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CID-TEST</p>
         */
        @NameInMap("consumerGroupId")
        public String consumerGroupId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
