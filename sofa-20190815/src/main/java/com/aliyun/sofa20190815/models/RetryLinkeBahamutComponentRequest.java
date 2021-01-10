// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutComponentRequest extends TeaModel {
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

    public static RetryLinkeBahamutComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutComponentRequest self = new RetryLinkeBahamutComponentRequest();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutComponentRequest setComponentExecutionId(String componentExecutionId) {
        this.componentExecutionId = componentExecutionId;
        return this;
    }
    public String getComponentExecutionId() {
        return this.componentExecutionId;
    }

    public RetryLinkeBahamutComponentRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public RetryLinkeBahamutComponentRequest setJobExecutionId(Long jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public Long getJobExecutionId() {
        return this.jobExecutionId;
    }

    public RetryLinkeBahamutComponentRequest setPipelineExecutionId(Long pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
        return this;
    }
    public Long getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    public RetryLinkeBahamutComponentRequest setPipelineInstanceId(Long pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public Long getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

    public RetryLinkeBahamutComponentRequest setReRunTestCaseClassesRepeatList(java.util.List<String> reRunTestCaseClassesRepeatList) {
        this.reRunTestCaseClassesRepeatList = reRunTestCaseClassesRepeatList;
        return this;
    }
    public java.util.List<String> getReRunTestCaseClassesRepeatList() {
        return this.reRunTestCaseClassesRepeatList;
    }

    public RetryLinkeBahamutComponentRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
