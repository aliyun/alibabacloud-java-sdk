// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStartDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchStartDevicesResponseBodyResults> results;

    public static BatchStartDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStartDevicesResponseBody self = new BatchStartDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStartDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchStartDevicesResponseBody setResults(java.util.List<BatchStartDevicesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchStartDevicesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchStartDevicesResponseBodyResultsStreams extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static BatchStartDevicesResponseBodyResultsStreams build(java.util.Map<String, ?> map) throws Exception {
            BatchStartDevicesResponseBodyResultsStreams self = new BatchStartDevicesResponseBodyResultsStreams();
            return TeaModel.build(map, self);
        }

        public BatchStartDevicesResponseBodyResultsStreams setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchStartDevicesResponseBodyResultsStreams setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchStartDevicesResponseBodyResultsStreams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class BatchStartDevicesResponseBodyResults extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Streams")
        public java.util.List<BatchStartDevicesResponseBodyResultsStreams> streams;

        public static BatchStartDevicesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchStartDevicesResponseBodyResults self = new BatchStartDevicesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchStartDevicesResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchStartDevicesResponseBodyResults setStreams(java.util.List<BatchStartDevicesResponseBodyResultsStreams> streams) {
            this.streams = streams;
            return this;
        }
        public java.util.List<BatchStartDevicesResponseBodyResultsStreams> getStreams() {
            return this.streams;
        }

    }

}
