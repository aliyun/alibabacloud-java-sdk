// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteExecutionsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExecutionIds")
    public String executionIds;

    public static DeleteExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExecutionsRequest self = new DeleteExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteExecutionsRequest setExecutionIds(String executionIds) {
        this.executionIds = executionIds;
        return this;
    }
    public String getExecutionIds() {
        return this.executionIds;
    }

}
