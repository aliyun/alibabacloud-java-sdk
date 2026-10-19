// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CloseWorkflowTodosResponseBody extends TeaModel {
    /**
     * <p>关闭条数（幂等重复调用为 0）</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("cancelledCount")
    public Long cancelledCount;

    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>工作流 ID（原样回显）</p>
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
