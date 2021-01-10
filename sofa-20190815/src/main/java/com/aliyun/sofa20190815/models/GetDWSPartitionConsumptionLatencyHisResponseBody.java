// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionConsumptionLatencyHisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSPartitionConsumptionLatencyHisResponseBodyData data;

    public static GetDWSPartitionConsumptionLatencyHisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionConsumptionLatencyHisResponseBody self = new GetDWSPartitionConsumptionLatencyHisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionConsumptionLatencyHisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSPartitionConsumptionLatencyHisResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSPartitionConsumptionLatencyHisResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSPartitionConsumptionLatencyHisResponseBody setData(GetDWSPartitionConsumptionLatencyHisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSPartitionConsumptionLatencyHisResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSPartitionConsumptionLatencyHisResponseBodyDataDps extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSPartitionConsumptionLatencyHisResponseBodyDataDps build(java.util.Map<String, ?> map) throws Exception {
            GetDWSPartitionConsumptionLatencyHisResponseBodyDataDps self = new GetDWSPartitionConsumptionLatencyHisResponseBodyDataDps();
            return TeaModel.build(map, self);
        }

        public GetDWSPartitionConsumptionLatencyHisResponseBodyDataDps setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSPartitionConsumptionLatencyHisResponseBodyDataDps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDWSPartitionConsumptionLatencyHisResponseBodyData extends TeaModel {
        @NameInMap("End")
        public Long end;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Dps")
        public java.util.List<GetDWSPartitionConsumptionLatencyHisResponseBodyDataDps> dps;

        public static GetDWSPartitionConsumptionLatencyHisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSPartitionConsumptionLatencyHisResponseBodyData self = new GetDWSPartitionConsumptionLatencyHisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSPartitionConsumptionLatencyHisResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetDWSPartitionConsumptionLatencyHisResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GetDWSPartitionConsumptionLatencyHisResponseBodyData setDps(java.util.List<GetDWSPartitionConsumptionLatencyHisResponseBodyDataDps> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.List<GetDWSPartitionConsumptionLatencyHisResponseBodyDataDps> getDps() {
            return this.dps;
        }

    }

}
