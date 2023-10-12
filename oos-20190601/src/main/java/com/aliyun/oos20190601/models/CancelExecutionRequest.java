// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CancelExecutionRequest extends TeaModel {
    /**
     * <p>The ID of the execution.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CancelExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelExecutionRequest self = new CancelExecutionRequest();
        return TeaModel.build(map, self);
    }

    public CancelExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public CancelExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
