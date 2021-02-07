// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerGetConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsConsumerGetConnectionResponseBodyData data;

    public static OnsConsumerGetConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerGetConnectionResponseBody self = new OnsConsumerGetConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerGetConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsConsumerGetConnectionResponseBody setData(OnsConsumerGetConnectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsConsumerGetConnectionResponseBodyData getData() {
        return this.data;
    }

    public static class OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("Language")
        public String language;

        @NameInMap("ClientId")
        public String clientId;

        public static OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo self = new OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public OnsConsumerGetConnectionResponseBodyDataConnectionListConnectionDo setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
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
