// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmHistorycountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public java.util.List<QueryRmsAlarmHistorycountResponseBodyResponse> response;

    public static QueryRmsAlarmHistorycountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmHistorycountResponseBody self = new QueryRmsAlarmHistorycountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmHistorycountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlarmHistorycountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlarmHistorycountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlarmHistorycountResponseBody setResponse(java.util.List<QueryRmsAlarmHistorycountResponseBodyResponse> response) {
        this.response = response;
        return this;
    }
    public java.util.List<QueryRmsAlarmHistorycountResponseBodyResponse> getResponse() {
        return this.response;
    }

    public static class QueryRmsAlarmHistorycountResponseBodyResponse extends TeaModel {
        @NameInMap("Key")
        public Long key;

        @NameInMap("Value")
        public Long value;

        public static QueryRmsAlarmHistorycountResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmHistorycountResponseBodyResponse self = new QueryRmsAlarmHistorycountResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmHistorycountResponseBodyResponse setKey(Long key) {
            this.key = key;
            return this;
        }
        public Long getKey() {
            return this.key;
        }

        public QueryRmsAlarmHistorycountResponseBodyResponse setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
