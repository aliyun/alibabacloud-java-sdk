// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConsumerGroupUpdateCheckPointRequest extends TeaModel {
    /**
     * <p>Shard ID。</p>
     */
    @NameInMap("body")
    public java.util.List<ConsumerGroupUpdateCheckPointRequestBody> body;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("consumer")
    public String consumer;

    @NameInMap("forceSuccess")
    public Boolean forceSuccess;

    public static ConsumerGroupUpdateCheckPointRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsumerGroupUpdateCheckPointRequest self = new ConsumerGroupUpdateCheckPointRequest();
        return TeaModel.build(map, self);
    }

    public ConsumerGroupUpdateCheckPointRequest setBody(java.util.List<ConsumerGroupUpdateCheckPointRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ConsumerGroupUpdateCheckPointRequestBody> getBody() {
        return this.body;
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

    public static class ConsumerGroupUpdateCheckPointRequestBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("checkpoint")
        public String checkpoint;

        /**
         * <p>Shard ID。</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("shard")
        public Integer shard;

        public static ConsumerGroupUpdateCheckPointRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ConsumerGroupUpdateCheckPointRequestBody self = new ConsumerGroupUpdateCheckPointRequestBody();
            return TeaModel.build(map, self);
        }

        public ConsumerGroupUpdateCheckPointRequestBody setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public ConsumerGroupUpdateCheckPointRequestBody setShard(Integer shard) {
            this.shard = shard;
            return this;
        }
        public Integer getShard() {
            return this.shard;
        }

    }

}
