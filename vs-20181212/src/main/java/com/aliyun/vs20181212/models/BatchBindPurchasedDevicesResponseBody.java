// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchBindPurchasedDevicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<BatchBindPurchasedDevicesResponseBodyResults> results;

    public static BatchBindPurchasedDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchBindPurchasedDevicesResponseBody self = new BatchBindPurchasedDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchBindPurchasedDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchBindPurchasedDevicesResponseBody setResults(java.util.List<BatchBindPurchasedDevicesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<BatchBindPurchasedDevicesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class BatchBindPurchasedDevicesResponseBodyResults extends TeaModel {
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
         * <p>238*****380-cn-qingdao</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("Region")
        public String region;

        public static BatchBindPurchasedDevicesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            BatchBindPurchasedDevicesResponseBodyResults self = new BatchBindPurchasedDevicesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public BatchBindPurchasedDevicesResponseBodyResults setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchBindPurchasedDevicesResponseBodyResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public BatchBindPurchasedDevicesResponseBodyResults setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BatchBindPurchasedDevicesResponseBodyResults setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
