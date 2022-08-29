// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VirtualMFADevices")
    public ListVirtualMFADevicesResponseBodyVirtualMFADevices virtualMFADevices;

    public static ListVirtualMFADevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualMFADevicesResponseBody self = new ListVirtualMFADevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualMFADevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirtualMFADevicesResponseBody setVirtualMFADevices(ListVirtualMFADevicesResponseBodyVirtualMFADevices virtualMFADevices) {
        this.virtualMFADevices = virtualMFADevices;
        return this;
    }
    public ListVirtualMFADevicesResponseBodyVirtualMFADevices getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser self = new ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice extends TeaModel {
        @NameInMap("ActivateDate")
        public String activateDate;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("User")
        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser user;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice self = new ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice setActivateDate(String activateDate) {
            this.activateDate = activateDate;
            return this;
        }
        public String getActivateDate() {
            return this.activateDate;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice setUser(ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser user) {
            this.user = user;
            return this;
        }
        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADeviceUser getUser() {
            return this.user;
        }

    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevices extends TeaModel {
        @NameInMap("VirtualMFADevice")
        public java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice> virtualMFADevice;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevices self = new ListVirtualMFADevicesResponseBodyVirtualMFADevices();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevices setVirtualMFADevice(java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice> virtualMFADevice) {
            this.virtualMFADevice = virtualMFADevice;
            return this;
        }
        public java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevicesVirtualMFADevice> getVirtualMFADevice() {
            return this.virtualMFADevice;
        }

    }

}
