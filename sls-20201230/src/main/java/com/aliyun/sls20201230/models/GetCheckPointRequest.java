// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCheckPointRequest extends TeaModel {
    /**
     * <p>The shard ID.</p>
     * <ul>
     * <li>If the specified shard does not exist, an empty list is returned.</li>
     * <li>If no shard ID is specified, the checkpoints of all shards are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("shard")
    public Integer shard;

    public static GetCheckPointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckPointRequest self = new GetCheckPointRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckPointRequest setShard(Integer shard) {
        this.shard = shard;
        return this;
    }
    public Integer getShard() {
        return this.shard;
    }

}
