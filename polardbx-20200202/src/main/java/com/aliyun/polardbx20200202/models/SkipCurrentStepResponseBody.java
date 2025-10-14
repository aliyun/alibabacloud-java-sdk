// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SkipCurrentStepResponseBody extends TeaModel {
    @NameInMap("Data")
    public SkipCurrentStepResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SkipCurrentStepResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SkipCurrentStepResponseBody self = new SkipCurrentStepResponseBody();
        return TeaModel.build(map, self);
    }

    public SkipCurrentStepResponseBody setData(SkipCurrentStepResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SkipCurrentStepResponseBodyData getData() {
        return this.data;
    }

    public SkipCurrentStepResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SkipCurrentStepResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SkipCurrentStepResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SkipCurrentStepResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>etx-szr2rr6i*****</p>
         */
        @NameInMap("SlinkTaskId")
        public String slinkTaskId;

        public static SkipCurrentStepResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SkipCurrentStepResponseBodyData self = new SkipCurrentStepResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SkipCurrentStepResponseBodyData setSlinkTaskId(String slinkTaskId) {
            this.slinkTaskId = slinkTaskId;
            return this;
        }
        public String getSlinkTaskId() {
            return this.slinkTaskId;
        }

    }

}
