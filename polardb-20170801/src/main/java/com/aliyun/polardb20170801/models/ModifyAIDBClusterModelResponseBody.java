// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAIDBClusterModelResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is a dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The model type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("ModelType")
    public String modelType;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3AA6E0E4-1234-5678-90AB-1234567890AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resolved target model name.</p>
     * 
     * <strong>example:</strong>
     * <p>Qwen3-32B</p>
     */
    @NameInMap("TargetModelName")
    public String targetModelName;

    /**
     * <p>The resolved target OSS path.</p>
     * 
     * <strong>example:</strong>
     * <p>/my-model-bucket/models/qwen3</p>
     */
    @NameInMap("TargetOssPath")
    public String targetOssPath;

    /**
     * <p>The ID of the asynchronous task. This parameter is empty when DryRun is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    /**
     * <p>The number of change batches.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalBatches")
    public Long totalBatches;

    /**
     * <p>The number of affected model service instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalMsds")
    public Long totalMsds;

    /**
     * <p>The change warnings returned by the upstream service. The caller must display these warnings.</p>
     */
    @NameInMap("Warnings")
    public java.util.List<String> warnings;

    public static ModifyAIDBClusterModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAIDBClusterModelResponseBody self = new ModifyAIDBClusterModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAIDBClusterModelResponseBody setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyAIDBClusterModelResponseBody setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public ModifyAIDBClusterModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyAIDBClusterModelResponseBody setTargetModelName(String targetModelName) {
        this.targetModelName = targetModelName;
        return this;
    }
    public String getTargetModelName() {
        return this.targetModelName;
    }

    public ModifyAIDBClusterModelResponseBody setTargetOssPath(String targetOssPath) {
        this.targetOssPath = targetOssPath;
        return this;
    }
    public String getTargetOssPath() {
        return this.targetOssPath;
    }

    public ModifyAIDBClusterModelResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public ModifyAIDBClusterModelResponseBody setTotalBatches(Long totalBatches) {
        this.totalBatches = totalBatches;
        return this;
    }
    public Long getTotalBatches() {
        return this.totalBatches;
    }

    public ModifyAIDBClusterModelResponseBody setTotalMsds(Long totalMsds) {
        this.totalMsds = totalMsds;
        return this;
    }
    public Long getTotalMsds() {
        return this.totalMsds;
    }

    public ModifyAIDBClusterModelResponseBody setWarnings(java.util.List<String> warnings) {
        this.warnings = warnings;
        return this;
    }
    public java.util.List<String> getWarnings() {
        return this.warnings;
    }

}
