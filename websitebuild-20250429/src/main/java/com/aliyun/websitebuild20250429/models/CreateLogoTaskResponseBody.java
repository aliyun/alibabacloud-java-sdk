// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateLogoTaskResponseBody extends TeaModel {
    /**
     * <p>Error code. The values are as follows: If the request succeeds, the ErrorCode field is not returned. If the request fails, the ErrorCode field is returned. For more information, see the error code list in this topic.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>aliuid:1998006665794443 assumeRole not exist,serviceName:realtimelogpush.dcdnservices.aliyuncs.com</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The job ID returned when the invocation succeeds. Note: Keep this ID securely. You need this ID to query the logo creation status.</p>
     * 
     * <strong>example:</strong>
     * <p>c3r127e325at9yd</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateLogoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLogoTaskResponseBody self = new CreateLogoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLogoTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateLogoTaskResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateLogoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLogoTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLogoTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
