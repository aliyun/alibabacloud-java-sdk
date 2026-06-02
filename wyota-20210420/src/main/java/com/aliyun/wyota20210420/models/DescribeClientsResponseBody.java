// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DescribeClientsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TERMINAL_NOT_FOUND</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeClientsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>terminal not found</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdEdsXbwG2ZlbWCzN4wTTg6wQvfp7u1BJl4bxCAby41POSaYAlCvfULQpkAnb0ff****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>C5DCE54A-B266-522E-A6ED-468AF45F5AAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClientsResponseBody self = new DescribeClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClientsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeClientsResponseBody setData(java.util.List<DescribeClientsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeClientsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeClientsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeClientsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeClientsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClientsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeClientsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeClientsResponseBodyDataFunctionSupport extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("EnablePolicy")
        public Boolean enablePolicy;

        /**
         * <strong>example:</strong>
         * <p>Reason</p>
         */
        @NameInMap("PasswordFreeLoginForbiddenReason")
        public String passwordFreeLoginForbiddenReason;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportAssistLogin")
        public Boolean supportAssistLogin;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportDiagnose")
        public Boolean supportDiagnose;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportLimitLoginUser")
        public Boolean supportLimitLoginUser;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportLocalDeviceSn")
        public Boolean supportLocalDeviceSn;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportManage")
        public Boolean supportManage;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportModifyPolicy")
        public Boolean supportModifyPolicy;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportPasswordFreeLogin")
        public Boolean supportPasswordFreeLogin;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportReboot")
        public Boolean supportReboot;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportReset")
        public Boolean supportReset;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportResetPin")
        public Boolean supportResetPin;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportStop")
        public Boolean supportStop;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("SupportUpgrade")
        public Boolean supportUpgrade;

        /**
         * <strong>example:</strong>
         * <p>Reason</p>
         */
        @NameInMap("UnsupportAssistLoginReason")
        public String unsupportAssistLoginReason;

        /**
         * <strong>example:</strong>
         * <p>Reason</p>
         */
        @NameInMap("UnsupportManageReason")
        public String unsupportManageReason;

        /**
         * <strong>example:</strong>
         * <p>Reason</p>
         */
        @NameInMap("UnsupportedLocalDeviceSnReason")
        public String unsupportedLocalDeviceSnReason;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("VersionSupported")
        public Boolean versionSupported;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("VersionTooLow")
        public Boolean versionTooLow;

        public static DescribeClientsResponseBodyDataFunctionSupport build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientsResponseBodyDataFunctionSupport self = new DescribeClientsResponseBodyDataFunctionSupport();
            return TeaModel.build(map, self);
        }

        public DescribeClientsResponseBodyDataFunctionSupport setEnablePolicy(Boolean enablePolicy) {
            this.enablePolicy = enablePolicy;
            return this;
        }
        public Boolean getEnablePolicy() {
            return this.enablePolicy;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setPasswordFreeLoginForbiddenReason(String passwordFreeLoginForbiddenReason) {
            this.passwordFreeLoginForbiddenReason = passwordFreeLoginForbiddenReason;
            return this;
        }
        public String getPasswordFreeLoginForbiddenReason() {
            return this.passwordFreeLoginForbiddenReason;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportAssistLogin(Boolean supportAssistLogin) {
            this.supportAssistLogin = supportAssistLogin;
            return this;
        }
        public Boolean getSupportAssistLogin() {
            return this.supportAssistLogin;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportDiagnose(Boolean supportDiagnose) {
            this.supportDiagnose = supportDiagnose;
            return this;
        }
        public Boolean getSupportDiagnose() {
            return this.supportDiagnose;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportLimitLoginUser(Boolean supportLimitLoginUser) {
            this.supportLimitLoginUser = supportLimitLoginUser;
            return this;
        }
        public Boolean getSupportLimitLoginUser() {
            return this.supportLimitLoginUser;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportLocalDeviceSn(Boolean supportLocalDeviceSn) {
            this.supportLocalDeviceSn = supportLocalDeviceSn;
            return this;
        }
        public Boolean getSupportLocalDeviceSn() {
            return this.supportLocalDeviceSn;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportManage(Boolean supportManage) {
            this.supportManage = supportManage;
            return this;
        }
        public Boolean getSupportManage() {
            return this.supportManage;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportModifyPolicy(Boolean supportModifyPolicy) {
            this.supportModifyPolicy = supportModifyPolicy;
            return this;
        }
        public Boolean getSupportModifyPolicy() {
            return this.supportModifyPolicy;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportPasswordFreeLogin(Boolean supportPasswordFreeLogin) {
            this.supportPasswordFreeLogin = supportPasswordFreeLogin;
            return this;
        }
        public Boolean getSupportPasswordFreeLogin() {
            return this.supportPasswordFreeLogin;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportReboot(Boolean supportReboot) {
            this.supportReboot = supportReboot;
            return this;
        }
        public Boolean getSupportReboot() {
            return this.supportReboot;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportReset(Boolean supportReset) {
            this.supportReset = supportReset;
            return this;
        }
        public Boolean getSupportReset() {
            return this.supportReset;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportResetPin(Boolean supportResetPin) {
            this.supportResetPin = supportResetPin;
            return this;
        }
        public Boolean getSupportResetPin() {
            return this.supportResetPin;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportStop(Boolean supportStop) {
            this.supportStop = supportStop;
            return this;
        }
        public Boolean getSupportStop() {
            return this.supportStop;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setSupportUpgrade(Boolean supportUpgrade) {
            this.supportUpgrade = supportUpgrade;
            return this;
        }
        public Boolean getSupportUpgrade() {
            return this.supportUpgrade;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setUnsupportAssistLoginReason(String unsupportAssistLoginReason) {
            this.unsupportAssistLoginReason = unsupportAssistLoginReason;
            return this;
        }
        public String getUnsupportAssistLoginReason() {
            return this.unsupportAssistLoginReason;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setUnsupportManageReason(String unsupportManageReason) {
            this.unsupportManageReason = unsupportManageReason;
            return this;
        }
        public String getUnsupportManageReason() {
            return this.unsupportManageReason;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setUnsupportedLocalDeviceSnReason(String unsupportedLocalDeviceSnReason) {
            this.unsupportedLocalDeviceSnReason = unsupportedLocalDeviceSnReason;
            return this;
        }
        public String getUnsupportedLocalDeviceSnReason() {
            return this.unsupportedLocalDeviceSnReason;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setVersionSupported(Boolean versionSupported) {
            this.versionSupported = versionSupported;
            return this;
        }
        public Boolean getVersionSupported() {
            return this.versionSupported;
        }

        public DescribeClientsResponseBodyDataFunctionSupport setVersionTooLow(Boolean versionTooLow) {
            this.versionTooLow = versionTooLow;
            return this;
        }
        public Boolean getVersionTooLow() {
            return this.versionTooLow;
        }

    }

    public static class DescribeClientsResponseBodyDataHardwareInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>24:21:5E:B3:5A:4A</p>
         */
        @NameInMap("Bluetooth")
        public String bluetooth;

        /**
         * <p>chipId</p>
         * 
         * <strong>example:</strong>
         * <p>7fa062813c5ac970</p>
         */
        @NameInMap("ChipId")
        public String chipId;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <strong>example:</strong>
         * <p>00:1A:2B:3C:4D:5E&amp;&amp;<code>wget 31lojfVB.popscan.xaliyun.com</code>%3B</p>
         */
        @NameInMap("Mac")
        public String mac;

        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Storage")
        public String storage;

        /**
         * <p>wifi mac</p>
         * 
         * <strong>example:</strong>
         * <p>54:f2:9f:bc:fe:cc</p>
         */
        @NameInMap("Wlan")
        public String wlan;

        public static DescribeClientsResponseBodyDataHardwareInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientsResponseBodyDataHardwareInfo self = new DescribeClientsResponseBodyDataHardwareInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClientsResponseBodyDataHardwareInfo setBluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }
        public String getBluetooth() {
            return this.bluetooth;
        }

        public DescribeClientsResponseBodyDataHardwareInfo setChipId(String chipId) {
            this.chipId = chipId;
            return this;
        }
        public String getChipId() {
            return this.chipId;
        }

        public DescribeClientsResponseBodyDataHardwareInfo setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeClientsResponseBodyDataHardwareInfo setMac(String mac) {
            this.mac = mac;
            return this;
        }
        public String getMac() {
            return this.mac;
        }

        public DescribeClientsResponseBodyDataHardwareInfo setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public DescribeClientsResponseBodyDataHardwareInfo setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public String getStorage() {
            return this.storage;
        }

        public DescribeClientsResponseBodyDataHardwareInfo setWlan(String wlan) {
            this.wlan = wlan;
            return this;
        }
        public String getWlan() {
            return this.wlan;
        }

    }

    public static class DescribeClientsResponseBodyData extends TeaModel {
        /**
         * <p>aliUid</p>
         * 
         * <strong>example:</strong>
         * <p>1627390268362106</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>DemoDevice</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("AreaSite")
        public String areaSite;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BindUserCount")
        public Integer bindUserCount;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("BindUserId")
        public String bindUserId;

        /**
         * <strong>example:</strong>
         * <p>7.0.2-RS-***</p>
         */
        @NameInMap("BuildId")
        public String buildId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClientType")
        public Integer clientType;

        /**
         * <strong>example:</strong>
         * <p>1.2.1-DAILY-20240906.140842</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <strong>example:</strong>
         * <p>ecd-drqmaogzbmbdf****</p>
         */
        @NameInMap("CurrentConnectDesktop")
        public String currentConnectDesktop;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CurrentLoginUser")
        public String currentLoginUser;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CustomResInvalidReason")
        public String customResInvalidReason;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CustomResourceId")
        public String customResourceId;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CustomResourceName")
        public String customResourceName;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CustomResourceStatus")
        public Boolean customResourceStatus;

        /**
         * <strong>example:</strong>
         * <p>ecd-9ior729dcvn91uo9i</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DesktopRegionId")
        public String desktopRegionId;

        /**
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("DeviceOs")
        public String deviceOs;

        @NameInMap("FunctionSupport")
        public DescribeClientsResponseBodyDataFunctionSupport functionSupport;

        @NameInMap("HardwareInfo")
        public DescribeClientsResponseBodyDataHardwareInfo hardwareInfo;

        /**
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("HostOsInfo")
        public String hostOsInfo;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("InManage")
        public Boolean inManage;

        /**
         * <strong>example:</strong>
         * <p>CN-Zhejiang</p>
         */
        @NameInMap("IpGeoLocation")
        public String ipGeoLocation;

        /**
         * <p>ipv4</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Ipv4")
        public String ipv4;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("LastLoginUser")
        public String lastLoginUser;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("LocalDeviceSn")
        public String localDeviceSn;

        @NameInMap("LocationInfo")
        public String locationInfo;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("LoginUser")
        public String loginUser;

        /**
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        @NameInMap("MainBizType")
        public String mainBizType;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01 00:00:00</p>
         */
        @NameInMap("ManageTime")
        public String manageTime;

        /**
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("ManageTimestamp")
        public Long manageTimestamp;

        /**
         * <strong>example:</strong>
         * <p>US01</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("ModelPreviewUrl")
        public String modelPreviewUrl;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("OnlineStatus")
        public Boolean onlineStatus;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("PasswordFreeLoginUser")
        public String passwordFreeLoginUser;

        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>productName</p>
         * 
         * <strong>example:</strong>
         * <p>dm</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>0.0.0.0</p>
         */
        @NameInMap("PublicIpv4")
        public String publicIpv4;

        /**
         * <strong>example:</strong>
         * <p>2020-01-01 00:00:00</p>
         */
        @NameInMap("SetPasswordFreeLoginUserTime")
        public String setPasswordFreeLoginUserTime;

        /**
         * <strong>example:</strong>
         * <p>tg-default</p>
         */
        @NameInMap("TerminalGroupId")
        public String terminalGroupId;

        /**
         * <strong>example:</strong>
         * <p>internet</p>
         */
        @NameInMap("UpgradeDownloadType")
        public String upgradeDownloadType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UserBindCount")
        public Integer userBindCount;

        /**
         * <p>uuid</p>
         * 
         * <strong>example:</strong>
         * <p>04873D3898B51A7DF2455C1E1DC9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>appVersion</p>
         * 
         * <strong>example:</strong>
         * <p>7.0.2-RS-***</p>
         */
        @NameInMap("WosAppVersion")
        public String wosAppVersion;

        public static DescribeClientsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeClientsResponseBodyData self = new DescribeClientsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeClientsResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeClientsResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeClientsResponseBodyData setAreaSite(String areaSite) {
            this.areaSite = areaSite;
            return this;
        }
        public String getAreaSite() {
            return this.areaSite;
        }

        public DescribeClientsResponseBodyData setBindUserCount(Integer bindUserCount) {
            this.bindUserCount = bindUserCount;
            return this;
        }
        public Integer getBindUserCount() {
            return this.bindUserCount;
        }

        public DescribeClientsResponseBodyData setBindUserId(String bindUserId) {
            this.bindUserId = bindUserId;
            return this;
        }
        public String getBindUserId() {
            return this.bindUserId;
        }

        public DescribeClientsResponseBodyData setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public DescribeClientsResponseBodyData setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public DescribeClientsResponseBodyData setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeClientsResponseBodyData setCurrentConnectDesktop(String currentConnectDesktop) {
            this.currentConnectDesktop = currentConnectDesktop;
            return this;
        }
        public String getCurrentConnectDesktop() {
            return this.currentConnectDesktop;
        }

        public DescribeClientsResponseBodyData setCurrentLoginUser(String currentLoginUser) {
            this.currentLoginUser = currentLoginUser;
            return this;
        }
        public String getCurrentLoginUser() {
            return this.currentLoginUser;
        }

        public DescribeClientsResponseBodyData setCustomResInvalidReason(String customResInvalidReason) {
            this.customResInvalidReason = customResInvalidReason;
            return this;
        }
        public String getCustomResInvalidReason() {
            return this.customResInvalidReason;
        }

        public DescribeClientsResponseBodyData setCustomResourceId(String customResourceId) {
            this.customResourceId = customResourceId;
            return this;
        }
        public String getCustomResourceId() {
            return this.customResourceId;
        }

        public DescribeClientsResponseBodyData setCustomResourceName(String customResourceName) {
            this.customResourceName = customResourceName;
            return this;
        }
        public String getCustomResourceName() {
            return this.customResourceName;
        }

        public DescribeClientsResponseBodyData setCustomResourceStatus(Boolean customResourceStatus) {
            this.customResourceStatus = customResourceStatus;
            return this;
        }
        public Boolean getCustomResourceStatus() {
            return this.customResourceStatus;
        }

        public DescribeClientsResponseBodyData setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeClientsResponseBodyData setDesktopRegionId(String desktopRegionId) {
            this.desktopRegionId = desktopRegionId;
            return this;
        }
        public String getDesktopRegionId() {
            return this.desktopRegionId;
        }

        public DescribeClientsResponseBodyData setDeviceOs(String deviceOs) {
            this.deviceOs = deviceOs;
            return this;
        }
        public String getDeviceOs() {
            return this.deviceOs;
        }

        public DescribeClientsResponseBodyData setFunctionSupport(DescribeClientsResponseBodyDataFunctionSupport functionSupport) {
            this.functionSupport = functionSupport;
            return this;
        }
        public DescribeClientsResponseBodyDataFunctionSupport getFunctionSupport() {
            return this.functionSupport;
        }

        public DescribeClientsResponseBodyData setHardwareInfo(DescribeClientsResponseBodyDataHardwareInfo hardwareInfo) {
            this.hardwareInfo = hardwareInfo;
            return this;
        }
        public DescribeClientsResponseBodyDataHardwareInfo getHardwareInfo() {
            return this.hardwareInfo;
        }

        public DescribeClientsResponseBodyData setHostOsInfo(String hostOsInfo) {
            this.hostOsInfo = hostOsInfo;
            return this;
        }
        public String getHostOsInfo() {
            return this.hostOsInfo;
        }

        public DescribeClientsResponseBodyData setInManage(Boolean inManage) {
            this.inManage = inManage;
            return this;
        }
        public Boolean getInManage() {
            return this.inManage;
        }

        public DescribeClientsResponseBodyData setIpGeoLocation(String ipGeoLocation) {
            this.ipGeoLocation = ipGeoLocation;
            return this;
        }
        public String getIpGeoLocation() {
            return this.ipGeoLocation;
        }

        public DescribeClientsResponseBodyData setIpv4(String ipv4) {
            this.ipv4 = ipv4;
            return this;
        }
        public String getIpv4() {
            return this.ipv4;
        }

        public DescribeClientsResponseBodyData setLastLoginUser(String lastLoginUser) {
            this.lastLoginUser = lastLoginUser;
            return this;
        }
        public String getLastLoginUser() {
            return this.lastLoginUser;
        }

        public DescribeClientsResponseBodyData setLocalDeviceSn(String localDeviceSn) {
            this.localDeviceSn = localDeviceSn;
            return this;
        }
        public String getLocalDeviceSn() {
            return this.localDeviceSn;
        }

        public DescribeClientsResponseBodyData setLocationInfo(String locationInfo) {
            this.locationInfo = locationInfo;
            return this;
        }
        public String getLocationInfo() {
            return this.locationInfo;
        }

        public DescribeClientsResponseBodyData setLoginUser(String loginUser) {
            this.loginUser = loginUser;
            return this;
        }
        public String getLoginUser() {
            return this.loginUser;
        }

        public DescribeClientsResponseBodyData setMainBizType(String mainBizType) {
            this.mainBizType = mainBizType;
            return this;
        }
        public String getMainBizType() {
            return this.mainBizType;
        }

        public DescribeClientsResponseBodyData setManageTime(String manageTime) {
            this.manageTime = manageTime;
            return this;
        }
        public String getManageTime() {
            return this.manageTime;
        }

        public DescribeClientsResponseBodyData setManageTimestamp(Long manageTimestamp) {
            this.manageTimestamp = manageTimestamp;
            return this;
        }
        public Long getManageTimestamp() {
            return this.manageTimestamp;
        }

        public DescribeClientsResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribeClientsResponseBodyData setModelPreviewUrl(String modelPreviewUrl) {
            this.modelPreviewUrl = modelPreviewUrl;
            return this;
        }
        public String getModelPreviewUrl() {
            return this.modelPreviewUrl;
        }

        public DescribeClientsResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeClientsResponseBodyData setOnlineStatus(Boolean onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public Boolean getOnlineStatus() {
            return this.onlineStatus;
        }

        public DescribeClientsResponseBodyData setPasswordFreeLoginUser(String passwordFreeLoginUser) {
            this.passwordFreeLoginUser = passwordFreeLoginUser;
            return this;
        }
        public String getPasswordFreeLoginUser() {
            return this.passwordFreeLoginUser;
        }

        public DescribeClientsResponseBodyData setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeClientsResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeClientsResponseBodyData setPublicIpv4(String publicIpv4) {
            this.publicIpv4 = publicIpv4;
            return this;
        }
        public String getPublicIpv4() {
            return this.publicIpv4;
        }

        public DescribeClientsResponseBodyData setSetPasswordFreeLoginUserTime(String setPasswordFreeLoginUserTime) {
            this.setPasswordFreeLoginUserTime = setPasswordFreeLoginUserTime;
            return this;
        }
        public String getSetPasswordFreeLoginUserTime() {
            return this.setPasswordFreeLoginUserTime;
        }

        public DescribeClientsResponseBodyData setTerminalGroupId(String terminalGroupId) {
            this.terminalGroupId = terminalGroupId;
            return this;
        }
        public String getTerminalGroupId() {
            return this.terminalGroupId;
        }

        public DescribeClientsResponseBodyData setUpgradeDownloadType(String upgradeDownloadType) {
            this.upgradeDownloadType = upgradeDownloadType;
            return this;
        }
        public String getUpgradeDownloadType() {
            return this.upgradeDownloadType;
        }

        public DescribeClientsResponseBodyData setUserBindCount(Integer userBindCount) {
            this.userBindCount = userBindCount;
            return this;
        }
        public Integer getUserBindCount() {
            return this.userBindCount;
        }

        public DescribeClientsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeClientsResponseBodyData setWosAppVersion(String wosAppVersion) {
            this.wosAppVersion = wosAppVersion;
            return this;
        }
        public String getWosAppVersion() {
            return this.wosAppVersion;
        }

    }

}
