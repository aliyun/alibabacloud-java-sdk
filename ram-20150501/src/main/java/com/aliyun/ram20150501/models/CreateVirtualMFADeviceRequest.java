// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateVirtualMFADeviceRequest extends TeaModel {
    /**
     * <p>The name of the MFA device.</p>
     * <p>The name must be 1 to 64 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>device001</p>
     */
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
