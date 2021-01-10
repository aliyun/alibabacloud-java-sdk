// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlarmRecentcountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public java.util.List<QueryRmsAlarmRecentcountResponseBodyResponse> response;

    public static QueryRmsAlarmRecentcountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlarmRecentcountResponseBody self = new QueryRmsAlarmRecentcountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlarmRecentcountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAlarmRecentcountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAlarmRecentcountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAlarmRecentcountResponseBody setResponse(java.util.List<QueryRmsAlarmRecentcountResponseBodyResponse> response) {
        this.response = response;
        return this;
    }
    public java.util.List<QueryRmsAlarmRecentcountResponseBodyResponse> getResponse() {
        return this.response;
    }

    public static class QueryRmsAlarmRecentcountResponseBodyResponse extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Long value;

        public static QueryRmsAlarmRecentcountResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAlarmRecentcountResponseBodyResponse self = new QueryRmsAlarmRecentcountResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAlarmRecentcountResponseBodyResponse setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryRmsAlarmRecentcountResponseBodyResponse setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

}
