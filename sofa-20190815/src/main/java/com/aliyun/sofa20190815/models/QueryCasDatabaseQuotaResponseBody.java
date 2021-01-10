// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseQuotaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryCasDatabaseQuotaResponseBodyData> data;

    public static QueryCasDatabaseQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseQuotaResponseBody self = new QueryCasDatabaseQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCasDatabaseQuotaResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCasDatabaseQuotaResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryCasDatabaseQuotaResponseBody setData(java.util.List<QueryCasDatabaseQuotaResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCasDatabaseQuotaResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryCasDatabaseQuotaResponseBodyData extends TeaModel {
        @NameInMap("Quota")
        public Long quota;

        @NameInMap("Type")
        public String type;

        public static QueryCasDatabaseQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCasDatabaseQuotaResponseBodyData self = new QueryCasDatabaseQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCasDatabaseQuotaResponseBodyData setQuota(Long quota) {
            this.quota = quota;
            return this;
        }
        public Long getQuota() {
            return this.quota;
        }

        public QueryCasDatabaseQuotaResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
