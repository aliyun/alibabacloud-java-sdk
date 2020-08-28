// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VirtualMFADevice")
    @Validation(required = true)
    public CreateVirtualMFADeviceResponseVirtualMFADevice virtualMFADevice;

    public static CreateVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualMFADeviceResponse self = new CreateVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public static class CreateVirtualMFADeviceResponseVirtualMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        @NameInMap("Base32StringSeed")
        @Validation(required = true)
        public String base32StringSeed;

        @NameInMap("QRCodePNG")
        @Validation(required = true)
        public String QRCodePNG;

        public static CreateVirtualMFADeviceResponseVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualMFADeviceResponseVirtualMFADevice self = new CreateVirtualMFADeviceResponseVirtualMFADevice();
            return TeaModel.build(map, self);
        }

    }

}
