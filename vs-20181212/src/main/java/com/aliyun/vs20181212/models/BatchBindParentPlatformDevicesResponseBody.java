// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindParentPlatformDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchBindParentPlatformDevicesResponseBodyResults> results;

    public static BatchBindParentPlatformDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchBindParentPlatformDevicesResponseBody self = new BatchBindParentPlatformDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchBindParentPlatformDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchBindParentPlatformDevicesResponseBody setResults(java.util.List<BatchBindParentPlatformDevicesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchBindParentPlatformDevicesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchBindParentPlatformDevicesResponseBodyResults extends TeaModel {
        @NameInMap("ParentPlatformId")
        public String parentPlatformId;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Error")
        public String error;

        public static BatchBindParentPlatformDevicesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchBindParentPlatformDevicesResponseBodyResults self = new BatchBindParentPlatformDevicesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchBindParentPlatformDevicesResponseBodyResults setParentPlatformId(String parentPlatformId) {
            this.parentPlatformId = parentPlatformId;
            return this;
        }
        public String getParentPlatformId() {
            return this.parentPlatformId;
        }

        public BatchBindParentPlatformDevicesResponseBodyResults setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchBindParentPlatformDevicesResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

    }

}
