// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListVirtualMFADevicesResponseBody extends TeaModel {
    @NameInMap("VirtualMFADevices")
    public java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevices> virtualMFADevices;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVirtualMFADevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualMFADevicesResponseBody self = new ListVirtualMFADevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualMFADevicesResponseBody setVirtualMFADevices(java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevices> virtualMFADevices) {
        this.virtualMFADevices = virtualMFADevices;
        return this;
    }
    public java.util.List<ListVirtualMFADevicesResponseBodyVirtualMFADevices> getVirtualMFADevices() {
        return this.virtualMFADevices;
    }

    public ListVirtualMFADevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("UserName")
        public String userName;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser self = new ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ListVirtualMFADevicesResponseBodyVirtualMFADevices extends TeaModel {
        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("User")
        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser user;

        @NameInMap("ActivateDate")
        public String activateDate;

        public static ListVirtualMFADevicesResponseBodyVirtualMFADevices build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualMFADevicesResponseBodyVirtualMFADevices self = new ListVirtualMFADevicesResponseBodyVirtualMFADevices();
            return TeaModel.build(map, self);
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevices setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevices setUser(ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser user) {
            this.user = user;
            return this;
        }
        public ListVirtualMFADevicesResponseBodyVirtualMFADevicesUser getUser() {
            return this.user;
        }

        public ListVirtualMFADevicesResponseBodyVirtualMFADevices setActivateDate(String activateDate) {
            this.activateDate = activateDate;
            return this;
        }
        public String getActivateDate() {
            return this.activateDate;
        }

    }

}
