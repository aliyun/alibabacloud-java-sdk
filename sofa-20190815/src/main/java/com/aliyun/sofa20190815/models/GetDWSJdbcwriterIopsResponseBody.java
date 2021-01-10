// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterIopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSJdbcwriterIopsResponseBodyData> data;

    public static GetDWSJdbcwriterIopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterIopsResponseBody self = new GetDWSJdbcwriterIopsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterIopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSJdbcwriterIopsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSJdbcwriterIopsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSJdbcwriterIopsResponseBody setData(java.util.List<GetDWSJdbcwriterIopsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSJdbcwriterIopsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSJdbcwriterIopsResponseBodyData extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSJdbcwriterIopsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSJdbcwriterIopsResponseBodyData self = new GetDWSJdbcwriterIopsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSJdbcwriterIopsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSJdbcwriterIopsResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
