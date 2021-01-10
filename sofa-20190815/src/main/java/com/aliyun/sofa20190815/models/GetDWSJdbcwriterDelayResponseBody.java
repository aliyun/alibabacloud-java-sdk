// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterDelayResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSJdbcwriterDelayResponseBodyData> data;

    public static GetDWSJdbcwriterDelayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterDelayResponseBody self = new GetDWSJdbcwriterDelayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterDelayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSJdbcwriterDelayResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSJdbcwriterDelayResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSJdbcwriterDelayResponseBody setData(java.util.List<GetDWSJdbcwriterDelayResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSJdbcwriterDelayResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSJdbcwriterDelayResponseBodyData extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSJdbcwriterDelayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSJdbcwriterDelayResponseBodyData self = new GetDWSJdbcwriterDelayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSJdbcwriterDelayResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSJdbcwriterDelayResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
