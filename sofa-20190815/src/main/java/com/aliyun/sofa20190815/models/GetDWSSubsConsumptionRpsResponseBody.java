// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsConsumptionRpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSSubsConsumptionRpsResponseBodyData data;

    public static GetDWSSubsConsumptionRpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsConsumptionRpsResponseBody self = new GetDWSSubsConsumptionRpsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsConsumptionRpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSSubsConsumptionRpsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSSubsConsumptionRpsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSSubsConsumptionRpsResponseBody setData(GetDWSSubsConsumptionRpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSSubsConsumptionRpsResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSSubsConsumptionRpsResponseBodyDataDps extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSSubsConsumptionRpsResponseBodyDataDps build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsConsumptionRpsResponseBodyDataDps self = new GetDWSSubsConsumptionRpsResponseBodyDataDps();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsConsumptionRpsResponseBodyDataDps setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSSubsConsumptionRpsResponseBodyDataDps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDWSSubsConsumptionRpsResponseBodyData extends TeaModel {
        @NameInMap("End")
        public Long end;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Dps")
        public java.util.List<GetDWSSubsConsumptionRpsResponseBodyDataDps> dps;

        public static GetDWSSubsConsumptionRpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSSubsConsumptionRpsResponseBodyData self = new GetDWSSubsConsumptionRpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSSubsConsumptionRpsResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetDWSSubsConsumptionRpsResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GetDWSSubsConsumptionRpsResponseBodyData setDps(java.util.List<GetDWSSubsConsumptionRpsResponseBodyDataDps> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.List<GetDWSSubsConsumptionRpsResponseBodyDataDps> getDps() {
            return this.dps;
        }

    }

}
