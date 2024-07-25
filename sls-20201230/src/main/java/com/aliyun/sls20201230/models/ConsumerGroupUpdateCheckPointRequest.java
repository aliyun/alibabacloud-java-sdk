// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConsumerGroupUpdateCheckPointRequest extends TeaModel {
    /**
     * <p>The value of the checkpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MTUyNDE1NTM3OTM3MzkwODQ5Ng==</p>
     */
    @NameInMap("checkpoint")
    public String checkpoint;

    /**
     * <p>The ID of the shard.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("shard")
    public Integer shard;

    /**
     * <p>The consumer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consumer_1</p>
     */
    @NameInMap("consumer")
    public String consumer;

    /**
     * <p>Specifies whether to enable forceful updates. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("forceSuccess")
    public Boolean forceSuccess;

    public static ConsumerGroupUpdateCheckPointRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsumerGroupUpdateCheckPointRequest self = new ConsumerGroupUpdateCheckPointRequest();
        return TeaModel.build(map, self);
    }

    public ConsumerGroupUpdateCheckPointRequest setCheckpoint(String checkpoint) {
        this.checkpoint = checkpoint;
        return this;
    }
    public String getCheckpoint() {
        return this.checkpoint;
    }

    public ConsumerGroupUpdateCheckPointRequest setShard(Integer shard) {
        this.shard = shard;
        return this;
    }
    public Integer getShard() {
        return this.shard;
    }

    public ConsumerGroupUpdateCheckPointRequest setConsumer(String consumer) {
        this.consumer = consumer;
        return this;
    }
    public String getConsumer() {
        return this.consumer;
    }

    public ConsumerGroupUpdateCheckPointRequest setForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
        return this;
    }
    public Boolean getForceSuccess() {
        return this.forceSuccess;
    }

}
