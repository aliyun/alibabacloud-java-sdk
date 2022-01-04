// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentVisualizationMetaRequest extends TeaModel {
    @NameInMap("NodeIds")
    public String nodeIds;

    public static GetExperimentVisualizationMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentVisualizationMetaRequest self = new GetExperimentVisualizationMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentVisualizationMetaRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

}
