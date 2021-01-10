// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipLinkeBahamutPipelinecomponentexecutskipionidRequest extends TeaModel {
    @NameInMap("ComponentExecutionId")
    public String componentExecutionId;

    @NameInMap("ComponentId")
    public String componentId;

    @NameInMap("JobExecutionId")
    public String jobExecutionId;

    @NameInMap("PipelineExecutionId")
    public String pipelineExecutionId;

    @NameInMap("PipelineInstanceId")
    public String pipelineInstanceId;

    public static SkipLinkeBahamutPipelinecomponentexecutskipionidRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipLinkeBahamutPipelinecomponentexecutskipionidRequest self = new SkipLinkeBahamutPipelinecomponentexecutskipionidRequest();
        return TeaModel.build(map, self);
    }

    public SkipLinkeBahamutPipelinecomponentexecutskipionidRequest setComponentExecutionId(String componentExecutionId) {
        this.componentExecutionId = componentExecutionId;
        return this;
    }
    public String getComponentExecutionId() {
        return this.componentExecutionId;
    }

    public SkipLinkeBahamutPipelinecomponentexecutskipionidRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public SkipLinkeBahamutPipelinecomponentexecutskipionidRequest setJobExecutionId(String jobExecutionId) {
        this.jobExecutionId = jobExecutionId;
        return this;
    }
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    public SkipLinkeBahamutPipelinecomponentexecutskipionidRequest setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
        return this;
    }
    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    public SkipLinkeBahamutPipelinecomponentexecutskipionidRequest setPipelineInstanceId(String pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public String getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

}
