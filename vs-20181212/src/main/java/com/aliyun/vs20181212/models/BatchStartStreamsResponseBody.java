// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStartStreamsResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Results list.</p>
     */
    @NameInMap("Results")
    public java.util.List<BatchStartStreamsResponseBodyResults> results;

    public static BatchStartStreamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStartStreamsResponseBody self = new BatchStartStreamsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStartStreamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchStartStreamsResponseBody setResults(java.util.List<BatchStartStreamsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchStartStreamsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchStartStreamsResponseBodyResults extends TeaModel {
        /**
         * <p>Error message for the stream.</p>
         * <blockquote>
         * <p>This field appears only if the stream fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>stream not found</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>Stream ID.</p>
         * 
         * <strong>example:</strong>
         * <p>323*****997-cn-qingdao</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Stream name.</p>
         * 
         * <strong>example:</strong>
         * <p>31000000*****0000002</p>
         */
        @NameInMap("Name")
        public String name;

        public static BatchStartStreamsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchStartStreamsResponseBodyResults self = new BatchStartStreamsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchStartStreamsResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchStartStreamsResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchStartStreamsResponseBodyResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
