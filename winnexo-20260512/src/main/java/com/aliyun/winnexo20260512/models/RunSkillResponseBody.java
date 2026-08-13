// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class RunSkillResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>任务创建时间，ISO8601 UTC 格式</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>异步任务 ID，用于 getSkillRun 查询</p>
     * 
     * <strong>example:</strong>
     * <p>exampleRunId</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>实际执行的技能编码</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillCode")
    public String skillCode;

    /**
     * <p>技能名称</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillName")
    public String skillName;

    /**
     * <p>任务状态：提交即返回 Running</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    public static RunSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunSkillResponseBody self = new RunSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public RunSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunSkillResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public RunSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunSkillResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public RunSkillResponseBody setSkillCode(String skillCode) {
        this.skillCode = skillCode;
        return this;
    }
    public String getSkillCode() {
        return this.skillCode;
    }

    public RunSkillResponseBody setSkillName(String skillName) {
        this.skillName = skillName;
        return this;
    }
    public String getSkillName() {
        return this.skillName;
    }

    public RunSkillResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
