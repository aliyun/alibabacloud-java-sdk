// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BatchResponseBody extends TeaModel {
    @NameInMap("responses")
    public java.util.List<BatchResponseBodyResponses> responses;

    public static BatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchResponseBody self = new BatchResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchResponseBody setResponses(java.util.List<BatchResponseBodyResponses> responses) {
        this.responses = responses;
        return this;
    }
    public java.util.List<BatchResponseBodyResponses> getResponses() {
        return this.responses;
    }

    public static class BatchResponseBodyResponses extends TeaModel {
        @NameInMap("body")
        public java.util.Map<String, String> body;

        @NameInMap("id")
        public String id;

        @NameInMap("status")
        public Integer status;

        public static BatchResponseBodyResponses build(java.util.Map<String, ?> map) throws Exception {
            BatchResponseBodyResponses self = new BatchResponseBodyResponses();
            return TeaModel.build(map, self);
        }

        public BatchResponseBodyResponses setBody(java.util.Map<String, String> body) {
            this.body = body;
            return this;
        }
        public java.util.Map<String, String> getBody() {
            return this.body;
        }

        public BatchResponseBodyResponses setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchResponseBodyResponses setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
