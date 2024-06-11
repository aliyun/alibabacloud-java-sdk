// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the MFA device that is attached to the RAM user.</p>
     */
    @NameInMap("MFADevice")
    public GetUserMFAInfoResponseBodyMFADevice MFADevice;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserMFAInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAInfoResponseBody self = new GetUserMFAInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserMFAInfoResponseBody setMFADevice(GetUserMFAInfoResponseBodyMFADevice MFADevice) {
        this.MFADevice = MFADevice;
        return this;
    }
    public GetUserMFAInfoResponseBodyMFADevice getMFADevice() {
        return this.MFADevice;
    }

    public GetUserMFAInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserMFAInfoResponseBodyMFADevice extends TeaModel {
        /**
         * <p>The serial number of the MFA device.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The type of the MFA device. Valid values:</p>
         * <br>
         * <p>*   VMFA: virtual MFA device</p>
         * <p>*   U2F: Universal 2nd Factor (U2F) security key</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetUserMFAInfoResponseBodyMFADevice build(java.util.Map<String, ?> map) throws Exception {
            GetUserMFAInfoResponseBodyMFADevice self = new GetUserMFAInfoResponseBodyMFADevice();
            return TeaModel.build(map, self);
        }

        public GetUserMFAInfoResponseBodyMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public GetUserMFAInfoResponseBodyMFADevice setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
