// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the MFA device that is bound to the RAM user.</p>
     */
    @NameInMap("MFADevice")
    public GetUserMFAInfoResponseBodyMFADevice MFADevice;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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
         * 
         * <strong>example:</strong>
         * <p>acs:ram::177242285274****:mfa/test</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The type of the MFA device. Valid values:</p>
         * <ul>
         * <li>VMFA: virtual MFA device.</li>
         * <li>U2F: Universal 2nd Factor (U2F) security key.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VMFA</p>
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
