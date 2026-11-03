// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneGroupResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The application information.</p>
     */
    @NameInMap("Data")
    public CreateOrUpdateSwimmingLaneGroupResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If the request fails, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the traffic lane group is created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The traffic lane group is created.</li>
     * <li><strong>false</strong>: The traffic lane group fails to be created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query invocation details.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static CreateOrUpdateSwimmingLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneGroupResponseBody self = new CreateOrUpdateSwimmingLaneGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setData(CreateOrUpdateSwimmingLaneGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOrUpdateSwimmingLaneGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateOrUpdateSwimmingLaneGroupResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateOrUpdateSwimmingLaneGroupResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the traffic lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>110272</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        public static CreateOrUpdateSwimmingLaneGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneGroupResponseBodyData self = new CreateOrUpdateSwimmingLaneGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

    }

}
