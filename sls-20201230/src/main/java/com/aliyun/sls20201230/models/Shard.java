// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Shard extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1453949705</p>
     */
    @NameInMap("createTime")
    public Integer createTime;

    /**
     * <strong>example:</strong>
     * <p>8000000000000000000000000000000</p>
     */
    @NameInMap("exclusiveEndKey")
    public String exclusiveEndKey;

    /**
     * <strong>example:</strong>
     * <p>00000000000000000000000000000000</p>
     */
    @NameInMap("inclusiveBeginKey")
    public String inclusiveBeginKey;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("shardID")
    public Integer shardID;

    /**
     * <strong>example:</strong>
     * <p>readwrite</p>
     */
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
