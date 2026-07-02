// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateVmcoreDiagnosisTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If code is Success, the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization has failed. Check the message field for the detailed fault message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public CreateVmcoreDiagnosisTaskResponseBodyData data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If code is Success, this field is empty.</li>
     * <li>Otherwise, this field contains the error message for the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateVmcoreDiagnosisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVmcoreDiagnosisTaskResponseBody self = new CreateVmcoreDiagnosisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVmcoreDiagnosisTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateVmcoreDiagnosisTaskResponseBody setData(CreateVmcoreDiagnosisTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateVmcoreDiagnosisTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateVmcoreDiagnosisTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVmcoreDiagnosisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVmcoreDiagnosisTaskResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the created diagnostic task.</p>
         * 
         * <strong>example:</strong>
         * <p>bbe94a98-4192-4172-b856-95777e0a55d7</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateVmcoreDiagnosisTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateVmcoreDiagnosisTaskResponseBodyData self = new CreateVmcoreDiagnosisTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateVmcoreDiagnosisTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
