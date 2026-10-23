// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RerunNodeAIResponseBody extends TeaModel {
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
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The key of the node scheduled for rerun.</p>
     * 
     * <strong>example:</strong>
     * <p>query.amount</p>
     */
    @NameInMap("nodeId")
    public String nodeId;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the rerun request is accepted. A value of true indicates that the rerun is accepted, but does not mean that the AI has completed the task. Failures are returned through the Code and Message fields.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("rerunAccepted")
    public Boolean rerunAccepted;

    /**
     * <p>The state version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("stateVersion")
    public Long stateVersion;

    public static RerunNodeAIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RerunNodeAIResponseBody self = new RerunNodeAIResponseBody();
        return TeaModel.build(map, self);
    }

    public RerunNodeAIResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RerunNodeAIResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RerunNodeAIResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RerunNodeAIResponseBody setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public RerunNodeAIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RerunNodeAIResponseBody setRerunAccepted(Boolean rerunAccepted) {
        this.rerunAccepted = rerunAccepted;
        return this;
    }
    public Boolean getRerunAccepted() {
        return this.rerunAccepted;
    }

    public RerunNodeAIResponseBody setStateVersion(Long stateVersion) {
        this.stateVersion = stateVersion;
        return this;
    }
    public Long getStateVersion() {
        return this.stateVersion;
    }

}
