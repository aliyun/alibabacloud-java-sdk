// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>EXECUTE_ALL</p>
     */
    @NameInMap("ExecuteType")
    public String executeType;

    /**
     * <strong>example:</strong>
     * <p>draft-o1p0k444nlq3cd50zz</p>
     */
    @NameInMap("ExperimentId")
    @Deprecated
    public String experimentId;

    /**
     * <strong>example:</strong>
     * <p>id-2d88-1608982098027-91558</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;mlflow&quot;:{&quot;experimentId&quot;:&quot;exp-1&quot;}}</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <strong>example:</strong>
     * <p>draft-o1p0k444nlq3cd50zz</p>
     */
    @NameInMap("PipelineDraftId")
    public String pipelineDraftId;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    @Deprecated
    public CreateJobRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CreateJobRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateJobRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public CreateJobRequest setPipelineDraftId(String pipelineDraftId) {
        this.pipelineDraftId = pipelineDraftId;
        return this;
    }
    public String getPipelineDraftId() {
        return this.pipelineDraftId;
    }

}
