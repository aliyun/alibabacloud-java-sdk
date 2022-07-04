// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Shard extends TeaModel {
    // Shard的创建时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
    @NameInMap("createTime")
    public Integer createTime;

    // 指定Shard范围的结束值，Shard范围中不包含该值。即 shard 包含MD5值在 [inclusiveBeginKey, exclusiveEndKey) 之间的日志。
    @NameInMap("exclusiveEndKey")
    public String exclusiveEndKey;

    // 指定Shard范围的起始值，Shard范围中包含该值。即 shard 包含MD5值在 [inclusiveBeginKey, exclusiveEndKey) 之间的日志。
    @NameInMap("inclusiveBeginKey")
    public String inclusiveBeginKey;

    // shard id
    @NameInMap("shardID")
    public Integer shardID;

    // shard 的读写状态，readwrite 或者 readonly。
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

    public Shard setShardID(Integer shardID) {
        this.shardID = shardID;
        return this;
    }
    public Integer getShardID() {
        return this.shardID;
    }

    public Shard setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
