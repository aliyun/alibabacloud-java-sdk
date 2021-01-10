// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsRcSyncClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryMsRcSyncClusterResponseBodyData> data;

    public static QueryMsRcSyncClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsRcSyncClusterResponseBody self = new QueryMsRcSyncClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsRcSyncClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsRcSyncClusterResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsRcSyncClusterResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsRcSyncClusterResponseBody setData(java.util.List<QueryMsRcSyncClusterResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryMsRcSyncClusterResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryMsRcSyncClusterResponseBodyDataExtraParams extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryMsRcSyncClusterResponseBodyDataExtraParams build(java.util.Map<String, ?> map) throws Exception {
            QueryMsRcSyncClusterResponseBodyDataExtraParams self = new QueryMsRcSyncClusterResponseBodyDataExtraParams();
            return TeaModel.build(map, self);
        }

        public QueryMsRcSyncClusterResponseBodyDataExtraParams setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryMsRcSyncClusterResponseBodyDataExtraParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryMsRcSyncClusterResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Vip")
        public String vip;

        @NameInMap("ExtraParams")
        public java.util.List<QueryMsRcSyncClusterResponseBodyDataExtraParams> extraParams;

        public static QueryMsRcSyncClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMsRcSyncClusterResponseBodyData self = new QueryMsRcSyncClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMsRcSyncClusterResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryMsRcSyncClusterResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMsRcSyncClusterResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMsRcSyncClusterResponseBodyData setVip(String vip) {
            this.vip = vip;
            return this;
        }
        public String getVip() {
            return this.vip;
        }

        public QueryMsRcSyncClusterResponseBodyData setExtraParams(java.util.List<QueryMsRcSyncClusterResponseBodyDataExtraParams> extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public java.util.List<QueryMsRcSyncClusterResponseBodyDataExtraParams> getExtraParams() {
            return this.extraParams;
        }

    }

}
