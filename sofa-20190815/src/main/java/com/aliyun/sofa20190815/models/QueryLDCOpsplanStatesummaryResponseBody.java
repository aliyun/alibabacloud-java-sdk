// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanStatesummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryLDCOpsplanStatesummaryResponseBodyData> data;

    public static QueryLDCOpsplanStatesummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanStatesummaryResponseBody self = new QueryLDCOpsplanStatesummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanStatesummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCOpsplanStatesummaryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCOpsplanStatesummaryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCOpsplanStatesummaryResponseBody setData(java.util.List<QueryLDCOpsplanStatesummaryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLDCOpsplanStatesummaryResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLDCOpsplanStatesummaryResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("State")
        public String state;

        public static QueryLDCOpsplanStatesummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCOpsplanStatesummaryResponseBodyData self = new QueryLDCOpsplanStatesummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLDCOpsplanStatesummaryResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryLDCOpsplanStatesummaryResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
