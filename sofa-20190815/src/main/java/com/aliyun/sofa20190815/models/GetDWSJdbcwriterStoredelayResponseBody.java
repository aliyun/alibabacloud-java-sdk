// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterStoredelayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSJdbcwriterStoredelayResponseBodyData> data;

    public static GetDWSJdbcwriterStoredelayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterStoredelayResponseBody self = new GetDWSJdbcwriterStoredelayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterStoredelayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSJdbcwriterStoredelayResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSJdbcwriterStoredelayResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSJdbcwriterStoredelayResponseBody setData(java.util.List<GetDWSJdbcwriterStoredelayResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSJdbcwriterStoredelayResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSJdbcwriterStoredelayResponseBodyData extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSJdbcwriterStoredelayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSJdbcwriterStoredelayResponseBodyData self = new GetDWSJdbcwriterStoredelayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSJdbcwriterStoredelayResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSJdbcwriterStoredelayResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
