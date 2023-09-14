// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneExperimentGroupResponseBody extends TeaModel {
    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    /**
     * <p>Id of the request</p>
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
