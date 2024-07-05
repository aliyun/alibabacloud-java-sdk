// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindParentPlatformDevicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchUnbindParentPlatformDevicesResponseBodyResults> results;

    public static BatchUnbindParentPlatformDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindParentPlatformDevicesResponseBody self = new BatchUnbindParentPlatformDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUnbindParentPlatformDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUnbindParentPlatformDevicesResponseBody setResults(java.util.List<BatchUnbindParentPlatformDevicesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchUnbindParentPlatformDevicesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchUnbindParentPlatformDevicesResponseBodyResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>some error</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>361*****212-cn-qingdao</p>
         */
        @NameInMap("ParentPlatformId")
        public String parentPlatformId;

        public static BatchUnbindParentPlatformDevicesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchUnbindParentPlatformDevicesResponseBodyResults self = new BatchUnbindParentPlatformDevicesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchUnbindParentPlatformDevicesResponseBodyResults setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchUnbindParentPlatformDevicesResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchUnbindParentPlatformDevicesResponseBodyResults setParentPlatformId(String parentPlatformId) {
            this.parentPlatformId = parentPlatformId;
            return this;
        }
        public String getParentPlatformId() {
            return this.parentPlatformId;
        }

    }

}
