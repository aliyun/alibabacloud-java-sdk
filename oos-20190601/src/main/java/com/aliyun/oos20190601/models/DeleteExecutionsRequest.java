// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteExecutionsRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("ExecutionIds")
    public String executionIds;

    /**
     * <p>A JSON array that consists of multiple instance IDs. The format of the JSON array is [“xxxxxxxxx”, “yyyyyyyyy”, … “zzzzzzzzz”]. Separate multiple instance IDs with commas (,). A maximum of 100 instance IDs can be specified at a time.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExecutionsRequest self = new DeleteExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExecutionsRequest setExecutionIds(String executionIds) {
        this.executionIds = executionIds;
        return this;
    }
    public String getExecutionIds() {
        return this.executionIds;
    }

    public DeleteExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
