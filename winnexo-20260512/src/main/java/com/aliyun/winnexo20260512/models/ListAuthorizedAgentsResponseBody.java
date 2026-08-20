// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListAuthorizedAgentsResponseBody extends TeaModel {
    /**
     * <p>The agent names.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("agentNames")
    public java.util.List<String> agentNames;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListAuthorizedAgentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedAgentsResponseBody self = new ListAuthorizedAgentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedAgentsResponseBody setAgentNames(java.util.List<String> agentNames) {
        this.agentNames = agentNames;
        return this;
    }
    public java.util.List<String> getAgentNames() {
        return this.agentNames;
    }

    public ListAuthorizedAgentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuthorizedAgentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthorizedAgentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
