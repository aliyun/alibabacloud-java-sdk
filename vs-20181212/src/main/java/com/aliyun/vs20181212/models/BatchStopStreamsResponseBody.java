// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchStopStreamsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchStopStreamsResponseBodyResults> results;

    public static BatchStopStreamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchStopStreamsResponseBody self = new BatchStopStreamsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchStopStreamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchStopStreamsResponseBody setResults(java.util.List<BatchStopStreamsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchStopStreamsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchStopStreamsResponseBodyResults extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static BatchStopStreamsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchStopStreamsResponseBodyResults self = new BatchStopStreamsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchStopStreamsResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchStopStreamsResponseBodyResults setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchStopStreamsResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
