// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VirtualMFADevices")
    @Validation(required = true)
    public ListVirtualMFADevicesResponseVirtualMFADevices virtualMFADevices;

    public static ListVirtualMFADevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualMFADevicesResponse self = new ListVirtualMFADevicesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser extends TeaModel {
        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        public static ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser self = new ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser();
            return TeaModel.build(map, self);
        }

    }

    public static class ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice extends TeaModel {
        @NameInMap("SerialNumber")
        @Validation(required = true)
        public String serialNumber;

        @NameInMap("ActivateDate")
        @Validation(required = true)
        public String activateDate;

        @NameInMap("User")
        @Validation(required = true)
        public ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADeviceUser user;

        public static ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice self = new ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice();
            return TeaModel.build(map, self);
        }

    }

    public static class ListVirtualMFADevicesResponseVirtualMFADevices extends TeaModel {
        @NameInMap("VirtualMFADevice")
        @Validation(required = true)
        public java.util.List<ListVirtualMFADevicesResponseVirtualMFADevicesVirtualMFADevice> virtualMFADevice;

        public static ListVirtualMFADevicesResponseVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseVirtualMFADevices self = new ListVirtualMFADevicesResponseVirtualMFADevices();
            return TeaModel.build(map, self);
        }

    }

}
