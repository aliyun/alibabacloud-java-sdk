// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UnbindMFADeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MFADevice")
    @Validation(required = true)
    public UnbindMFADeviceResponseMFADevice MFADevice;

    public static UnbindMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindMFADeviceResponse self = new UnbindMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public static class UnbindMFADeviceResponseMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        public static UnbindMFADeviceResponseMFADevice build(java.util.Map<String, ?> map) throws Exception {
            UnbindMFADeviceResponseMFADevice self = new UnbindMFADeviceResponseMFADevice();
            return TeaModel.build(map, self);
        }

    }

}
