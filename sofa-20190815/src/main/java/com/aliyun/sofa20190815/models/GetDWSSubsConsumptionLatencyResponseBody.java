// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsConsumptionLatencyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSSubsConsumptionLatencyResponseBodyData data;

    public static GetDWSSubsConsumptionLatencyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsConsumptionLatencyResponseBody self = new GetDWSSubsConsumptionLatencyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsConsumptionLatencyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSSubsConsumptionLatencyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSSubsConsumptionLatencyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSSubsConsumptionLatencyResponseBody setData(GetDWSSubsConsumptionLatencyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSSubsConsumptionLatencyResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSSubsConsumptionLatencyResponseBodyDataDps extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSSubsConsumptionLatencyResponseBodyDataDps build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsConsumptionLatencyResponseBodyDataDps self = new GetDWSSubsConsumptionLatencyResponseBodyDataDps();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsConsumptionLatencyResponseBodyDataDps setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSSubsConsumptionLatencyResponseBodyDataDps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDWSSubsConsumptionLatencyResponseBodyData extends TeaModel {
        @NameInMap("End")
        public Long end;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Dps")
        public java.util.List<GetDWSSubsConsumptionLatencyResponseBodyDataDps> dps;

        public static GetDWSSubsConsumptionLatencyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsConsumptionLatencyResponseBodyData self = new GetDWSSubsConsumptionLatencyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsConsumptionLatencyResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetDWSSubsConsumptionLatencyResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GetDWSSubsConsumptionLatencyResponseBodyData setDps(java.util.List<GetDWSSubsConsumptionLatencyResponseBodyDataDps> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.List<GetDWSSubsConsumptionLatencyResponseBodyDataDps> getDps() {
            return this.dps;
        }

    }

}
