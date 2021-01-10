// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSPlanStatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<GetAKSPlanStatesResponseBodyData> data;

    public static GetAKSPlanStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSPlanStatesResponseBody self = new GetAKSPlanStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSPlanStatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSPlanStatesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSPlanStatesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSPlanStatesResponseBody setData(java.util.List<GetAKSPlanStatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAKSPlanStatesResponseBodyData> getData() {
        return this.data;
    }

    public static class GetAKSPlanStatesResponseBodyDataValue extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("State")
        public String state;

        public static GetAKSPlanStatesResponseBodyDataValue build(java.util.Map<String, ?> map) throws Exception {
            GetAKSPlanStatesResponseBodyDataValue self = new GetAKSPlanStatesResponseBodyDataValue();
            return TeaModel.build(map, self);
        }

        public GetAKSPlanStatesResponseBodyDataValue setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetAKSPlanStatesResponseBodyDataValue setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class GetAKSPlanStatesResponseBodyData extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public GetAKSPlanStatesResponseBodyDataValue value;

        public static GetAKSPlanStatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAKSPlanStatesResponseBodyData self = new GetAKSPlanStatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAKSPlanStatesResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAKSPlanStatesResponseBodyData setValue(GetAKSPlanStatesResponseBodyDataValue value) {
            this.value = value;
            return this;
        }
        public GetAKSPlanStatesResponseBodyDataValue getValue() {
            return this.value;
        }

    }

}
