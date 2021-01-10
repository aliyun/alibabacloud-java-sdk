// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionsConsumptionRpsHisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSPartitionsConsumptionRpsHisResponseBodyData data;

    public static GetDWSPartitionsConsumptionRpsHisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionsConsumptionRpsHisResponseBody self = new GetDWSPartitionsConsumptionRpsHisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionsConsumptionRpsHisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSPartitionsConsumptionRpsHisResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSPartitionsConsumptionRpsHisResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSPartitionsConsumptionRpsHisResponseBody setData(GetDWSPartitionsConsumptionRpsHisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSPartitionsConsumptionRpsHisResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSPartitionsConsumptionRpsHisResponseBodyDataDps extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSPartitionsConsumptionRpsHisResponseBodyDataDps build(java.util.Map<String, ?> map) throws Exception {
            GetDWSPartitionsConsumptionRpsHisResponseBodyDataDps self = new GetDWSPartitionsConsumptionRpsHisResponseBodyDataDps();
            return TeaModel.build(map, self);
        }

        public GetDWSPartitionsConsumptionRpsHisResponseBodyDataDps setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSPartitionsConsumptionRpsHisResponseBodyDataDps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDWSPartitionsConsumptionRpsHisResponseBodyData extends TeaModel {
        @NameInMap("End")
        public Long end;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Dps")
        public java.util.List<GetDWSPartitionsConsumptionRpsHisResponseBodyDataDps> dps;

        public static GetDWSPartitionsConsumptionRpsHisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSPartitionsConsumptionRpsHisResponseBodyData self = new GetDWSPartitionsConsumptionRpsHisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSPartitionsConsumptionRpsHisResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetDWSPartitionsConsumptionRpsHisResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GetDWSPartitionsConsumptionRpsHisResponseBodyData setDps(java.util.List<GetDWSPartitionsConsumptionRpsHisResponseBodyDataDps> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.List<GetDWSPartitionsConsumptionRpsHisResponseBodyDataDps> getDps() {
            return this.dps;
        }

    }

}
