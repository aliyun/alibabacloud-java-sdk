// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateVirtualMFADeviceRequest extends TeaModel {
    @NameInMap("VirtualMFADeviceName")
    public String virtualMFADeviceName;

    public static CreateVirtualMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualMFADeviceRequest self = new CreateVirtualMFADeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualMFADeviceRequest setVirtualMFADeviceName(String virtualMFADeviceName) {
        this.virtualMFADeviceName = virtualMFADeviceName;
        return this;
    }
    public String getVirtualMFADeviceName() {
        return this.virtualMFADeviceName;
    }

}
