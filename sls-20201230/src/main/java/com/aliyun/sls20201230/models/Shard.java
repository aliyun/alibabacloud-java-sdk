// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Shard extends TeaModel {
    /**
     * <p>The time at which the shard was created. The value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1524222931</p>
     */
    @NameInMap("createTime")
    public Integer createTime;

    /**
     * <p>The end of the MD5 hash range.</p>
     * 
     * <strong>example:</strong>
     * <p>8000000000000000000000000000000</p>
     */
    @NameInMap("exclusiveEndKey")
    public String exclusiveEndKey;

    /**
     * <p>The start of the MD5 hash range. The value is included in the MD5 hash range of the shard.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000000000000000000000000000</p>
     */
    @NameInMap("inclusiveBeginKey")
    public String inclusiveBeginKey;

    /**
     * <p>shard id</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("shardID")
    public Integer shardID;

    /**
     * <p>The status of the shard. After you create a shard, the shard enters the readwrite state. If you split a shard or merge shards, the shard status changes to readonly. The newly generated shards are in the readwrite state. The status of a shard does not affect the performance of read operations that are performed on the shard. Data can be written to the shards that are in the readwrite state, but data cannot be written to the shards that are in the readonly state. Valid values:</p>
     * <ul>
     * <li>readwrite</li>
     * <li>readonly</li>
     * </ul>
     * 
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
