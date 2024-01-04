// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class MotionShopVideoDetectResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public MotionShopVideoDetectResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MotionShopVideoDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MotionShopVideoDetectResponseBody self = new MotionShopVideoDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public MotionShopVideoDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MotionShopVideoDetectResponseBody setData(MotionShopVideoDetectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MotionShopVideoDetectResponseBodyData getData() {
        return this.data;
    }

    public MotionShopVideoDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MotionShopVideoDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MotionShopVideoDetectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class MotionShopVideoDetectResponseBodyData extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        public static MotionShopVideoDetectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MotionShopVideoDetectResponseBodyData self = new MotionShopVideoDetectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MotionShopVideoDetectResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

}
