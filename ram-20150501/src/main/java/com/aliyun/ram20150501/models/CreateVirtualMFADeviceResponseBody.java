// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateVirtualMFADeviceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the MFA device.</p>
     */
    @NameInMap("VirtualMFADevice")
    public CreateVirtualMFADeviceResponseBodyVirtualMFADevice virtualMFADevice;

    public static CreateVirtualMFADeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualMFADeviceResponseBody self = new CreateVirtualMFADeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualMFADeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualMFADeviceResponseBody setVirtualMFADevice(CreateVirtualMFADeviceResponseBodyVirtualMFADevice virtualMFADevice) {
        this.virtualMFADevice = virtualMFADevice;
        return this;
    }
    public CreateVirtualMFADeviceResponseBodyVirtualMFADevice getVirtualMFADevice() {
        return this.virtualMFADevice;
    }

    public static class CreateVirtualMFADeviceResponseBodyVirtualMFADevice extends TeaModel {
        /**
         * <p>The key of the MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>DSF98HAD982KJA9SDFNAS9D8FU839B8ADHBGS****</p>
         */
        @NameInMap("Base32StringSeed")
        public String base32StringSeed;

        /**
         * <p>The Base64-encoded QR code, in the PNG format.</p>
         * 
         * <strong>example:</strong>
         * <p>YXNkZmFzZDlmeW5hc2Q5OGZoODd4bXJmcThhaGU5aSBmYXNkZiBzYWRmIGFGIDRxd2VjIGEgdHEz****</p>
         */
        @NameInMap("QRCodePNG")
        public String QRCodePNG;

        /**
         * <p>The serial number of the MFA device.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:mfa/device001</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        public static CreateVirtualMFADeviceResponseBodyVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualMFADeviceResponseBodyVirtualMFADevice self = new CreateVirtualMFADeviceResponseBodyVirtualMFADevice();
            return TeaModel.build(map, self);
        }

        public CreateVirtualMFADeviceResponseBodyVirtualMFADevice setBase32StringSeed(String base32StringSeed) {
            this.base32StringSeed = base32StringSeed;
            return this;
        }
        public String getBase32StringSeed() {
            return this.base32StringSeed;
        }

        public CreateVirtualMFADeviceResponseBodyVirtualMFADevice setQRCodePNG(String QRCodePNG) {
            this.QRCodePNG = QRCodePNG;
            return this;
        }
        public String getQRCodePNG() {
            return this.QRCodePNG;
        }

        public CreateVirtualMFADeviceResponseBodyVirtualMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

    }

}
