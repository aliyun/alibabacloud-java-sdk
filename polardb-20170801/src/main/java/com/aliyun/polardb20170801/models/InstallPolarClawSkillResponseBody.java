// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class InstallPolarClawSkillResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the operation is successful. This parameter is returned when Async is set to false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ok")
    public Boolean ok;

    /**
     * <p>The operation name. This parameter is returned when Async is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>InstallPolarClawSkill</p>
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
     * <p>The identifier of the installed skill. This parameter is returned during synchronous execution.</p>
     * 
     * <strong>example:</strong>
     * <p>alibacloud-rds-copilot</p>
     */
    @NameInMap("Slug")
    public String slug;

    /**
     * <p>The initial state of the task. This parameter is returned when Async is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>pending</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The installation directory. This parameter is returned during synchronous execution.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/node/.openclaw/skills/alibacloud-rds-copilot</p>
     */
    @NameInMap("TargetDir")
    public String targetDir;

    /**
     * <p>The ID of the asynchronous task. This parameter is returned when Async is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>9f1c2e3d-xxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The installed version number. This parameter is returned during synchronous execution.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.0</p>
     */
    @NameInMap("Version")
    public String version;

    public static InstallPolarClawSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallPolarClawSkillResponseBody self = new InstallPolarClawSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallPolarClawSkillResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public InstallPolarClawSkillResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InstallPolarClawSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InstallPolarClawSkillResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public InstallPolarClawSkillResponseBody setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public InstallPolarClawSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallPolarClawSkillResponseBody setSlug(String slug) {
        this.slug = slug;
        return this;
    }
    public String getSlug() {
        return this.slug;
    }

    public InstallPolarClawSkillResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public InstallPolarClawSkillResponseBody setTargetDir(String targetDir) {
        this.targetDir = targetDir;
        return this;
    }
    public String getTargetDir() {
        return this.targetDir;
    }

    public InstallPolarClawSkillResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public InstallPolarClawSkillResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
