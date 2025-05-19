// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateOrUpdateSwimmingLaneResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static CreateOrUpdateSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneResponseBody self = new CreateOrUpdateSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setData(CreateOrUpdateSwimmingLaneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOrUpdateSwimmingLaneResponseBodyData getData() {
        return this.data;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateOrUpdateSwimmingLaneResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>22318</p>
         */
        @NameInMap("LaneId")
        public Long laneId;

        public static CreateOrUpdateSwimmingLaneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneResponseBodyData self = new CreateOrUpdateSwimmingLaneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setLaneId(Long laneId) {
            this.laneId = laneId;
            return this;
        }
        public Long getLaneId() {
            return this.laneId;
        }

    }

}
