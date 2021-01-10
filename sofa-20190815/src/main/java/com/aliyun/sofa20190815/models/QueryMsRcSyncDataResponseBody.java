// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsRcSyncDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryMsRcSyncDataResponseBodyData> data;

    public static QueryMsRcSyncDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsRcSyncDataResponseBody self = new QueryMsRcSyncDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsRcSyncDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsRcSyncDataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsRcSyncDataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsRcSyncDataResponseBody setData(java.util.List<QueryMsRcSyncDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryMsRcSyncDataResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryMsRcSyncDataResponseBodyData extends TeaModel {
        @NameInMap("SourceData")
        public String sourceData;

        @NameInMap("TargetData")
        public String targetData;

        public static QueryMsRcSyncDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMsRcSyncDataResponseBodyData self = new QueryMsRcSyncDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMsRcSyncDataResponseBodyData setSourceData(String sourceData) {
            this.sourceData = sourceData;
            return this;
        }
        public String getSourceData() {
            return this.sourceData;
        }

        public QueryMsRcSyncDataResponseBodyData setTargetData(String targetData) {
            this.targetData = targetData;
            return this;
        }
        public String getTargetData() {
            return this.targetData;
        }

    }

}
