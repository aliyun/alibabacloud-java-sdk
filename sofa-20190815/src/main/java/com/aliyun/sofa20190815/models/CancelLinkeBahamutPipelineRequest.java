// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelLinkeBahamutPipelineRequest extends TeaModel {
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

    public static CancelLinkeBahamutPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelLinkeBahamutPipelineRequest self = new CancelLinkeBahamutPipelineRequest();
        return TeaModel.build(map, self);
    }

    public CancelLinkeBahamutPipelineRequest setExecutionId(Long executionId) {
        this.executionId = executionId;
        return this;
    }
    public Long getExecutionId() {
        return this.executionId;
    }

    public CancelLinkeBahamutPipelineRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public CancelLinkeBahamutPipelineRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public CancelLinkeBahamutPipelineRequest setPipelineGroupId(String pipelineGroupId) {
        this.pipelineGroupId = pipelineGroupId;
        return this;
    }
    public String getPipelineGroupId() {
        return this.pipelineGroupId;
    }

    public CancelLinkeBahamutPipelineRequest setPipelineGroupType(String pipelineGroupType) {
        this.pipelineGroupType = pipelineGroupType;
        return this;
    }
    public String getPipelineGroupType() {
        return this.pipelineGroupType;
    }

    public CancelLinkeBahamutPipelineRequest setSkipGetLatestContext(Boolean skipGetLatestContext) {
        this.skipGetLatestContext = skipGetLatestContext;
        return this;
    }
    public Boolean getSkipGetLatestContext() {
        return this.skipGetLatestContext;
    }

    public CancelLinkeBahamutPipelineRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public CancelLinkeBahamutPipelineRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
