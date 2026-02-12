// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerGetConnectionResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public OnsConsumerGetConnectionResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DE4140C7-F42D-473D-A5FF-B1E31692****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsConsumerGetConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerGetConnectionResponseBody self = new OnsConsumerGetConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerGetConnectionResponseBody setData(OnsConsumerGetConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsConsumerGetConnectionResponseBodyData getData() {
        return this.data;
    }

    public OnsConsumerGetConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo extends TeaModel {
        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("Language")
        public String language;

        @NameInMap("Version")
        public String version;

        public static OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo self = new OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class OnsConsumerGetConnectionResponseBodyDataConnectionList extends TeaModel {
        @NameInMap("ConnectionDo")
        public java.util.List<OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo> connectionDo;

        public static OnsConsumerGetConnectionResponseBodyDataConnectionList build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerGetConnectionResponseBodyDataConnectionList self = new OnsConsumerGetConnectionResponseBodyDataConnectionList();
            return TeaModel.build(map, self);
        }

        public OnsConsumerGetConnectionResponseBodyDataConnectionList setConnectionDo(java.util.List<OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo> connectionDo) {
            this.connectionDo = connectionDo;
            return this;
        }
        public java.util.List<OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo> getConnectionDo() {
            return this.connectionDo;
        }

    }

    public static class OnsConsumerGetConnectionResponseBodyData extends TeaModel {
        @NameInMap("ConnectionList")
        public OnsConsumerGetConnectionResponseBodyDataConnectionList connectionList;

        @NameInMap("MessageModel")
        public String messageModel;

        public static OnsConsumerGetConnectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerGetConnectionResponseBodyData self = new OnsConsumerGetConnectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsConsumerGetConnectionResponseBodyData setConnectionList(OnsConsumerGetConnectionResponseBodyDataConnectionList connectionList) {
            this.connectionList = connectionList;
            return this;
        }
        public OnsConsumerGetConnectionResponseBodyDataConnectionList getConnectionList() {
            return this.connectionList;
        }

        public OnsConsumerGetConnectionResponseBodyData setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

    }

}
