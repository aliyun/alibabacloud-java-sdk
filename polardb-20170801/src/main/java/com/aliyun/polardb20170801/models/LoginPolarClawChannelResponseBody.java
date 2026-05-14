// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class LoginPolarClawChannelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>LoginPolarClawChannel</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>dc6762fb-20ad-4796-84fe-5c5d0dc413ce</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static LoginPolarClawChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoginPolarClawChannelResponseBody self = new LoginPolarClawChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public LoginPolarClawChannelResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public LoginPolarClawChannelResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public LoginPolarClawChannelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public LoginPolarClawChannelResponseBody setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public LoginPolarClawChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LoginPolarClawChannelResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public LoginPolarClawChannelResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
