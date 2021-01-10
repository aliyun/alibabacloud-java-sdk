// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTraceResponseBody extends TeaModel {
    @NameInMap("Trace")
    public DescribeDSTTraceResponseBodyTrace trace;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeDSTTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTraceResponseBody self = new DescribeDSTTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTraceResponseBody setTrace(DescribeDSTTraceResponseBodyTrace trace) {
        this.trace = trace;
        return this;
    }
    public DescribeDSTTraceResponseBodyTrace getTrace() {
        return this.trace;
    }

    public DescribeDSTTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDSTTraceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeDSTTraceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeDSTTraceResponseBodyTrace extends TeaModel {
        @NameInMap("CollectedName")
        public String collectedName;

        @NameInMap("CollectedDescription")
        public String collectedDescription;

        @NameInMap("TraceId")
        public String traceId;

        @NameInMap("Collected")
        public Boolean collected;

        public static DescribeDSTTraceResponseBodyTrace build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTraceResponseBodyTrace self = new DescribeDSTTraceResponseBodyTrace();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTraceResponseBodyTrace setCollectedName(String collectedName) {
            this.collectedName = collectedName;
            return this;
        }
        public String getCollectedName() {
            return this.collectedName;
        }

        public DescribeDSTTraceResponseBodyTrace setCollectedDescription(String collectedDescription) {
            this.collectedDescription = collectedDescription;
            return this;
        }
        public String getCollectedDescription() {
            return this.collectedDescription;
        }

        public DescribeDSTTraceResponseBodyTrace setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public DescribeDSTTraceResponseBodyTrace setCollected(Boolean collected) {
            this.collected = collected;
            return this;
        }
        public Boolean getCollected() {
            return this.collected;
        }

    }

}
