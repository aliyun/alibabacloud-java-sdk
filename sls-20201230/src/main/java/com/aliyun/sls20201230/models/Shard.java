// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Shard extends TeaModel {
    // createTime
    @NameInMap("createTime")
    public Integer createTime;

    // exclusiveEndKey
    @NameInMap("exclusiveEndKey")
    public String exclusiveEndKey;

    // inclusiveBeginKey
    @NameInMap("inclusiveBeginKey")
    public String inclusiveBeginKey;

    // serverIp
    @NameInMap("serverIp")
    public String serverIp;

    // shard id
    @NameInMap("shardId")
    public Integer shardId;

    // status
    @NameInMap("status")
    public String status;

    public static Shard build(java.util.Map<String, ?> map) throws Exception {
        Shard self = new Shard();
        return TeaModel.build(map, self);
    }

    public Shard setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public Shard setExclusiveEndKey(String exclusiveEndKey) {
        this.exclusiveEndKey = exclusiveEndKey;
        return this;
    }
    public String getExclusiveEndKey() {
        return this.exclusiveEndKey;
    }

    public Shard setInclusiveBeginKey(String inclusiveBeginKey) {
        this.inclusiveBeginKey = inclusiveBeginKey;
        return this;
    }
    public String getInclusiveBeginKey() {
        return this.inclusiveBeginKey;
    }

    public Shard setServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }
    public String getServerIp() {
        return this.serverIp;
    }

    public Shard setShardId(Integer shardId) {
        this.shardId = shardId;
        return this;
    }
    public Integer getShardId() {
        return this.shardId;
    }

    public Shard setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
