// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InvokeDiagnosisResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate authorization failure. When authorization fails, check the <code>message</code> field for detailed error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Response result.</p>
     */
    @NameInMap("data")
    public InvokeDiagnosisResponseBodyData data;

    /**
     * <p>Error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIAssumeRoleException: EntityNotExist.Role The role not exists: acs:ram::xxxxx:role/aliyunserviceroleforsysom</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>43A910E9-A739-525E-855D-A32C257F1826</p>
     */
    @NameInMap("request_id")
    public String requestId;

    public static InvokeDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeDiagnosisResponseBody self = new InvokeDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeDiagnosisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeDiagnosisResponseBody setData(InvokeDiagnosisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InvokeDiagnosisResponseBodyData getData() {
        return this.data;
    }

    public InvokeDiagnosisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvokeDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InvokeDiagnosisResponseBodyData extends TeaModel {
        /**
         * <p>Diagnosis task ID. You can use this ID to call the <code>GetDiagnosisResult</code> API to query the diagnosis result.</p>
         * 
         * <strong>example:</strong>
         * <p>ihqhAcrt</p>
         */
        @NameInMap("task_id")
        public String taskId;

        public static InvokeDiagnosisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InvokeDiagnosisResponseBodyData self = new InvokeDiagnosisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InvokeDiagnosisResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
