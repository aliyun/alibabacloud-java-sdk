// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStartStreamsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Error")
        public String error;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

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

        public BatchStartStreamsResponseBodyResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchStartStreamsResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
