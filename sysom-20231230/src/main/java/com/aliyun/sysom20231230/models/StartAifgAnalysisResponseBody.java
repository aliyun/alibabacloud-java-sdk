// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class StartAifgAnalysisResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200, 404, 500</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data details.</p>
     */
    @NameInMap("data")
    public StartAifgAnalysisResponseBodyData data;

    /**
     * <p>The message content.</p>
     * 
     * <strong>example:</strong>
     * <p>Processed successfully</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StartAifgAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartAifgAnalysisResponseBody self = new StartAifgAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public StartAifgAnalysisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartAifgAnalysisResponseBody setData(StartAifgAnalysisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartAifgAnalysisResponseBodyData getData() {
        return this.data;
    }

    public StartAifgAnalysisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartAifgAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartAifgAnalysisResponseBodyData extends TeaModel {
        /**
         * <p>The identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>9cd7aee5-d365-4d4e-8236-58a110a4ea09</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static StartAifgAnalysisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartAifgAnalysisResponseBodyData self = new StartAifgAnalysisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartAifgAnalysisResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
