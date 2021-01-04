// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CancelExecutionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExecutionId")
    public String executionId;

    public static CancelExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelExecutionRequest self = new CancelExecutionRequest();
        return TeaModel.build(map, self);
    }

    public CancelExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

}
