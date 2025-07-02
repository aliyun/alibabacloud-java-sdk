// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListBoundDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListBoundDevicesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBoundDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBoundDevicesResponseBody self = new ListBoundDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBoundDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBoundDevicesResponseBody setData(ListBoundDevicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBoundDevicesResponseBodyData getData() {
        return this.data;
    }

    public ListBoundDevicesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBoundDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBoundDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBoundDevicesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBoundDevicesResponseBodyDataDevices extends TeaModel {
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

        public static ListBoundDevicesResponseBodyDataDevices build(java.util.Map<String, ?> map) throws Exception {
            ListBoundDevicesResponseBodyDataDevices self = new ListBoundDevicesResponseBodyDataDevices();
            return TeaModel.build(map, self);
        }

        public ListBoundDevicesResponseBodyDataDevices setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListBoundDevicesResponseBodyDataDevices setBoundTime(String boundTime) {
            this.boundTime = boundTime;
            return this;
        }
        public String getBoundTime() {
            return this.boundTime;
        }

        public ListBoundDevicesResponseBodyDataDevices setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public ListBoundDevicesResponseBodyDataDevices setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public ListBoundDevicesResponseBodyDataDevices setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListBoundDevicesResponseBodyDataDevices setDeviceMqttConnectionStatus(Integer deviceMqttConnectionStatus) {
            this.deviceMqttConnectionStatus = deviceMqttConnectionStatus;
            return this;
        }
        public Integer getDeviceMqttConnectionStatus() {
            return this.deviceMqttConnectionStatus;
        }

        public ListBoundDevicesResponseBodyDataDevices setDeviceOs(String deviceOs) {
            this.deviceOs = deviceOs;
            return this;
        }
        public String getDeviceOs() {
            return this.deviceOs;
        }

        public ListBoundDevicesResponseBodyDataDevices setDevicePlatform(String devicePlatform) {
            this.devicePlatform = devicePlatform;
            return this;
        }
        public String getDevicePlatform() {
            return this.devicePlatform;
        }

        public ListBoundDevicesResponseBodyDataDevices setInManage(Boolean inManage) {
            this.inManage = inManage;
            return this;
        }
        public Boolean getInManage() {
            return this.inManage;
        }

        public ListBoundDevicesResponseBodyDataDevices setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
            return this;
        }
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        public ListBoundDevicesResponseBodyDataDevices setLastLoginUser(String lastLoginUser) {
            this.lastLoginUser = lastLoginUser;
            return this;
        }
        public String getLastLoginUser() {
            return this.lastLoginUser;
        }

        public ListBoundDevicesResponseBodyDataDevices setLoginUser(String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
        public String getLoginUser() {
            return this.loginUser;
        }

        public ListBoundDevicesResponseBodyDataDevices setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListBoundDevicesResponseBodyDataDevices setPasswordFreeLoginUser(String passwordFreeLoginUser) {
            this.passwordFreeLoginUser = passwordFreeLoginUser;
            return this;
        }
        public String getPasswordFreeLoginUser() {
            return this.passwordFreeLoginUser;
        }

        public ListBoundDevicesResponseBodyDataDevices setPasswordFreeLoginUserNickName(String passwordFreeLoginUserNickName) {
            this.passwordFreeLoginUserNickName = passwordFreeLoginUserNickName;
            return this;
        }
        public String getPasswordFreeLoginUserNickName() {
            return this.passwordFreeLoginUserNickName;
        }

        public ListBoundDevicesResponseBodyDataDevices setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public ListBoundDevicesResponseBodyDataDevices setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListBoundDevicesResponseBodyDataDevices setPublicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }
        public String getPublicIp() {
            return this.publicIp;
        }

        public ListBoundDevicesResponseBodyDataDevices setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public ListBoundDevicesResponseBodyDataDevices setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListBoundDevicesResponseBodyData extends TeaModel {
        @NameInMap("Devices")
        public java.util.List<ListBoundDevicesResponseBodyDataDevices> devices;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBoundDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBoundDevicesResponseBodyData self = new ListBoundDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBoundDevicesResponseBodyData setDevices(java.util.List<ListBoundDevicesResponseBodyDataDevices> devices) {
            this.devices = devices;
            return this;
        }
        public java.util.List<ListBoundDevicesResponseBodyDataDevices> getDevices() {
            return this.devices;
        }

        public ListBoundDevicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBoundDevicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBoundDevicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
