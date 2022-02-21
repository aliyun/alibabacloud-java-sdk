// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindDirectoriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchUnbindDirectoriesResponseBodyResults> results;

    public static BatchUnbindDirectoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindDirectoriesResponseBody self = new BatchUnbindDirectoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUnbindDirectoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUnbindDirectoriesResponseBody setResults(java.util.List<BatchUnbindDirectoriesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchUnbindDirectoriesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchUnbindDirectoriesResponseBodyResults extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("Error")
        public String error;

        public static BatchUnbindDirectoriesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchUnbindDirectoriesResponseBodyResults self = new BatchUnbindDirectoriesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchUnbindDirectoriesResponseBodyResults setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchUnbindDirectoriesResponseBodyResults setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public BatchUnbindDirectoriesResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

    }

}
