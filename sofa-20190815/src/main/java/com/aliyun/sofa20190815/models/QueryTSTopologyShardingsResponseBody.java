// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyShardingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryTSTopologyShardingsResponseBodyData> data;

    public static QueryTSTopologyShardingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyShardingsResponseBody self = new QueryTSTopologyShardingsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyShardingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSTopologyShardingsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSTopologyShardingsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSTopologyShardingsResponseBody setData(java.util.List<QueryTSTopologyShardingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTSTopologyShardingsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryTSTopologyShardingsResponseBodyData extends TeaModel {
        @NameInMap("Sharding")
        public String sharding;

        @NameInMap("StatusEnums")
        public java.util.List<String> statusEnums;

        public static QueryTSTopologyShardingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyShardingsResponseBodyData self = new QueryTSTopologyShardingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyShardingsResponseBodyData setSharding(String sharding) {
            this.sharding = sharding;
            return this;
        }
        public String getSharding() {
            return this.sharding;
        }

        public QueryTSTopologyShardingsResponseBodyData setStatusEnums(java.util.List<String> statusEnums) {
            this.statusEnums = statusEnums;
            return this;
        }
        public java.util.List<String> getStatusEnums() {
            return this.statusEnums;
        }

    }

}
