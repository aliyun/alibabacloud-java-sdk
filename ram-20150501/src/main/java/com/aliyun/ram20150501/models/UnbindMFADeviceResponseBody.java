// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UnbindMFADeviceResponseBody extends TeaModel {
    /**
     * <p>The information of the MFA device.</p>
     */
    @NameInMap("MFADevice")
    public UnbindMFADeviceResponseBodyMFADevice MFADevice;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindMFADeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindMFADeviceResponseBody self = new UnbindMFADeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindMFADeviceResponseBody setMFADevice(UnbindMFADeviceResponseBodyMFADevice MFADevice) {
        this.MFADevice = MFADevice;
        return this;
    }
    public UnbindMFADeviceResponseBodyMFADevice getMFADevice() {
        return this.MFADevice;
    }

    public UnbindMFADeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UnbindMFADeviceResponseBodyMFADevice extends TeaModel {
        /**
         * <p>The serial number of the MFA device.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        public static UnbindMFADeviceResponseBodyMFADevice build(java.util.Map<String, ?> map) throws Exception {
            UnbindMFADeviceResponseBodyMFADevice self = new UnbindMFADeviceResponseBodyMFADevice();
            return TeaModel.build(map, self);
        }

        public UnbindMFADeviceResponseBodyMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

}
