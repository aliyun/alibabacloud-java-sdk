// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPipelinererunRequest extends TeaModel {
    @NameInMap("ComponentExecutionId")
    public String componentExecutionId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("JobExecutionId")
    public Long jobExecutionId;

    @NameInMap("PipelineExecutionId")
    public Long pipelineExecutionId;

    @NameInMap("PipelineInstanceId")
    public Long pipelineInstanceId;

    @NameInMap("ReRunTestCaseClassesRepeatList")
    public java.util.List<String> reRunTestCaseClassesRepeatList;

    @NameInMap("StageId")
    public String stageId;

    public static QueryLinkeBahamutPipelinererunRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPipelinererunRequest self = new QueryLinkeBahamutPipelinererunRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPipelinererunRequest setComponentExecutionId(String componentExecutionId) {
        this.componentExecutionId = componentExecutionId;
        return this;
    }
    public String getComponentExecutionId() {
        return this.componentExecutionId;
    }

    public QueryLinkeBahamutPipelinererunRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public QueryLinkeBahamutPipelinererunRequest setJobExecutionId(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public Long getJobExecutionId() {
        return this.jobExecutionId;
    }

    public QueryLinkeBahamutPipelinererunRequest setPipelineExecutionId(Long pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
        return this;
    }
    public Long getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    public QueryLinkeBahamutPipelinererunRequest setPipelineInstanceId(Long pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public Long getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

    public QueryLinkeBahamutPipelinererunRequest setReRunTestCaseClassesRepeatList(java.util.List<String> reRunTestCaseClassesRepeatList) {
        this.reRunTestCaseClassesRepeatList = reRunTestCaseClassesRepeatList;
        return this;
    }
    public java.util.List<String> getReRunTestCaseClassesRepeatList() {
        return this.reRunTestCaseClassesRepeatList;
    }

    public QueryLinkeBahamutPipelinererunRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
