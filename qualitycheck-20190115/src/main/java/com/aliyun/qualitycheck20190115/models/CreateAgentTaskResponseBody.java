// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateAgentTaskResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Any other value indicates failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CreateAgentTaskResponseBodyData data;

    /**
     * <p>The error details when the request fails. The value is <strong>successful</strong> when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>106C6CA0-282D-4AF7-85F0-D2D24F4CE647</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. You can use this field to determine whether the request succeeded: true indicates success. false/null indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateAgentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentTaskResponseBody self = new CreateAgentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgentTaskResponseBody setData(CreateAgentTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgentTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateAgentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAgentTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAgentTaskResponseBodyData extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7C1DEF5F-2C18-4D36-99C6-8***</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6fa76916-3ce6-45d8-ac64-01b7f31***</p>
         */
        @NameInMap("Vid")
        public String vid;

        public static CreateAgentTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentTaskResponseBodyData self = new CreateAgentTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgentTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateAgentTaskResponseBodyData setVid(String vid) {
            this.vid = vid;
            return this;
        }
        public String getVid() {
            return this.vid;
        }

    }

}
