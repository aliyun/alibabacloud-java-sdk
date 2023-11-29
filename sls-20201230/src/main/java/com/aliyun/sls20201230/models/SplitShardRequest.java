// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SplitShardRequest extends TeaModel {
    /**
     * <p>The position where the shard is split.</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The number of new shards that are generated after splitting.</p>
     */
    @NameInMap("shardCount")
    public Integer shardCount;

    public static SplitShardRequest build(java.util.Map<String, ?> map) throws Exception {
        SplitShardRequest self = new SplitShardRequest();
        return TeaModel.build(map, self);
    }

    public SplitShardRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SplitShardRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

}
