// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneExperimentGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>12A65C6C-AFA1-59B2-9A66-A9E0BB73F0E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloneExperimentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloneExperimentGroupResponseBody self = new CloneExperimentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloneExperimentGroupResponseBody setExperimentGroupId(String experimentGroupId) {
        this.experimentGroupId = experimentGroupId;
        return this;
    }
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    public CloneExperimentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
