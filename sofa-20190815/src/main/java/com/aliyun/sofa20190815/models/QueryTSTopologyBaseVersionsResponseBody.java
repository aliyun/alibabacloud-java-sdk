// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTopologyBaseVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryTSTopologyBaseVersionsResponseBodyData> data;

    public static QueryTSTopologyBaseVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTopologyBaseVersionsResponseBody self = new QueryTSTopologyBaseVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSTopologyBaseVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSTopologyBaseVersionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSTopologyBaseVersionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSTopologyBaseVersionsResponseBody setData(java.util.List<QueryTSTopologyBaseVersionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTSTopologyBaseVersionsResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryTSTopologyBaseVersionsResponseBodyData extends TeaModel {
        @NameInMap("BaseVerison")
        public String baseVerison;

        @NameInMap("Status")
        public String status;

        public static QueryTSTopologyBaseVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSTopologyBaseVersionsResponseBodyData self = new QueryTSTopologyBaseVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSTopologyBaseVersionsResponseBodyData setBaseVerison(String baseVerison) {
            this.baseVerison = baseVerison;
            return this;
        }
        public String getBaseVerison() {
            return this.baseVerison;
        }

        public QueryTSTopologyBaseVersionsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
