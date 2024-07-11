// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteExecutionsRequest extends TeaModel {
    /**
     * <p>The execution IDs.</p>
     * <p>You can specify multiple execution IDs in a JSON array in the format of <code>[&quot;xxxxxxxxx&quot;, &quot;yyyyyyyyy&quot;, ... &quot;zzzzzzzzz&quot;]</code>. You can specify up to 100 execution IDs at a time. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;exec-xxx&quot;]</p>
     */
    @NameInMap("ExecutionIds")
    public String executionIds;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
