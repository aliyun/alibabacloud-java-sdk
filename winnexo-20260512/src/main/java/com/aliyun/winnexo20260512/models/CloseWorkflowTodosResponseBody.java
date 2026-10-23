// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CloseWorkflowTodosResponseBody extends TeaModel {
    /**
     * <p>The number of closed to-do items. The value is 0 for idempotent repeated calls.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("cancelledCount")
    public Long cancelledCount;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error description.</p>
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
     * <p>The workflow ID, returned as provided.</p>
     * 
     * <strong>example:</strong>
     * <p>wf-1</p>
     */
    @NameInMap("sourceWorkflowId")
    public String sourceWorkflowId;

    public static CloseWorkflowTodosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseWorkflowTodosResponseBody self = new CloseWorkflowTodosResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseWorkflowTodosResponseBody setCancelledCount(Long cancelledCount) {
        this.cancelledCount = cancelledCount;
        return this;
    }
    public Long getCancelledCount() {
        return this.cancelledCount;
    }

    public CloseWorkflowTodosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloseWorkflowTodosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloseWorkflowTodosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseWorkflowTodosResponseBody setSourceWorkflowId(String sourceWorkflowId) {
        this.sourceWorkflowId = sourceWorkflowId;
        return this;
    }
    public String getSourceWorkflowId() {
        return this.sourceWorkflowId;
    }

}
