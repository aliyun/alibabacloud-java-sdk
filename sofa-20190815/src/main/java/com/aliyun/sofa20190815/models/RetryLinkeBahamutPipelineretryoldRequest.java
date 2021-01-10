// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutPipelineretryoldRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public Long executionId;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("PipelineGroup")
    public String pipelineGroup;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("TenantId")
    public String tenantId;

    public static RetryLinkeBahamutPipelineretryoldRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutPipelineretryoldRequest self = new RetryLinkeBahamutPipelineretryoldRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutPipelineretryoldRequest setExecutionId(Long executionId) {
        this.executionId = executionId;
        return this;
    }
    public Long getExecutionId() {
        return this.executionId;
    }

    public RetryLinkeBahamutPipelineretryoldRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public RetryLinkeBahamutPipelineretryoldRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public RetryLinkeBahamutPipelineretryoldRequest setPipelineGroup(String pipelineGroup) {
        this.pipelineGroup = pipelineGroup;
        return this;
    }
    public String getPipelineGroup() {
        return this.pipelineGroup;
    }

    public RetryLinkeBahamutPipelineretryoldRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public RetryLinkeBahamutPipelineretryoldRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
