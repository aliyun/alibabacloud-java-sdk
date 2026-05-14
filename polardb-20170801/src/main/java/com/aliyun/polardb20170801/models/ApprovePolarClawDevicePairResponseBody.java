// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ApprovePolarClawDevicePairResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-********************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Device")
    public ApprovePolarClawDevicePairResponseBodyDevice device;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>req-abc-123</p>
     */
    @NameInMap("PairRequestId")
    public String pairRequestId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>25C70FF3-D49B-594D-BECE-0DE2BA1D8BBB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApprovePolarClawDevicePairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApprovePolarClawDevicePairResponseBody self = new ApprovePolarClawDevicePairResponseBody();
        return TeaModel.build(map, self);
    }

    public ApprovePolarClawDevicePairResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ApprovePolarClawDevicePairResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ApprovePolarClawDevicePairResponseBody setDevice(ApprovePolarClawDevicePairResponseBodyDevice device) {
        this.device = device;
        return this;
    }
    public ApprovePolarClawDevicePairResponseBodyDevice getDevice() {
        return this.device;
    }

    public ApprovePolarClawDevicePairResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApprovePolarClawDevicePairResponseBody setPairRequestId(String pairRequestId) {
        this.pairRequestId = pairRequestId;
        return this;
    }
    public String getPairRequestId() {
        return this.pairRequestId;
    }

    public ApprovePolarClawDevicePairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ApprovePolarClawDevicePairResponseBodyDevice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1778662316663</p>
         */
        @NameInMap("CreatedAtMs")
        public Long createdAtMs;

        /**
         * <strong>example:</strong>
         * <p>server</p>
         */
        @NameInMap("DeviceFamily")
        public String deviceFamily;

        /**
         * <strong>example:</strong>
         * <p>device-l7rdl36iz6op66zf</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <strong>example:</strong>
         * <p>operator</p>
         */
        @NameInMap("Role")
        public String role;

        @NameInMap("Scopes")
        public java.util.List<String> scopes;

        public static ApprovePolarClawDevicePairResponseBodyDevice build(java.util.Map<String, ?> map) throws Exception {
            ApprovePolarClawDevicePairResponseBodyDevice self = new ApprovePolarClawDevicePairResponseBodyDevice();
            return TeaModel.build(map, self);
        }

        public ApprovePolarClawDevicePairResponseBodyDevice setCreatedAtMs(Long createdAtMs) {
            this.createdAtMs = createdAtMs;
            return this;
        }
        public Long getCreatedAtMs() {
            return this.createdAtMs;
        }

        public ApprovePolarClawDevicePairResponseBodyDevice setDeviceFamily(String deviceFamily) {
            this.deviceFamily = deviceFamily;
            return this;
        }
        public String getDeviceFamily() {
            return this.deviceFamily;
        }

        public ApprovePolarClawDevicePairResponseBodyDevice setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ApprovePolarClawDevicePairResponseBodyDevice setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ApprovePolarClawDevicePairResponseBodyDevice setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ApprovePolarClawDevicePairResponseBodyDevice setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ApprovePolarClawDevicePairResponseBodyDevice setScopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.List<String> getScopes() {
            return this.scopes;
        }

    }

}
