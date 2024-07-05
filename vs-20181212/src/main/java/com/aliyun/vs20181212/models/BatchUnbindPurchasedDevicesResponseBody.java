// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchUnbindPurchasedDevicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchUnbindPurchasedDevicesResponseBodyResults> results;

    public static BatchUnbindPurchasedDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindPurchasedDevicesResponseBody self = new BatchUnbindPurchasedDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUnbindPurchasedDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUnbindPurchasedDevicesResponseBody setResults(java.util.List<BatchUnbindPurchasedDevicesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchUnbindPurchasedDevicesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchUnbindPurchasedDevicesResponseBodyResults extends TeaModel {
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

        public static BatchUnbindPurchasedDevicesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchUnbindPurchasedDevicesResponseBodyResults self = new BatchUnbindPurchasedDevicesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchUnbindPurchasedDevicesResponseBodyResults setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchUnbindPurchasedDevicesResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

    }

}
