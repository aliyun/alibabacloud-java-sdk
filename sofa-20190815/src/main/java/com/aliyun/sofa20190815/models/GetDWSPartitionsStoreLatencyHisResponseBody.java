// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSPartitionsStoreLatencyHisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetDWSPartitionsStoreLatencyHisResponseBodyData data;

    public static GetDWSPartitionsStoreLatencyHisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDWSPartitionsStoreLatencyHisResponseBody self = new GetDWSPartitionsStoreLatencyHisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDWSPartitionsStoreLatencyHisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDWSPartitionsStoreLatencyHisResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDWSPartitionsStoreLatencyHisResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetDWSPartitionsStoreLatencyHisResponseBody setData(GetDWSPartitionsStoreLatencyHisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDWSPartitionsStoreLatencyHisResponseBodyData getData() {
        return this.data;
    }

    public static class GetDWSPartitionsStoreLatencyHisResponseBodyDataDps extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static GetDWSPartitionsStoreLatencyHisResponseBodyDataDps build(java.util.Map<String, ?> map) throws Exception {
            GetDWSPartitionsStoreLatencyHisResponseBodyDataDps self = new GetDWSPartitionsStoreLatencyHisResponseBodyDataDps();
            return TeaModel.build(map, self);
        }

        public GetDWSPartitionsStoreLatencyHisResponseBodyDataDps setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetDWSPartitionsStoreLatencyHisResponseBodyDataDps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDWSPartitionsStoreLatencyHisResponseBodyData extends TeaModel {
        @NameInMap("End")
        public Long end;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Dps")
        public java.util.List<GetDWSPartitionsStoreLatencyHisResponseBodyDataDps> dps;

        public static GetDWSPartitionsStoreLatencyHisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDWSPartitionsStoreLatencyHisResponseBodyData self = new GetDWSPartitionsStoreLatencyHisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDWSPartitionsStoreLatencyHisResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetDWSPartitionsStoreLatencyHisResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GetDWSPartitionsStoreLatencyHisResponseBodyData setDps(java.util.List<GetDWSPartitionsStoreLatencyHisResponseBodyDataDps> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.List<GetDWSPartitionsStoreLatencyHisResponseBodyDataDps> getDps() {
            return this.dps;
        }

    }

}
