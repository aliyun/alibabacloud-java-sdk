// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListUnbindDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListUnbindDevicesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListUnbindDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnbindDevicesResponseBody self = new ListUnbindDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnbindDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUnbindDevicesResponseBody setData(ListUnbindDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUnbindDevicesResponseBodyData getData() {
        return this.data;
    }

    public ListUnbindDevicesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUnbindDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUnbindDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUnbindDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListUnbindDevicesResponseBodyDataDevices extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("BoundTime")
        public String boundTime;

        @NameInMap("BuildId")
        public String buildId;

        @NameInMap("ClientType")
        public String clientType;

        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("DeviceMqttConnectionStatus")
        public Integer deviceMqttConnectionStatus;

        @NameInMap("DeviceOs")
        public String deviceOs;

        @NameInMap("DevicePlatform")
        public String devicePlatform;

        @NameInMap("InManage")
        public Boolean inManage;

        @NameInMap("LastLoginTime")
        public String lastLoginTime;

        @NameInMap("LastLoginUser")
        public String lastLoginUser;

        @NameInMap("LoginUser")
        public String loginUser;

        @NameInMap("Model")
        public String model;

        @NameInMap("PasswordFreeLoginUser")
        public String passwordFreeLoginUser;

        @NameInMap("PasswordFreeLoginUserNickName")
        public String passwordFreeLoginUserNickName;

        @NameInMap("PrivateIp")
        public String privateIp;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("PublicIp")
        public String publicIp;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("Uuid")
        public String uuid;

        public static ListUnbindDevicesResponseBodyDataDevices build(java.util.Map<String, ?> map) throws Exception {
            ListUnbindDevicesResponseBodyDataDevices self = new ListUnbindDevicesResponseBodyDataDevices();
            return TeaModel.build(map, self);
        }

        public ListUnbindDevicesResponseBodyDataDevices setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListUnbindDevicesResponseBodyDataDevices setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public ListUnbindDevicesResponseBodyDataDevices setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public ListUnbindDevicesResponseBodyDataDevices setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public ListUnbindDevicesResponseBodyDataDevices setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListUnbindDevicesResponseBodyDataDevices setDeviceMqttConnectionStatus(Integer deviceMqttConnectionStatus) {
            this.deviceMqttConnectionStatus = deviceMqttConnectionStatus;
            return this;
        }
        public Integer getDeviceMqttConnectionStatus() {
            return this.deviceMqttConnectionStatus;
        }

        public ListUnbindDevicesResponseBodyDataDevices setDeviceOs(String deviceOs) {
            this.deviceOs = deviceOs;
            return this;
        }
        public String getDeviceOs() {
            return this.deviceOs;
        }

        public ListUnbindDevicesResponseBodyDataDevices setDevicePlatform(String devicePlatform) {
            this.devicePlatform = devicePlatform;
            return this;
        }
        public String getDevicePlatform() {
            return this.devicePlatform;
        }

        public ListUnbindDevicesResponseBodyDataDevices setInManage(Boolean inManage) {
            this.inManage = inManage;
            return this;
        }
        public Boolean getInManage() {
            return this.inManage;
        }

        public ListUnbindDevicesResponseBodyDataDevices setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public ListUnbindDevicesResponseBodyDataDevices setLastLoginUser(String lastLoginUser) {
            this.lastLoginUser = lastLoginUser;
            return this;
        }
        public String getLastLoginUser() {
            return this.lastLoginUser;
        }

        public ListUnbindDevicesResponseBodyDataDevices setLoginUser(String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
        public String getLoginUser() {
            return this.loginUser;
        }

        public ListUnbindDevicesResponseBodyDataDevices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListUnbindDevicesResponseBodyDataDevices setPasswordFreeLoginUser(String passwordFreeLoginUser) {
            this.passwordFreeLoginUser = passwordFreeLoginUser;
            return this;
        }
        public String getPasswordFreeLoginUser() {
            return this.passwordFreeLoginUser;
        }

        public ListUnbindDevicesResponseBodyDataDevices setPasswordFreeLoginUserNickName(String passwordFreeLoginUserNickName) {
            this.passwordFreeLoginUserNickName = passwordFreeLoginUserNickName;
            return this;
        }
        public String getPasswordFreeLoginUserNickName() {
            return this.passwordFreeLoginUserNickName;
        }

        public ListUnbindDevicesResponseBodyDataDevices setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListUnbindDevicesResponseBodyDataDevices setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListUnbindDevicesResponseBodyDataDevices setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListUnbindDevicesResponseBodyDataDevices setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public ListUnbindDevicesResponseBodyDataDevices setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListUnbindDevicesResponseBodyData extends TeaModel {
        @NameInMap("Devices")
        public java.util.List<ListUnbindDevicesResponseBodyDataDevices> devices;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUnbindDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUnbindDevicesResponseBodyData self = new ListUnbindDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUnbindDevicesResponseBodyData setDevices(java.util.List<ListUnbindDevicesResponseBodyDataDevices> devices) {
            this.devices = devices;
            return this;
        }
        public java.util.List<ListUnbindDevicesResponseBodyDataDevices> getDevices() {
            return this.devices;
        }

        public ListUnbindDevicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUnbindDevicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUnbindDevicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
