// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ShardingPolicy extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1764659409</p>
     */
    @NameInMap("queryActiveTime")
    public Long queryActiveTime;

    @NameInMap("shardGroup")
    public ShardingPolicyShardGroup shardGroup;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("shardHash")
    public ShardingPolicyShardHash shardHash;

    public static ShardingPolicy build(java.util.Map<String, ?> map) throws Exception {
        ShardingPolicy self = new ShardingPolicy();
        return TeaModel.build(map, self);
    }

    public ShardingPolicy setQueryActiveTime(Long queryActiveTime) {
        this.queryActiveTime = queryActiveTime;
        return this;
    }
    public Long getQueryActiveTime() {
        return this.queryActiveTime;
    }

    public ShardingPolicy setShardGroup(ShardingPolicyShardGroup shardGroup) {
        this.shardGroup = shardGroup;
        return this;
    }
    public ShardingPolicyShardGroup getShardGroup() {
        return this.shardGroup;
    }

    public ShardingPolicy setShardHash(ShardingPolicyShardHash shardHash) {
        this.shardHash = shardHash;
        return this;
    }
    public ShardingPolicyShardHash getShardHash() {
        return this.shardHash;
    }

    public static class ShardingPolicyShardGroup extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("groupCount")
        public Integer groupCount;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("keys")
        public java.util.List<String> keys;

        public static ShardingPolicyShardGroup build(java.util.Map<String, ?> map) throws Exception {
            ShardingPolicyShardGroup self = new ShardingPolicyShardGroup();
            return TeaModel.build(map, self);
        }

        public ShardingPolicyShardGroup setGroupCount(Integer groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Integer getGroupCount() {
            return this.groupCount;
        }

        public ShardingPolicyShardGroup setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

    }

    public static class ShardingPolicyShardHash extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("keys")
        public java.util.List<String> keys;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("maxHashCount")
        public Integer maxHashCount;

        public static ShardingPolicyShardHash build(java.util.Map<String, ?> map) throws Exception {
            ShardingPolicyShardHash self = new ShardingPolicyShardHash();
            return TeaModel.build(map, self);
        }

        public ShardingPolicyShardHash setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public ShardingPolicyShardHash setMaxHashCount(Integer maxHashCount) {
            this.maxHashCount = maxHashCount;
            return this;
        }
        public Integer getMaxHashCount() {
            return this.maxHashCount;
        }

    }

}
