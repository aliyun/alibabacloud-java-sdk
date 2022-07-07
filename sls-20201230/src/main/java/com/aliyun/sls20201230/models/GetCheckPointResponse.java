// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCheckPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
        // shard id。
        @NameInMap("shard")
        public Integer shard;

        // checkpoint 值。
        @NameInMap("checkpoint")
        public String checkpoint;

        // checkpoint最后的更新时间。Unix时间戳格式，表示从1970-1-1 00:00:00 UTC计算起的秒数。
        @NameInMap("updateTime")
        public Long updateTime;

        // 消费者。
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
