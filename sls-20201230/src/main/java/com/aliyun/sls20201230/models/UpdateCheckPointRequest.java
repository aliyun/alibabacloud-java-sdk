// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateCheckPointRequest extends TeaModel {
    // checkpoint值。
    @NameInMap("checkpoint")
    public String checkpoint;

    // shard 的 id。
    @NameInMap("shard")
    public Integer shard;

    // 消费者。
    @NameInMap("consumer")
    public String consumer;

    // 当不指定消费者时，必须指定forceSuccess为true才能更新checkpoint。
    @NameInMap("forceSuccess")
    public Boolean forceSuccess;

    // 固定为 checkpoint。
    @NameInMap("type")
    public String type;

    public static UpdateCheckPointRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckPointRequest self = new UpdateCheckPointRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCheckPointRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public UpdateCheckPointRequest setShard(Integer shard) {
        this.shard = shard;
        return this;
    }
    public Integer getShard() {
        return this.shard;
    }

    public UpdateCheckPointRequest setConsumer(String consumer) {
        this.consumer = consumer;
        return this;
    }
    public String getConsumer() {
        return this.consumer;
    }

    public UpdateCheckPointRequest setForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
        return this;
    }
    public Boolean getForceSuccess() {
        return this.forceSuccess;
    }

    public UpdateCheckPointRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
