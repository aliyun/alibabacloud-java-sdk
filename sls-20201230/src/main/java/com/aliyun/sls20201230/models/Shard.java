// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Shard extends TeaModel {
    /**
     * <p>分区的创建时间。UNIX时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。</p>
     * 
     * <strong>example:</strong>
     * <p>1524222931</p>
     */
    @NameInMap("createTime")
    public Integer createTime;

    /**
     * <p>分区结束的Key值。</p>
     * 
     * <strong>example:</strong>
     * <p>8000000000000000000000000000000</p>
     */
    @NameInMap("exclusiveEndKey")
    public String exclusiveEndKey;

    /**
     * <p>Shard起始的Key值，在Shard MD5范围中包含该值。</p>
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
     * <p>Shard状态。创建Shard时，所有Shard状态均为readwrite状态。执行分裂或合并操作后，Shard状态变更为readonly，并生成新的readwrite状态的Shard。Shard状态不影响其数据读取的性能。readwrite状态的Shard可保证数据写入性能，readonly状态的Shard不提供数据写入服务。取值包括：</p>
     * <ul>
     * <li>readwrite（读写）</li>
     * <li>readonly（只读）</li>
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
