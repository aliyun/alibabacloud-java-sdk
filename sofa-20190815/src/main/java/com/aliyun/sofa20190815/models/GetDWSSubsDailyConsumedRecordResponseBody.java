// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsDailyConsumedRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSSubsDailyConsumedRecordResponseBodyData data;

    public static GetDWSSubsDailyConsumedRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsDailyConsumedRecordResponseBody self = new GetDWSSubsDailyConsumedRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsDailyConsumedRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSSubsDailyConsumedRecordResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSSubsDailyConsumedRecordResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSSubsDailyConsumedRecordResponseBody setData(GetDWSSubsDailyConsumedRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSSubsDailyConsumedRecordResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSSubsDailyConsumedRecordResponseBodyDataDps extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSSubsDailyConsumedRecordResponseBodyDataDps build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsDailyConsumedRecordResponseBodyDataDps self = new GetDWSSubsDailyConsumedRecordResponseBodyDataDps();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsDailyConsumedRecordResponseBodyDataDps setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSSubsDailyConsumedRecordResponseBodyDataDps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDWSSubsDailyConsumedRecordResponseBodyData extends TeaModel {
        @NameInMap("End")
        public Long end;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Dps")
        public java.util.List<GetDWSSubsDailyConsumedRecordResponseBodyDataDps> dps;

        public static GetDWSSubsDailyConsumedRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsDailyConsumedRecordResponseBodyData self = new GetDWSSubsDailyConsumedRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsDailyConsumedRecordResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetDWSSubsDailyConsumedRecordResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GetDWSSubsDailyConsumedRecordResponseBodyData setDps(java.util.List<GetDWSSubsDailyConsumedRecordResponseBodyDataDps> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.List<GetDWSSubsDailyConsumedRecordResponseBodyDataDps> getDps() {
            return this.dps;
        }

    }

}
