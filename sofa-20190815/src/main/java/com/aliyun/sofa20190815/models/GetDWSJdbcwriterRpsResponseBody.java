// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSJdbcwriterRpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetDWSJdbcwriterRpsResponseBodyData> data;

    public static GetDWSJdbcwriterRpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSJdbcwriterRpsResponseBody self = new GetDWSJdbcwriterRpsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSJdbcwriterRpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSJdbcwriterRpsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSJdbcwriterRpsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSJdbcwriterRpsResponseBody setData(java.util.List<GetDWSJdbcwriterRpsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDWSJdbcwriterRpsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetDWSJdbcwriterRpsResponseBodyData extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSJdbcwriterRpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSJdbcwriterRpsResponseBodyData self = new GetDWSJdbcwriterRpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSJdbcwriterRpsResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSJdbcwriterRpsResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
