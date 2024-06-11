// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of MFA devices.</p>
     */
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
        /**
         * <p>The display name of the RAM user.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The unique ID of the RAM user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The name of the RAM user.</p>
         */
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
        /**
         * <p>The time when the MFA device was enabled.</p>
         */
        @NameInMap("ActivateDate")
        public String activateDate;

        /**
         * <p>The serial number of the MFA device.</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>The basic information of the RAM user to which the MFA device is attached.</p>
         */
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
