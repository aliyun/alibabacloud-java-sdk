// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartPolarClawGatewayResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The approximate downtime of this restart, in milliseconds. This value is returned synchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>3235</p>
     */
    @NameInMap("DowntimeMs")
    public Long downtimeMs;

    /**
     * <p>The gateway version after the restart. This value is returned synchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>2026.5.7</p>
     */
    @NameInMap("GatewayVersion")
    public String gatewayVersion;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The actual restart mode used.</p>
     * 
     * <strong>example:</strong>
     * <p>in-process</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>Indicates whether the operation was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ok")
    public Boolean ok;

    /**
     * <p>The operation name. This value is returned when Async is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>RestartPolarClawGateway</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the gateway has been confirmed available after the restart. This value is returned synchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restarted")
    public Boolean restarted;

    /**
     * <p>The initial state of the asynchronous task. This value is returned when Async is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The asynchronous task ID. This value is returned when Async is set to true. You can poll the task status by calling DescribePolarClawTask.</p>
     * 
     * <strong>example:</strong>
     * <p>0ee00f56-f467-4d41-858c-ca4ede2c770e</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RestartPolarClawGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartPolarClawGatewayResponseBody self = new RestartPolarClawGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartPolarClawGatewayResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RestartPolarClawGatewayResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RestartPolarClawGatewayResponseBody setDowntimeMs(Long downtimeMs) {
        this.downtimeMs = downtimeMs;
        return this;
    }
    public Long getDowntimeMs() {
        return this.downtimeMs;
    }

    public RestartPolarClawGatewayResponseBody setGatewayVersion(String gatewayVersion) {
        this.gatewayVersion = gatewayVersion;
        return this;
    }
    public String getGatewayVersion() {
        return this.gatewayVersion;
    }

    public RestartPolarClawGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RestartPolarClawGatewayResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public RestartPolarClawGatewayResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public RestartPolarClawGatewayResponseBody setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public RestartPolarClawGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestartPolarClawGatewayResponseBody setRestarted(Boolean restarted) {
        this.restarted = restarted;
        return this;
    }
    public Boolean getRestarted() {
        return this.restarted;
    }

    public RestartPolarClawGatewayResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public RestartPolarClawGatewayResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
