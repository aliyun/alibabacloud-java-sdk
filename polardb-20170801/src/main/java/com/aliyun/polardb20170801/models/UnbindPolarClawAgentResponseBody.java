// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UnbindPolarClawAgentResponseBody extends TeaModel {
    /**
     * <p>Agent ID</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <strong>example:</strong>
     * <p>pa-********************</p>
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
     * <p>1</p>
     */
    @NameInMap("RemovedCount")
    public Integer removedCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalBindings")
    public Integer totalBindings;

    public static UnbindPolarClawAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindPolarClawAgentResponseBody self = new UnbindPolarClawAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindPolarClawAgentResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UnbindPolarClawAgentResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UnbindPolarClawAgentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UnbindPolarClawAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindPolarClawAgentResponseBody setRemovedCount(Integer removedCount) {
        this.removedCount = removedCount;
        return this;
    }
    public Integer getRemovedCount() {
        return this.removedCount;
    }

    public UnbindPolarClawAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnbindPolarClawAgentResponseBody setTotalBindings(Integer totalBindings) {
        this.totalBindings = totalBindings;
        return this;
    }
    public Integer getTotalBindings() {
        return this.totalBindings;
    }

}
