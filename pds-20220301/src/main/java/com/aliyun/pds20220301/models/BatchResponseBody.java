// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BatchResponseBody extends TeaModel {
    /**
     * <p>A collection of responses to the subrequests.</p>
     */
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
        /**
         * <p>The response body of the subrequest. For details, refer to the documentation for the specific API operation.</p>
         */
        @NameInMap("body")
        public java.util.Map<String, ?> body;

        /**
         * <p>The ID of the subrequest that this response corresponds to.</p>
         * 
         * <strong>example:</strong>
         * <p>93433894994ad2e1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The HTTP status code of the subrequest. For details, refer to the documentation for the specific API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("status")
        public Integer status;

        public static BatchResponseBodyResponses build(java.util.Map<String, ?> map) throws Exception {
            BatchResponseBodyResponses self = new BatchResponseBodyResponses();
            return TeaModel.build(map, self);
        }

        public BatchResponseBodyResponses setBody(java.util.Map<String, ?> body) {
            this.body = body;
            return this;
        }
        public java.util.Map<String, ?> getBody() {
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
