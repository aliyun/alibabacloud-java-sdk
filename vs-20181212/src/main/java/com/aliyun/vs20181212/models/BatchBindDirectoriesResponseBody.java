// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindDirectoriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchBindDirectoriesResponseBodyResults> results;

    public static BatchBindDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchBindDirectoriesResponseBody self = new BatchBindDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchBindDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchBindDirectoriesResponseBody setResults(java.util.List<BatchBindDirectoriesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchBindDirectoriesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchBindDirectoriesResponseBodyResults extends TeaModel {
        @NameInMap("Error")
        public String error;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("DeviceId")
        public String deviceId;

        public static BatchBindDirectoriesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchBindDirectoriesResponseBodyResults self = new BatchBindDirectoriesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchBindDirectoriesResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchBindDirectoriesResponseBodyResults setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public BatchBindDirectoriesResponseBodyResults setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

    }

}
