// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class OperateMarkSuccessWorkflowExecutionResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of <code>200</code> indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Additional details about the result.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request, used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>1DF6732E-15D8-5E1F-95E3-C10077F556B5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates if the operation succeeded.</p>
     * <ul>
     * <li><p><code>true</code>: The operation succeeded.</p>
     * </li>
     * <li><p><code>false</code>: The operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static OperateMarkSuccessWorkflowExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateMarkSuccessWorkflowExecutionResponseBody self = new OperateMarkSuccessWorkflowExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateMarkSuccessWorkflowExecutionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public OperateMarkSuccessWorkflowExecutionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OperateMarkSuccessWorkflowExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateMarkSuccessWorkflowExecutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
