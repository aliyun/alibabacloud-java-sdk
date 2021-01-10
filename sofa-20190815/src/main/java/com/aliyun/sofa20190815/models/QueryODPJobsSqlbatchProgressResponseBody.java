// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPJobsSqlbatchProgressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPJobsSqlbatchProgressResponseBodyData data;

    public static QueryODPJobsSqlbatchProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPJobsSqlbatchProgressResponseBody self = new QueryODPJobsSqlbatchProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPJobsSqlbatchProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPJobsSqlbatchProgressResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPJobsSqlbatchProgressResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPJobsSqlbatchProgressResponseBody setData(QueryODPJobsSqlbatchProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPJobsSqlbatchProgressResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPJobsSqlbatchProgressResponseBodyData extends TeaModel {
        @NameInMap("Percent")
        public Long percent;

        @NameInMap("Status")
        public String status;

        public static QueryODPJobsSqlbatchProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPJobsSqlbatchProgressResponseBodyData self = new QueryODPJobsSqlbatchProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPJobsSqlbatchProgressResponseBodyData setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public QueryODPJobsSqlbatchProgressResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
