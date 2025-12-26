// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class Flow extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("CodeModeRunInfo")
    public String codeModeRunInfo;

    @NameInMap("CreateFrom")
    public String createFrom;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("FlowStoragePath")
    public String flowStoragePath;

    @NameInMap("FlowTemplateId")
    public String flowTemplateId;

    @NameInMap("FlowType")
    public String flowType;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Runtime")
    public FlowRuntime runtime;

    @NameInMap("RuntimeId")
    public String runtimeId;

    @NameInMap("SourceUri")
    public String sourceUri;

    @NameInMap("Version")
    public String version;

    @NameInMap("WorkDir")
    public String workDir;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Flow build(java.util.Map<String, ?> map) throws Exception {
        Flow self = new Flow();
        return TeaModel.build(map, self);
    }

    public Flow setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Flow setCodeModeRunInfo(String codeModeRunInfo) {
        this.codeModeRunInfo = codeModeRunInfo;
        return this;
    }
    public String getCodeModeRunInfo() {
        return this.codeModeRunInfo;
    }

    public Flow setCreateFrom(String createFrom) {
        this.createFrom = createFrom;
        return this;
    }
    public String getCreateFrom() {
        return this.createFrom;
    }

    public Flow setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Flow setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Flow setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public Flow setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public Flow setFlowStoragePath(String flowStoragePath) {
        this.flowStoragePath = flowStoragePath;
        return this;
    }
    public String getFlowStoragePath() {
        return this.flowStoragePath;
    }

    public Flow setFlowTemplateId(String flowTemplateId) {
        this.flowTemplateId = flowTemplateId;
        return this;
    }
    public String getFlowTemplateId() {
        return this.flowTemplateId;
    }

    public Flow setFlowType(String flowType) {
        this.flowType = flowType;
        return this;
    }
    public String getFlowType() {
        return this.flowType;
    }

    public Flow setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Flow setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Flow setRuntime(FlowRuntime runtime) {
        this.runtime = runtime;
        return this;
    }
    public FlowRuntime getRuntime() {
        return this.runtime;
    }

    public Flow setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public Flow setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }
    public String getSourceUri() {
        return this.sourceUri;
    }

    public Flow setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public Flow setWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }
    public String getWorkDir() {
        return this.workDir;
    }

    public Flow setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class FlowRuntime extends TeaModel {
        /**
         * <p>运行时ID</p>
         */
        @NameInMap("RuntimeId")
        public String runtimeId;

        /**
         * <p>运行时名称</p>
         */
        @NameInMap("RuntimeName")
        public String runtimeName;

        /**
         * <p>运行时状态</p>
         */
        @NameInMap("RuntimeStatus")
        public String runtimeStatus;

        /**
         * <p>运行时类型</p>
         */
        @NameInMap("RuntimeType")
        public String runtimeType;

        /**
         * <p>是否支持SSE</p>
         */
        @NameInMap("SupportSSEStream")
        public Boolean supportSSEStream;

        public static FlowRuntime build(java.util.Map<String, ?> map) throws Exception {
            FlowRuntime self = new FlowRuntime();
            return TeaModel.build(map, self);
        }

        public FlowRuntime setRuntimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }
        public String getRuntimeId() {
            return this.runtimeId;
        }

        public FlowRuntime setRuntimeName(String runtimeName) {
            this.runtimeName = runtimeName;
            return this;
        }
        public String getRuntimeName() {
            return this.runtimeName;
        }

        public FlowRuntime setRuntimeStatus(String runtimeStatus) {
            this.runtimeStatus = runtimeStatus;
            return this;
        }
        public String getRuntimeStatus() {
            return this.runtimeStatus;
        }

        public FlowRuntime setRuntimeType(String runtimeType) {
            this.runtimeType = runtimeType;
            return this;
        }
        public String getRuntimeType() {
            return this.runtimeType;
        }

        public FlowRuntime setSupportSSEStream(Boolean supportSSEStream) {
            this.supportSSEStream = supportSSEStream;
            return this;
        }
        public Boolean getSupportSSEStream() {
            return this.supportSSEStream;
        }

    }

}
