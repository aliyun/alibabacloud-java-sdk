// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionsDailyConsumedRecordResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSPartitionsDailyConsumedRecordResponseBodyData data;

    public static GetDWSPartitionsDailyConsumedRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionsDailyConsumedRecordResponseBody self = new GetDWSPartitionsDailyConsumedRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionsDailyConsumedRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSPartitionsDailyConsumedRecordResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSPartitionsDailyConsumedRecordResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSPartitionsDailyConsumedRecordResponseBody setData(GetDWSPartitionsDailyConsumedRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSPartitionsDailyConsumedRecordResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSPartitionsDailyConsumedRecordResponseBodyDataDps extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSPartitionsDailyConsumedRecordResponseBodyDataDps build(java.util.Map<String, ?> map) throws Exception {
            GetDWSPartitionsDailyConsumedRecordResponseBodyDataDps self = new GetDWSPartitionsDailyConsumedRecordResponseBodyDataDps();
            return TeaModel.build(map, self);
        }

        public GetDWSPartitionsDailyConsumedRecordResponseBodyDataDps setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSPartitionsDailyConsumedRecordResponseBodyDataDps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDWSPartitionsDailyConsumedRecordResponseBodyData extends TeaModel {
        @NameInMap("End")
        public Long end;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Dps")
        public java.util.List<GetDWSPartitionsDailyConsumedRecordResponseBodyDataDps> dps;

        public static GetDWSPartitionsDailyConsumedRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSPartitionsDailyConsumedRecordResponseBodyData self = new GetDWSPartitionsDailyConsumedRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSPartitionsDailyConsumedRecordResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetDWSPartitionsDailyConsumedRecordResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GetDWSPartitionsDailyConsumedRecordResponseBodyData setDps(java.util.List<GetDWSPartitionsDailyConsumedRecordResponseBodyDataDps> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.List<GetDWSPartitionsDailyConsumedRecordResponseBodyDataDps> getDps() {
            return this.dps;
        }

    }

}
