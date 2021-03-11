// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchDeleteDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchDeleteDevicesResponseBodyResults> results;

    public static BatchDeleteDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDevicesResponseBody self = new BatchDeleteDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteDevicesResponseBody setResults(java.util.List<BatchDeleteDevicesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchDeleteDevicesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchDeleteDevicesResponseBodyResults extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("Id")
        public String id;

        public static BatchDeleteDevicesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteDevicesResponseBodyResults self = new BatchDeleteDevicesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchDeleteDevicesResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchDeleteDevicesResponseBodyResults setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
