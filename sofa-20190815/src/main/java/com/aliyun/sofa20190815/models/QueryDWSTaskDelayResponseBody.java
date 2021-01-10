// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSTaskDelayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryDWSTaskDelayResponseBodyData> data;

    public static QueryDWSTaskDelayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSTaskDelayResponseBody self = new QueryDWSTaskDelayResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDWSTaskDelayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDWSTaskDelayResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDWSTaskDelayResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDWSTaskDelayResponseBody setData(java.util.List<QueryDWSTaskDelayResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDWSTaskDelayResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryDWSTaskDelayResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryDWSTaskDelayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDWSTaskDelayResponseBodyData self = new QueryDWSTaskDelayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDWSTaskDelayResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDWSTaskDelayResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
