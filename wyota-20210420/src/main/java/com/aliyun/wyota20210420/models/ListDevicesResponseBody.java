// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListDevicesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesResponseBody self = new ListDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDevicesResponseBody setData(java.util.List<ListDevicesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDevicesResponseBodyData> getData() {
        return this.data;
    }

    public ListDevicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDevicesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDevicesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDevicesResponseBodyDataConnectConfigs extends TeaModel {
        @NameInMap("ConnectScript")
        public String connectScript;

        @NameInMap("PeripheralPid")
        public String peripheralPid;

        @NameInMap("PeripheralVid")
        public String peripheralVid;

        @NameInMap("RedirectPolicy")
        public Integer redirectPolicy;

        public static ListDevicesResponseBodyDataConnectConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyDataConnectConfigs self = new ListDevicesResponseBodyDataConnectConfigs();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyDataConnectConfigs setConnectScript(String connectScript) {
            this.connectScript = connectScript;
            return this;
        }
        public String getConnectScript() {
            return this.connectScript;
        }

        public ListDevicesResponseBodyDataConnectConfigs setPeripheralPid(String peripheralPid) {
            this.peripheralPid = peripheralPid;
            return this;
        }
        public String getPeripheralPid() {
            return this.peripheralPid;
        }

        public ListDevicesResponseBodyDataConnectConfigs setPeripheralVid(String peripheralVid) {
            this.peripheralVid = peripheralVid;
            return this;
        }
        public String getPeripheralVid() {
            return this.peripheralVid;
        }

        public ListDevicesResponseBodyDataConnectConfigs setRedirectPolicy(Integer redirectPolicy) {
            this.redirectPolicy = redirectPolicy;
            return this;
        }
        public Integer getRedirectPolicy() {
            return this.redirectPolicy;
        }

    }

    public static class ListDevicesResponseBodyDataCustomResourcePackage extends TeaModel {
        @NameInMap("ConfigAboutLogo")
        public String configAboutLogo;

        @NameInMap("DesktopWallpaper")
        public String desktopWallpaper;

        @NameInMap("LoginPageBackground")
        public String loginPageBackground;

        @NameInMap("LoginPageLogo")
        public String loginPageLogo;

        @NameInMap("PersonalCenterLogo")
        public String personalCenterLogo;

        @NameInMap("StartLogo")
        public String startLogo;

        @NameInMap("StartMenuLogo")
        public String startMenuLogo;

        @NameInMap("UpgradeLogo")
        public String upgradeLogo;

        public static ListDevicesResponseBodyDataCustomResourcePackage build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyDataCustomResourcePackage self = new ListDevicesResponseBodyDataCustomResourcePackage();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyDataCustomResourcePackage setConfigAboutLogo(String configAboutLogo) {
            this.configAboutLogo = configAboutLogo;
            return this;
        }
        public String getConfigAboutLogo() {
            return this.configAboutLogo;
        }

        public ListDevicesResponseBodyDataCustomResourcePackage setDesktopWallpaper(String desktopWallpaper) {
            this.desktopWallpaper = desktopWallpaper;
            return this;
        }
        public String getDesktopWallpaper() {
            return this.desktopWallpaper;
        }

        public ListDevicesResponseBodyDataCustomResourcePackage setLoginPageBackground(String loginPageBackground) {
            this.loginPageBackground = loginPageBackground;
            return this;
        }
        public String getLoginPageBackground() {
            return this.loginPageBackground;
        }

        public ListDevicesResponseBodyDataCustomResourcePackage setLoginPageLogo(String loginPageLogo) {
            this.loginPageLogo = loginPageLogo;
            return this;
        }
        public String getLoginPageLogo() {
            return this.loginPageLogo;
        }

        public ListDevicesResponseBodyDataCustomResourcePackage setPersonalCenterLogo(String personalCenterLogo) {
            this.personalCenterLogo = personalCenterLogo;
            return this;
        }
        public String getPersonalCenterLogo() {
            return this.personalCenterLogo;
        }

        public ListDevicesResponseBodyDataCustomResourcePackage setStartLogo(String startLogo) {
            this.startLogo = startLogo;
            return this;
        }
        public String getStartLogo() {
            return this.startLogo;
        }

        public ListDevicesResponseBodyDataCustomResourcePackage setStartMenuLogo(String startMenuLogo) {
            this.startMenuLogo = startMenuLogo;
            return this;
        }
        public String getStartMenuLogo() {
            return this.startMenuLogo;
        }

        public ListDevicesResponseBodyDataCustomResourcePackage setUpgradeLogo(String upgradeLogo) {
            this.upgradeLogo = upgradeLogo;
            return this;
        }
        public String getUpgradeLogo() {
            return this.upgradeLogo;
        }

    }

    public static class ListDevicesResponseBodyDataEndUserList extends TeaModel {
        @NameInMap("AdDomain")
        public String adDomain;

        @NameInMap("BindTime")
        public String bindTime;

        @NameInMap("DirectoryId")
        public String directoryId;

        @NameInMap("EndUserId")
        public String endUserId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UserType")
        public String userType;

        public static ListDevicesResponseBodyDataEndUserList build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyDataEndUserList self = new ListDevicesResponseBodyDataEndUserList();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyDataEndUserList setAdDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }
        public String getAdDomain() {
            return this.adDomain;
        }

        public ListDevicesResponseBodyDataEndUserList setBindTime(String bindTime) {
            this.bindTime = bindTime;
            return this;
        }
        public String getBindTime() {
            return this.bindTime;
        }

        public ListDevicesResponseBodyDataEndUserList setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

        public ListDevicesResponseBodyDataEndUserList setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public ListDevicesResponseBodyDataEndUserList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDevicesResponseBodyDataEndUserList setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public ListDevicesResponseBodyDataEndUserList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListDevicesResponseBodyDataEndUserList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

    public static class ListDevicesResponseBodyDataLabelList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("LabelId")
        public String labelId;

        @NameInMap("TenantId")
        public String tenantId;

        public static ListDevicesResponseBodyDataLabelList build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyDataLabelList self = new ListDevicesResponseBodyDataLabelList();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyDataLabelList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListDevicesResponseBodyDataLabelList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDevicesResponseBodyDataLabelList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListDevicesResponseBodyDataLabelList setLabelId(String labelId) {
            this.labelId = labelId;
            return this;
        }
        public String getLabelId() {
            return this.labelId;
        }

        public ListDevicesResponseBodyDataLabelList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class ListDevicesResponseBodyDataPeripheralConfig extends TeaModel {
        @NameInMap("DefaultPolicy")
        public Integer defaultPolicy;

        @NameInMap("PolicyStrategy")
        public Integer policyStrategy;

        @NameInMap("UsbAndInternalCamera")
        public Integer usbAndInternalCamera;

        @NameInMap("UsbPrinter")
        public Integer usbPrinter;

        @NameInMap("UsbStorage")
        public Integer usbStorage;

        public static ListDevicesResponseBodyDataPeripheralConfig build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyDataPeripheralConfig self = new ListDevicesResponseBodyDataPeripheralConfig();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyDataPeripheralConfig setDefaultPolicy(Integer defaultPolicy) {
            this.defaultPolicy = defaultPolicy;
            return this;
        }
        public Integer getDefaultPolicy() {
            return this.defaultPolicy;
        }

        public ListDevicesResponseBodyDataPeripheralConfig setPolicyStrategy(Integer policyStrategy) {
            this.policyStrategy = policyStrategy;
            return this;
        }
        public Integer getPolicyStrategy() {
            return this.policyStrategy;
        }

        public ListDevicesResponseBodyDataPeripheralConfig setUsbAndInternalCamera(Integer usbAndInternalCamera) {
            this.usbAndInternalCamera = usbAndInternalCamera;
            return this;
        }
        public Integer getUsbAndInternalCamera() {
            return this.usbAndInternalCamera;
        }

        public ListDevicesResponseBodyDataPeripheralConfig setUsbPrinter(Integer usbPrinter) {
            this.usbPrinter = usbPrinter;
            return this;
        }
        public Integer getUsbPrinter() {
            return this.usbPrinter;
        }

        public ListDevicesResponseBodyDataPeripheralConfig setUsbStorage(Integer usbStorage) {
            this.usbStorage = usbStorage;
            return this;
        }
        public Integer getUsbStorage() {
            return this.usbStorage;
        }

    }

    public static class ListDevicesResponseBodyData extends TeaModel {
        @NameInMap("ActiveTime")
        public String activeTime;

        @NameInMap("Alias")
        public String alias;

        @NameInMap("AutoLockScreenTime")
        public Integer autoLockScreenTime;

        @NameInMap("AutoLogin")
        public Integer autoLogin;

        @NameInMap("AutoType")
        public String autoType;

        @NameInMap("Bluetooth")
        public String bluetooth;

        @NameInMap("BuildId")
        public String buildId;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientType")
        public String clientType;

        @NameInMap("ConnectConfigs")
        public java.util.List<ListDevicesResponseBodyDataConnectConfigs> connectConfigs;

        @NameInMap("CustomIdleAction")
        public Integer customIdleAction;

        @NameInMap("CustomPowerOn")
        public Integer customPowerOn;

        @NameInMap("CustomProperty")
        public String customProperty;

        @NameInMap("CustomResourcePackage")
        public ListDevicesResponseBodyDataCustomResourcePackage customResourcePackage;

        @NameInMap("DefinePowerButton")
        public Integer definePowerButton;

        @NameInMap("DeviceIpV4")
        public String deviceIpV4;

        @NameInMap("DeviceLock")
        public Integer deviceLock;

        @NameInMap("DeviceMqttConnectionStatus")
        public Integer deviceMqttConnectionStatus;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceOS")
        public String deviceOS;

        @NameInMap("DevicePlatform")
        public String devicePlatform;

        @NameInMap("DisplayLayout")
        public String displayLayout;

        @NameInMap("DisplayResolution")
        public String displayResolution;

        @NameInMap("DisplayScaleRatio")
        public String displayScaleRatio;

        @NameInMap("EnableAdb")
        public Integer enableAdb;

        @NameInMap("EnableAutoLockScreen")
        public Integer enableAutoLockScreen;

        @NameInMap("EnableBluetooth")
        public Integer enableBluetooth;

        @NameInMap("EnableLockScreenPassword")
        public Integer enableLockScreenPassword;

        @NameInMap("EnableModifyPassword")
        public Integer enableModifyPassword;

        @NameInMap("EnableScheduledPowerOff")
        public Integer enableScheduledPowerOff;

        @NameInMap("EnableUnlockPassword")
        public Integer enableUnlockPassword;

        @NameInMap("EnableWlan")
        public Integer enableWlan;

        @NameInMap("EndUserList")
        public java.util.List<ListDevicesResponseBodyDataEndUserList> endUserList;

        @NameInMap("EtherMac")
        public String etherMac;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtSync")
        public String gmtSync;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IdleTime")
        public Integer idleTime;

        @NameInMap("IsActive")
        public String isActive;

        @NameInMap("LabelList")
        public java.util.List<ListDevicesResponseBodyDataLabelList> labelList;

        @NameInMap("LastLoginUser")
        public String lastLoginUser;

        @NameInMap("LocalUsbPrint")
        public Integer localUsbPrint;

        @NameInMap("LocationInfo")
        public String locationInfo;

        @NameInMap("LockPassword")
        public String lockPassword;

        @NameInMap("Model")
        public String model;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PeripheralConfig")
        public ListDevicesResponseBodyDataPeripheralConfig peripheralConfig;

        @NameInMap("ScheduledPowerOff")
        public String scheduledPowerOff;

        @NameInMap("SecureNetworkType")
        public String secureNetworkType;

        @NameInMap("SerialNo")
        public String serialNo;

        @NameInMap("SleepTime")
        public Integer sleepTime;

        @NameInMap("Source")
        public String source;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UsbStorage")
        public Integer usbStorage;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Wlan")
        public String wlan;

        public static ListDevicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDevicesResponseBodyData self = new ListDevicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDevicesResponseBodyData setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public ListDevicesResponseBodyData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListDevicesResponseBodyData setAutoLockScreenTime(Integer autoLockScreenTime) {
            this.autoLockScreenTime = autoLockScreenTime;
            return this;
        }
        public Integer getAutoLockScreenTime() {
            return this.autoLockScreenTime;
        }

        public ListDevicesResponseBodyData setAutoLogin(Integer autoLogin) {
            this.autoLogin = autoLogin;
            return this;
        }
        public Integer getAutoLogin() {
            return this.autoLogin;
        }

        public ListDevicesResponseBodyData setAutoType(String autoType) {
            this.autoType = autoType;
            return this;
        }
        public String getAutoType() {
            return this.autoType;
        }

        public ListDevicesResponseBodyData setBluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }
        public String getBluetooth() {
            return this.bluetooth;
        }

        public ListDevicesResponseBodyData setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public ListDevicesResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListDevicesResponseBodyData setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public ListDevicesResponseBodyData setConnectConfigs(java.util.List<ListDevicesResponseBodyDataConnectConfigs> connectConfigs) {
            this.connectConfigs = connectConfigs;
            return this;
        }
        public java.util.List<ListDevicesResponseBodyDataConnectConfigs> getConnectConfigs() {
            return this.connectConfigs;
        }

        public ListDevicesResponseBodyData setCustomIdleAction(Integer customIdleAction) {
            this.customIdleAction = customIdleAction;
            return this;
        }
        public Integer getCustomIdleAction() {
            return this.customIdleAction;
        }

        public ListDevicesResponseBodyData setCustomPowerOn(Integer customPowerOn) {
            this.customPowerOn = customPowerOn;
            return this;
        }
        public Integer getCustomPowerOn() {
            return this.customPowerOn;
        }

        public ListDevicesResponseBodyData setCustomProperty(String customProperty) {
            this.customProperty = customProperty;
            return this;
        }
        public String getCustomProperty() {
            return this.customProperty;
        }

        public ListDevicesResponseBodyData setCustomResourcePackage(ListDevicesResponseBodyDataCustomResourcePackage customResourcePackage) {
            this.customResourcePackage = customResourcePackage;
            return this;
        }
        public ListDevicesResponseBodyDataCustomResourcePackage getCustomResourcePackage() {
            return this.customResourcePackage;
        }

        public ListDevicesResponseBodyData setDefinePowerButton(Integer definePowerButton) {
            this.definePowerButton = definePowerButton;
            return this;
        }
        public Integer getDefinePowerButton() {
            return this.definePowerButton;
        }

        public ListDevicesResponseBodyData setDeviceIpV4(String deviceIpV4) {
            this.deviceIpV4 = deviceIpV4;
            return this;
        }
        public String getDeviceIpV4() {
            return this.deviceIpV4;
        }

        public ListDevicesResponseBodyData setDeviceLock(Integer deviceLock) {
            this.deviceLock = deviceLock;
            return this;
        }
        public Integer getDeviceLock() {
            return this.deviceLock;
        }

        public ListDevicesResponseBodyData setDeviceMqttConnectionStatus(Integer deviceMqttConnectionStatus) {
            this.deviceMqttConnectionStatus = deviceMqttConnectionStatus;
            return this;
        }
        public Integer getDeviceMqttConnectionStatus() {
            return this.deviceMqttConnectionStatus;
        }

        public ListDevicesResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListDevicesResponseBodyData setDeviceOS(String deviceOS) {
            this.deviceOS = deviceOS;
            return this;
        }
        public String getDeviceOS() {
            return this.deviceOS;
        }

        public ListDevicesResponseBodyData setDevicePlatform(String devicePlatform) {
            this.devicePlatform = devicePlatform;
            return this;
        }
        public String getDevicePlatform() {
            return this.devicePlatform;
        }

        public ListDevicesResponseBodyData setDisplayLayout(String displayLayout) {
            this.displayLayout = displayLayout;
            return this;
        }
        public String getDisplayLayout() {
            return this.displayLayout;
        }

        public ListDevicesResponseBodyData setDisplayResolution(String displayResolution) {
            this.displayResolution = displayResolution;
            return this;
        }
        public String getDisplayResolution() {
            return this.displayResolution;
        }

        public ListDevicesResponseBodyData setDisplayScaleRatio(String displayScaleRatio) {
            this.displayScaleRatio = displayScaleRatio;
            return this;
        }
        public String getDisplayScaleRatio() {
            return this.displayScaleRatio;
        }

        public ListDevicesResponseBodyData setEnableAdb(Integer enableAdb) {
            this.enableAdb = enableAdb;
            return this;
        }
        public Integer getEnableAdb() {
            return this.enableAdb;
        }

        public ListDevicesResponseBodyData setEnableAutoLockScreen(Integer enableAutoLockScreen) {
            this.enableAutoLockScreen = enableAutoLockScreen;
            return this;
        }
        public Integer getEnableAutoLockScreen() {
            return this.enableAutoLockScreen;
        }

        public ListDevicesResponseBodyData setEnableBluetooth(Integer enableBluetooth) {
            this.enableBluetooth = enableBluetooth;
            return this;
        }
        public Integer getEnableBluetooth() {
            return this.enableBluetooth;
        }

        public ListDevicesResponseBodyData setEnableLockScreenPassword(Integer enableLockScreenPassword) {
            this.enableLockScreenPassword = enableLockScreenPassword;
            return this;
        }
        public Integer getEnableLockScreenPassword() {
            return this.enableLockScreenPassword;
        }

        public ListDevicesResponseBodyData setEnableModifyPassword(Integer enableModifyPassword) {
            this.enableModifyPassword = enableModifyPassword;
            return this;
        }
        public Integer getEnableModifyPassword() {
            return this.enableModifyPassword;
        }

        public ListDevicesResponseBodyData setEnableScheduledPowerOff(Integer enableScheduledPowerOff) {
            this.enableScheduledPowerOff = enableScheduledPowerOff;
            return this;
        }
        public Integer getEnableScheduledPowerOff() {
            return this.enableScheduledPowerOff;
        }

        public ListDevicesResponseBodyData setEnableUnlockPassword(Integer enableUnlockPassword) {
            this.enableUnlockPassword = enableUnlockPassword;
            return this;
        }
        public Integer getEnableUnlockPassword() {
            return this.enableUnlockPassword;
        }

        public ListDevicesResponseBodyData setEnableWlan(Integer enableWlan) {
            this.enableWlan = enableWlan;
            return this;
        }
        public Integer getEnableWlan() {
            return this.enableWlan;
        }

        public ListDevicesResponseBodyData setEndUserList(java.util.List<ListDevicesResponseBodyDataEndUserList> endUserList) {
            this.endUserList = endUserList;
            return this;
        }
        public java.util.List<ListDevicesResponseBodyDataEndUserList> getEndUserList() {
            return this.endUserList;
        }

        public ListDevicesResponseBodyData setEtherMac(String etherMac) {
            this.etherMac = etherMac;
            return this;
        }
        public String getEtherMac() {
            return this.etherMac;
        }

        public ListDevicesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListDevicesResponseBodyData setGmtSync(String gmtSync) {
            this.gmtSync = gmtSync;
            return this;
        }
        public String getGmtSync() {
            return this.gmtSync;
        }

        public ListDevicesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDevicesResponseBodyData setIdleTime(Integer idleTime) {
            this.idleTime = idleTime;
            return this;
        }
        public Integer getIdleTime() {
            return this.idleTime;
        }

        public ListDevicesResponseBodyData setIsActive(String isActive) {
            this.isActive = isActive;
            return this;
        }
        public String getIsActive() {
            return this.isActive;
        }

        public ListDevicesResponseBodyData setLabelList(java.util.List<ListDevicesResponseBodyDataLabelList> labelList) {
            this.labelList = labelList;
            return this;
        }
        public java.util.List<ListDevicesResponseBodyDataLabelList> getLabelList() {
            return this.labelList;
        }

        public ListDevicesResponseBodyData setLastLoginUser(String lastLoginUser) {
            this.lastLoginUser = lastLoginUser;
            return this;
        }
        public String getLastLoginUser() {
            return this.lastLoginUser;
        }

        public ListDevicesResponseBodyData setLocalUsbPrint(Integer localUsbPrint) {
            this.localUsbPrint = localUsbPrint;
            return this;
        }
        public Integer getLocalUsbPrint() {
            return this.localUsbPrint;
        }

        public ListDevicesResponseBodyData setLocationInfo(String locationInfo) {
            this.locationInfo = locationInfo;
            return this;
        }
        public String getLocationInfo() {
            return this.locationInfo;
        }

        public ListDevicesResponseBodyData setLockPassword(String lockPassword) {
            this.lockPassword = lockPassword;
            return this;
        }
        public String getLockPassword() {
            return this.lockPassword;
        }

        public ListDevicesResponseBodyData setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListDevicesResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListDevicesResponseBodyData setPeripheralConfig(ListDevicesResponseBodyDataPeripheralConfig peripheralConfig) {
            this.peripheralConfig = peripheralConfig;
            return this;
        }
        public ListDevicesResponseBodyDataPeripheralConfig getPeripheralConfig() {
            return this.peripheralConfig;
        }

        public ListDevicesResponseBodyData setScheduledPowerOff(String scheduledPowerOff) {
            this.scheduledPowerOff = scheduledPowerOff;
            return this;
        }
        public String getScheduledPowerOff() {
            return this.scheduledPowerOff;
        }

        public ListDevicesResponseBodyData setSecureNetworkType(String secureNetworkType) {
            this.secureNetworkType = secureNetworkType;
            return this;
        }
        public String getSecureNetworkType() {
            return this.secureNetworkType;
        }

        public ListDevicesResponseBodyData setSerialNo(String serialNo) {
            this.serialNo = serialNo;
            return this;
        }
        public String getSerialNo() {
            return this.serialNo;
        }

        public ListDevicesResponseBodyData setSleepTime(Integer sleepTime) {
            this.sleepTime = sleepTime;
            return this;
        }
        public Integer getSleepTime() {
            return this.sleepTime;
        }

        public ListDevicesResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListDevicesResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListDevicesResponseBodyData setUsbStorage(Integer usbStorage) {
            this.usbStorage = usbStorage;
            return this;
        }
        public Integer getUsbStorage() {
            return this.usbStorage;
        }

        public ListDevicesResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListDevicesResponseBodyData setWlan(String wlan) {
            this.wlan = wlan;
            return this;
        }
        public String getWlan() {
            return this.wlan;
        }

    }

}
