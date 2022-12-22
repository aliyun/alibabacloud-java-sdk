// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saasincubator20221206.models;

import com.aliyun.tea.*;

public class ResolveInstanceStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ResolveInstanceStatusResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static ResolveInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResolveInstanceStatusResponseBody self = new ResolveInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ResolveInstanceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ResolveInstanceStatusResponseBody setData(ResolveInstanceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResolveInstanceStatusResponseBodyData getData() {
        return this.data;
    }

    public ResolveInstanceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ResolveInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResolveInstanceStatusResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public static class ResolveInstanceStatusResponseBodyData extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("MeterCodeRemainingCount")
        public Long meterCodeRemainingCount;

        @NameInMap("MeterCodeUsedCount")
        public Long meterCodeUsedCount;

        public static ResolveInstanceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResolveInstanceStatusResponseBodyData self = new ResolveInstanceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResolveInstanceStatusResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ResolveInstanceStatusResponseBodyData setMeterCodeRemainingCount(Long meterCodeRemainingCount) {
            this.meterCodeRemainingCount = meterCodeRemainingCount;
            return this;
        }
        public Long getMeterCodeRemainingCount() {
            return this.meterCodeRemainingCount;
        }

        public ResolveInstanceStatusResponseBodyData setMeterCodeUsedCount(Long meterCodeUsedCount) {
            this.meterCodeUsedCount = meterCodeUsedCount;
            return this;
        }
        public Long getMeterCodeUsedCount() {
            return this.meterCodeUsedCount;
        }

    }

}
