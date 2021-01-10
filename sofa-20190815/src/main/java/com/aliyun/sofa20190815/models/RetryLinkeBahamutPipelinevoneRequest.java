// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutPipelinevoneRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public Long executionId;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("PipelineGroupId")
    public String pipelineGroupId;

    @NameInMap("PipelineGroupType")
    public String pipelineGroupType;

    @NameInMap("SkipGetLatestContext")
    public Boolean skipGetLatestContext;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("TenantId")
    public String tenantId;

    public static RetryLinkeBahamutPipelinevoneRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutPipelinevoneRequest self = new RetryLinkeBahamutPipelinevoneRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutPipelinevoneRequest setExecutionId(Long executionId) {
        this.executionId = executionId;
        return this;
    }
    public Long getExecutionId() {
        return this.executionId;
    }

    public RetryLinkeBahamutPipelinevoneRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public RetryLinkeBahamutPipelinevoneRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public RetryLinkeBahamutPipelinevoneRequest setPipelineGroupId(String pipelineGroupId) {
        this.pipelineGroupId = pipelineGroupId;
        return this;
    }
    public String getPipelineGroupId() {
        return this.pipelineGroupId;
    }

    public RetryLinkeBahamutPipelinevoneRequest setPipelineGroupType(String pipelineGroupType) {
        this.pipelineGroupType = pipelineGroupType;
        return this;
    }
    public String getPipelineGroupType() {
        return this.pipelineGroupType;
    }

    public RetryLinkeBahamutPipelinevoneRequest setSkipGetLatestContext(Boolean skipGetLatestContext) {
        this.skipGetLatestContext = skipGetLatestContext;
        return this;
    }
    public Boolean getSkipGetLatestContext() {
        return this.skipGetLatestContext;
    }

    public RetryLinkeBahamutPipelinevoneRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public RetryLinkeBahamutPipelinevoneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
