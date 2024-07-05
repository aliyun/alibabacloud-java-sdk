// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStopDevicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchStopDevicesResponseBodyResults> results;

    public static BatchStopDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopDevicesResponseBody self = new BatchStopDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchStopDevicesResponseBody setResults(java.util.List<BatchStopDevicesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchStopDevicesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchStopDevicesResponseBodyResultsStreams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Stream not found</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>323884****9092997</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>32388*****39092997</p>
         */
        @NameInMap("Name")
        public String name;

        public static BatchStopDevicesResponseBodyResultsStreams build(java.util.Map<String, ?> map) throws Exception {
            BatchStopDevicesResponseBodyResultsStreams self = new BatchStopDevicesResponseBodyResultsStreams();
            return TeaModel.build(map, self);
        }

        public BatchStopDevicesResponseBodyResultsStreams setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchStopDevicesResponseBodyResultsStreams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchStopDevicesResponseBodyResultsStreams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class BatchStopDevicesResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>32388487****92996</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Streams")
        public java.util.List<BatchStopDevicesResponseBodyResultsStreams> streams;

        public static BatchStopDevicesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchStopDevicesResponseBodyResults self = new BatchStopDevicesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchStopDevicesResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchStopDevicesResponseBodyResults setStreams(java.util.List<BatchStopDevicesResponseBodyResultsStreams> streams) {
            this.streams = streams;
            return this;
        }
        public java.util.List<BatchStopDevicesResponseBodyResultsStreams> getStreams() {
            return this.streams;
        }

    }

}
