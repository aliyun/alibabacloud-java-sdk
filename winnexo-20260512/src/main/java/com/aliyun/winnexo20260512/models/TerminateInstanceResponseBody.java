// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TerminateInstanceResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The physical instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>plan_example</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The status after termination.</p>
     * 
     * <strong>example:</strong>
     * <p>Terminated</p>
     */
    @NameInMap("instanceStatus")
    public String instanceStatus;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The state version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("stateVersion")
    public Long stateVersion;

    /**
     * <p>Indicates whether the termination was successful. A value of true indicates success. If the termination fails, the error code and message are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("terminated")
    public Boolean terminated;

    public static TerminateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateInstanceResponseBody self = new TerminateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TerminateInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TerminateInstanceResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public TerminateInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TerminateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TerminateInstanceResponseBody setStateVersion(Long stateVersion) {
        this.stateVersion = stateVersion;
        return this;
    }
    public Long getStateVersion() {
        return this.stateVersion;
    }

    public TerminateInstanceResponseBody setTerminated(Boolean terminated) {
        this.terminated = terminated;
        return this;
    }
    public Boolean getTerminated() {
        return this.terminated;
    }

}
