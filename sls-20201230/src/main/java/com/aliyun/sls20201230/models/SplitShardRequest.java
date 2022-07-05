// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SplitShardRequest extends TeaModel {
    // 这里固定为 split。
    @NameInMap("action")
    public String action;

    // 分裂的位置。
    @NameInMap("key")
    public String key;

    // 要分裂成的 shard 数量，默认为 2。
    @NameInMap("shardCount")
    public Integer shardCount;

    public static SplitShardRequest build(java.util.Map<String, ?> map) throws Exception {
        SplitShardRequest self = new SplitShardRequest();
        return TeaModel.build(map, self);
    }

    public SplitShardRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
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
