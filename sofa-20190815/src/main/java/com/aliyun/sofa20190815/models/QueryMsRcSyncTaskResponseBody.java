// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsRcSyncTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryMsRcSyncTaskResponseBodyData> data;

    public static QueryMsRcSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsRcSyncTaskResponseBody self = new QueryMsRcSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsRcSyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsRcSyncTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsRcSyncTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsRcSyncTaskResponseBody setData(java.util.List<QueryMsRcSyncTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryMsRcSyncTaskResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryMsRcSyncTaskResponseBodyData extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Status")
        public String status;

        public static QueryMsRcSyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMsRcSyncTaskResponseBodyData self = new QueryMsRcSyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMsRcSyncTaskResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public QueryMsRcSyncTaskResponseBodyData setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public QueryMsRcSyncTaskResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public QueryMsRcSyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
