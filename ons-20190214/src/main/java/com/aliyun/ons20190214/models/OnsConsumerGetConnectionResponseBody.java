// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerGetConnectionResponseBody extends TeaModel {
    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public OnsConsumerGetConnectionResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
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
        /**
         * <p>The IP address and port number of the consumer instance.</p>
         */
        @NameInMap("ClientAddr")
        public String clientAddr;

        /**
         * <p>The ID of the consumer instance.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The programming language in which the consumer application was developed.</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The version of the consumer client.</p>
         */
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
        /**
         * <p>The connection information about the consumers in the specified group.</p>
         */
        @NameInMap("ConnectionList")
        public OnsConsumerGetConnectionResponseBodyDataConnectionList connectionList;

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

    }

}
