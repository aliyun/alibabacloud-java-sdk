// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTerminalResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTerminalResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTerminalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalResponseBody self = new ListTerminalResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTerminalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTerminalResponseBody setData(java.util.List<ListTerminalResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTerminalResponseBodyData> getData() {
        return this.data;
    }

    public ListTerminalResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTerminalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTerminalResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTerminalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTerminalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTerminalResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTerminalResponseBodyData extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("BindUserCount")
        public Integer bindUserCount;

        @NameInMap("BindUserId")
        public String bindUserId;

        @NameInMap("BuildId")
        public String buildId;

        @NameInMap("ClientType")
        public Integer clientType;

        @NameInMap("DesktopId")
        public String desktopId;

        @NameInMap("InManage")
        public Boolean inManage;

        @NameInMap("Ipv4")
        public String ipv4;

        @NameInMap("LastLoginUser")
        @Deprecated
        public String lastLoginUser;

        @NameInMap("LocationInfo")
        public String locationInfo;

        @NameInMap("LockSettings")
        public Boolean lockSettings;

        @NameInMap("LoginUser")
        public String loginUser;

        @NameInMap("Model")
        public String model;

        @NameInMap("OnlineStatus")
        public Boolean onlineStatus;

        @NameInMap("SerialNumber")
        public String serialNumber;

        @NameInMap("TerminalGroupId")
        public String terminalGroupId;

        @NameInMap("Uuid")
        public String uuid;

        public static ListTerminalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTerminalResponseBodyData self = new ListTerminalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTerminalResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListTerminalResponseBodyData setBindUserCount(Integer bindUserCount) {
            this.bindUserCount = bindUserCount;
            return this;
        }
        public Integer getBindUserCount() {
            return this.bindUserCount;
        }

        public ListTerminalResponseBodyData setBindUserId(String bindUserId) {
            this.bindUserId = bindUserId;
            return this;
        }
        public String getBindUserId() {
            return this.bindUserId;
        }

        public ListTerminalResponseBodyData setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public ListTerminalResponseBodyData setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public ListTerminalResponseBodyData setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public ListTerminalResponseBodyData setInManage(Boolean inManage) {
            this.inManage = inManage;
            return this;
        }
        public Boolean getInManage() {
            return this.inManage;
        }

        public ListTerminalResponseBodyData setIpv4(String ipv4) {
            this.ipv4 = ipv4;
            return this;
        }
        public String getIpv4() {
            return this.ipv4;
        }

        public ListTerminalResponseBodyData setLastLoginUser(String lastLoginUser) {
            this.lastLoginUser = lastLoginUser;
            return this;
        }
        public String getLastLoginUser() {
            return this.lastLoginUser;
        }

        public ListTerminalResponseBodyData setLocationInfo(String locationInfo) {
            this.locationInfo = locationInfo;
            return this;
        }
        public String getLocationInfo() {
            return this.locationInfo;
        }

        public ListTerminalResponseBodyData setLockSettings(Boolean lockSettings) {
            this.lockSettings = lockSettings;
            return this;
        }
        public Boolean getLockSettings() {
            return this.lockSettings;
        }

        public ListTerminalResponseBodyData setLoginUser(String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
        public String getLoginUser() {
            return this.loginUser;
        }

        public ListTerminalResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListTerminalResponseBodyData setOnlineStatus(Boolean onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Boolean getOnlineStatus() {
            return this.onlineStatus;
        }

        public ListTerminalResponseBodyData setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public ListTerminalResponseBodyData setTerminalGroupId(String terminalGroupId) {
            this.terminalGroupId = terminalGroupId;
            return this;
        }
        public String getTerminalGroupId() {
            return this.terminalGroupId;
        }

        public ListTerminalResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
