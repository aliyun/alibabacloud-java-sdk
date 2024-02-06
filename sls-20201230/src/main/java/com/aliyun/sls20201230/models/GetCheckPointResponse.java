// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCheckPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<GetCheckPointResponseBody> body;

    public static GetCheckPointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckPointResponse self = new GetCheckPointResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckPointResponse setBody(java.util.List<GetCheckPointResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<GetCheckPointResponseBody> getBody() {
        return this.body;
    }

    public static class GetCheckPointResponseBody extends TeaModel {
        /**
         * <p>The shard ID.</p>
         */
        @NameInMap("shard")
        public Integer shard;

        /**
         * <p>The value of the checkpoint.</p>
         */
        @NameInMap("checkpoint")
        public String checkpoint;

        /**
         * <p>The time when the checkpoint was last updated. The value is a UNIX timestamp representing the number of seconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>The consumer at the checkpoint.</p>
         */
        @NameInMap("consumer")
        public String consumer;

        public static GetCheckPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
            GetCheckPointResponseBody self = new GetCheckPointResponseBody();
            return TeaModel.build(map, self);
        }

        public GetCheckPointResponseBody setShard(Integer shard) {
            this.shard = shard;
            return this;
        }
        public Integer getShard() {
            return this.shard;
        }

        public GetCheckPointResponseBody setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public GetCheckPointResponseBody setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetCheckPointResponseBody setConsumer(String consumer) {
            this.consumer = consumer;
            return this;
        }
        public String getConsumer() {
            return this.consumer;
        }

    }

}
