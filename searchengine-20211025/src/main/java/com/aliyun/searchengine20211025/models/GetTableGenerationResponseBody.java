// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetTableGenerationResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetTableGenerationResponseBodyResult result;

    public static GetTableGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableGenerationResponseBody self = new GetTableGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableGenerationResponseBody setResult(GetTableGenerationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetTableGenerationResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetTableGenerationResponseBodyResult extends TeaModel {
        /**
         * <p>generationId</p>
         */
        @NameInMap("generationId")
        public Long generationId;

        /**
         * <p>starting, building, ready, stopped, failed</p>
         */
        @NameInMap("status")
        public String status;

        public static GetTableGenerationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTableGenerationResponseBodyResult self = new GetTableGenerationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTableGenerationResponseBodyResult setGenerationId(Long generationId) {
            this.generationId = generationId;
            return this;
        }
        public Long getGenerationId() {
            return this.generationId;
        }

        public GetTableGenerationResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
